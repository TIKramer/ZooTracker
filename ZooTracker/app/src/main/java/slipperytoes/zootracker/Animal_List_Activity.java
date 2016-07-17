package slipperytoes.zootracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import slipperytoes.zootracker.Unsorted.Animal;
import slipperytoes.zootracker.Unsorted.AnimalAdapter;
import slipperytoes.zootracker.Unsorted.Carer;
import slipperytoes.zootracker.Unsorted.Diet;
import slipperytoes.zootracker.Unsorted.Enclosure;
import slipperytoes.zootracker.Unsorted.Endangered;
import slipperytoes.zootracker.Unsorted.Location;
import slipperytoes.zootracker.Unsorted.Snake;
import slipperytoes.zootracker.Unsorted.Vemenous;

/**
 * Created by Thomas on 5/07/2016.
 */
public class Animal_List_Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_list);
        //Hard Coded values will have to read from database at later stage
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Enclosure monkeyForest = new Enclosure("Monkey Forest", 20.00, 30, 2, 100, 5, 10);
        Enclosure penguinIsland = new Enclosure("Penguin IsLand", 20.00, 30, 2, 100, 5, 10);
        Carer carer1 = new Carer("Jamie", 22);
        Carer carer2 = new Carer("Jackson", 24);
        String[] food =  new String[] {"Fruits", "plants"};
        Diet herbivoe = new Diet("herbivoe",food);
        Location testLoc = new Location("Australia", "W.A");
        Enclosure[] enclosures = new Enclosure[]{monkeyForest, penguinIsland};
        Carer[] carers = new Carer[]{carer1, carer2};
        Snake name  = new Snake("Jason", monkeyForest, carer1, 20.00, herbivoe, 10.0, 20.0, testLoc, Endangered.ENDANGERED, 20, Vemenous.HIGH);
        Snake name2  = new Snake("Jason", monkeyForest, carer1, 20.00, herbivoe, 10.0, 20.0, testLoc, Endangered.ENDANGERED, 20, Vemenous.HIGH);


        // Construct the ArrayLIst to be passed to AnimalAdapter
        ArrayList<Animal> arrayOfAnimals = new ArrayList<Animal>();

        arrayOfAnimals.add(name);
        arrayOfAnimals.add(name2);
        // Create the adapter
        AnimalAdapter adapter = new AnimalAdapter(this, arrayOfAnimals);
       // Attach the adapter to the animalList listview
        ListView listView = (ListView) findViewById(R.id.animalList);
        listView.setAdapter(adapter);


    }


}