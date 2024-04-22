import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CubeActivity extends AppCompatActivity {

    EditText sideLength;
    TextView result;
    Button calculateVolume, calculateSurfaceArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        sideLength = findViewById(R.id.editTextSideLength);
        result = findViewById(R.id.textViewResult);
        calculateVolume = findViewById(R.id.buttonVolume);
        calculateSurfaceArea = findViewById(R.id.buttonSurfaceArea);

        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double s = Double.parseDouble(sideLength.getText().toString());
                double volume = s * s * s;
                result.setText("Volume: " + volume + " cubic units");
            }
        });

        calculateSurfaceArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double s = Double.parseDouble(sideLength.getText().toString());
                double surfaceArea = 6 * s * s;
                result.setText("Surface Area: " + surfaceArea + " square units");
            }
        });
    }
}
