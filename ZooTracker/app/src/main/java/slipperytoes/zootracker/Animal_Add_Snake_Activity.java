package slipperytoes.zootracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
/**
 * Created by Thomas on 29/06/2016.
 */
public class Animal_Add_Snake_Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_add_snake);

        //values
        Enclosure monkeyForest = new Enclosure("Monkey Forest", 20.00, 30, 2, 100, 5, 10);
        Enclosure penguinIsland = new Enclosure("Penguin IsLand", 20.00, 30, 2, 100, 5, 10);
        Carer carer1 = new Carer("Jamie", 22);
        Carer carer2 = new Carer("Jackson", 24);
        String[] food =  new String[] {"Fruits", "plants"};
        Diet herbivoe = new Diet("herbivoe",food);
        Location testLoc = new Location("Australia", "W.A");
        Enclosure[] enclosures = new Enclosure[]{monkeyForest, penguinIsland};
        Carer[] carers = new Carer[]{carer1, carer2};

        //create spinners
        Spinner carerSpinner = (Spinner) findViewById(R.id.carerSpinner);
        Spinner enclosureSpinner = (Spinner) findViewById(R.id.enclosureSpinner);

        //Create buttons
        final Button addAnimal = (Button) findViewById(R.id.addAnimal);

        //Add Values to spinner
        carerSpinner.setAdapter(new ArrayAdapter<Carer>(this, android.R.layout.simple_spinner_item, carers));
       enclosureSpinner.setAdapter(new ArrayAdapter<Enclosure>(this, android.R.layout.simple_spinner_item, enclosures));

        //Buttons listeners
        addAnimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createSnake();
            }
        });
    }

    public void createSnake(){
         //values
        String[] food =  new String[] {"Fruits", "plants"};
        Diet herbivoe = new Diet("herbivoe",food);
        Location testLoc = new Location("Australia", "W.A");

        //create spinners
        Spinner carerSpinner = (Spinner) findViewById(R.id.carerSpinner);
        Spinner enclosureSpinner = (Spinner) findViewById(R.id.enclosureSpinner);



        //Give spinners items
        Carer carer = (Carer) ( (Spinner) findViewById(R.id.carerSpinner) ).getSelectedItem();
        Enclosure enclosure = (Enclosure) ( (Spinner) findViewById(R.id.enclosureSpinner) ).getSelectedItem();

        //Crate a snake
        Snake name  = new Snake("Jason", enclosure, carer, 20.00, herbivoe, 10.0, 20.0, testLoc, Endangered.ENDANGERED, 20, Vemenous.HIGH);


    }


}