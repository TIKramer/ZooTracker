package slipperytoes.zootracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Thomas on 5/07/2016.
 */
public class Animals_Menu_Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_menu);

    }

    public void addSnake(View view) {
        Intent intent = new Intent(this, Animal_Add_Snake_Activity.class);
        startActivity(intent);

    }

    public void listAnimals(View view) {
        Intent intent = new Intent(this, Animal_List_Activity.class);
        startActivity(intent);

    }
}