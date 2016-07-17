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
    public AnimalAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get the object from this position
        Animal animal = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.animal_item, parent, false);
        }
        // Lookup textViews
        TextView animalName = (TextView) view.findViewById(R.id.animalName);
        TextView animalEnclosure = (TextView) view.findViewById(R.id.animalEnclosure);

        // Insert data into the textViews using the current object
        animalName.setText(animal.getName());
        animalEnclosure.setText(animal.getEnclosure().toString());
        // Return the new view
        return view;
    }
}