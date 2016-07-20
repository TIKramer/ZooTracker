package slipperytoes.zootracker.Unsorted;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import slipperytoes.zootracker.R;

/**
 * Created by Thomas on 5/07/2016.
 */
public class AnimalAdapter extends ArrayAdapter<Animal>
{

    public static class ViewHolder
    {
        TextView animalName;
        TextView animalEnclosure;
    }

    public AnimalAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get the object from this position
        Animal animal = getItem(position);

        ViewHolder viewHolder;

        if (view == null) {

            viewHolder = new ViewHolder();
            view = LayoutInflater.from(getContext()).inflate(R.layout.animal_item, parent, false);

            viewHolder.animalName = (TextView) view.findViewById(R.id.animalName);
            viewHolder.animalEnclosure = (TextView) view.findViewById(R.id.animalEnclosure);

            view.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) view.getTag();
        }

        // Insert data into the textViews using the current object
        viewHolder.animalName.setText(animal.getName());
        viewHolder.animalEnclosure.setText(animal.getEnclosure().toString());
        // Return the new view
        return view;
    }
}