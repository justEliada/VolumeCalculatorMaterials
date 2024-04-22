import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CylinderActivity extends AppCompatActivity {

    EditText height, radius;
    TextView result;
    Button calculateVolume, calculateSurfaceArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        height = findViewById(R.id.editTextHeight);
        radius = findViewById(R.id.editTextRadius);
        result = findViewById(R.id.textViewResult);
        calculateVolume = findViewById(R.id.buttonVolume);
        calculateSurfaceArea = findViewById(R.id.buttonSurfaceArea);

        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(height.getText().toString());
                double r = Double.parseDouble(radius.getText().toString());
                double volume = Math.PI * r * r * h;
                result.setText("Volume: " + volume + " cubic units");
            }
        });

        calculateSurfaceArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(height.getText().toString());
                double r = Double.parseDouble(radius.getText().toString());
                double surfaceArea = 2 * Math.PI * r * (r + h);
                result.setText("Surface Area: " + surfaceArea + " square units");
            }
        });
    }
}
