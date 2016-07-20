package slipperytoes.zootracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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

        final Context self = this;

        Button bAddAnimal = (Button) findViewById(R.id.b_add_animal);
        Button bListAnimal = (Button) findViewById(R.id.b_list_animal);

        bAddAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self, Animal_Add_Snake_Activity.class);
                startActivity(intent);
            }
        });

        bListAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self, Animal_List_Activity.class);
                startActivity(intent);
            }
        });
    }

}