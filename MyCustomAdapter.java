import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyCustomAdapter extends BaseAdapter {

    private ArrayList<Shape> shapes;
    private Context context;

    public MyCustomAdapter(ArrayList<Shape> shapes, Context context) {
        this.shapes = shapes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return shapes.size();
    }

    @Override
    public Object getItem(int position) {
        return shapes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.shape_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewShape);
        TextView textView = convertView.findViewById(R.id.textViewShapeName);

        Shape shape = shapes.get(position);
        imageView.setImageResource(shape.getShapeImg());
        textView.setText(shape.getShapeName());

        return convertView;
    }
}
