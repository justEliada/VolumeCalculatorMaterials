import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrismActivity extends AppCompatActivity {

    EditText width, height, depth;
    TextView result;
    Button calculateVolume, calculateSurfaceArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        width = findViewById(R.id.editTextWidth);
        height = findViewById(R.id.editTextHeight);
        depth = findViewById(R.id.editTextDepth);
        result = findViewById(R.id.textViewResult);
        calculateVolume = findViewById(R.id.buttonVolume);
        calculateSurfaceArea = findViewById(R.id.buttonSurfaceArea);

        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w = Double.parseDouble(width.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double d = Double.parseDouble(depth.getText().toString());
                double volume = w * h * d;
                result.setText("Volume: " + volume + " cubic units");
            }
        });

        calculateSurfaceArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w = Double.parseDouble(width.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double d = Double.parseDouble(depth.getText().toString());
                double surfaceArea = 2 * (w * h + h * d + d * w);
                result.setText("Surface Area: " + surfaceArea + " square units");
            }
        });
    }
}
