package slipperytoes.zootracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Thoma on 3/07/2016.
 */
public class MainMenu_Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final Context self = this;

        TextView tvAnimals = (TextView) findViewById(R.id.tv_animals);

        tvAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO xuatz: not sure if the usage of self is unorthodox in android or not
                Intent intent = new Intent(self, Animals_Menu_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void openAnimalPage(View view) {
        Intent intent = new Intent(this, Animals_Menu_Activity.class);
        startActivity(intent);
    }
}