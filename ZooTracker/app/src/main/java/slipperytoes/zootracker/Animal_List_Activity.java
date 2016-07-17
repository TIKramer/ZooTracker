package slipperytoes.zootracker;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

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
public class Animal_List_Activity extends AppCompatActivity {

    // Create the adapter
    AnimalAdapter adapter;

    ArrayList<Animal> arrayOfAnimals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_list);

        final Context self = this;
        Firebase.setAndroidContext(this);

        //Hard Coded values will have to read from database at later stage
        ArrayList<Animal> animals = new ArrayList<Animal>();






        // =======================================

        // Attach the adapter to the animalList listview
        ListView listView = (ListView) findViewById(R.id.animalList);
        adapter = new AnimalAdapter(self, arrayOfAnimals);
        listView.setAdapter(adapter);

        Firebase myFirebaseRef = new Firebase("https://zoo-tracker-3e87d.firebaseio.com/xuatz/dev/random");


        myFirebaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println(snapshot.getValue());

                // Construct the ArrayLIst to be passed to AnimalAdapter
                for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                    // BlogPost post = postSnapshot.getValue(BlogPost.class);
                    // System.out.println(post.getAuthor() + " - " + post.getTitle());

                    System.out.println("postSnapshot.toString(): " + postSnapshot.toString());
                    System.out.println("postSnapshot.getValue(): " + postSnapshot.getValue());

                    Enclosure monkeyForest = new Enclosure("Monkey Forest", 20.00, 30, 2, 100, 5, 10);
                    Enclosure penguinIsland = new Enclosure("Penguin IsLand", 20.00, 30, 2, 100, 5, 10);
                    Carer carer1 = new Carer("Jamie", 22);
                    Carer carer2 = new Carer("Jackson", 24);
                    String[] food =  new String[] {"Fruits", "plants"};
                    Diet herbivoe = new Diet("herbivoe",food);
                    Location testLoc = new Location("Australia", "W.A");
                    Enclosure[] enclosures = new Enclosure[]{monkeyForest, penguinIsland};
                    Carer[] carers = new Carer[]{carer1, carer2};
                    Snake name  = new Snake("Peeedurrrrrr", monkeyForest, carer1, 20.00, herbivoe, 10.0, 20.0, testLoc, Endangered.ENDANGERED, 20, Vemenous.HIGH);
                    Snake name2  = new Snake("Jackyy", monkeyForest, carer1, 20.00, herbivoe, 10.0, 20.0, testLoc, Endangered.ENDANGERED, 20, Vemenous.HIGH);

                    arrayOfAnimals.add(new Snake(postSnapshot.getValue().toString(), monkeyForest, carer1, 20.00, herbivoe, 10.0, 20.0, testLoc, Endangered.ENDANGERED, 20, Vemenous.HIGH));
                }
                adapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });
    }
}