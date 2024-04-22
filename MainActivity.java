import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArrayList;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();

        shapeArrayList.add(new Shape(R.drawable.sphere, "Sphere"));
        shapeArrayList.add(new Shape(R.drawable.cylinder, "Cylinder"));
        shapeArrayList.add(new Shape(R.drawable.cube, "Cube"));
        shapeArrayList.add(new Shape(R.drawable.prism, "Prism"));

        adapter = new MyCustomAdapter(shapeArrayList, this);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Class<?> activityClass;
                switch(position) {
                    case 1: activityClass = CylinderActivity.class; break;
                    case 2: activityClass = CubeActivity.class; break;
                    case 3: activityClass = PrismActivity.class; break;
                    default: activityClass = SphereActivity.class; // Sphere is default
                }
                Intent intent = new Intent(MainActivity.this, activityClass);
                startActivity(intent);
            }
        });
    }
}
