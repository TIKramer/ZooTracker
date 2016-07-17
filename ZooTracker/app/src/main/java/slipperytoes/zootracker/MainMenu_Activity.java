package slipperytoes.zootracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

    }

    public void openAnimalPage(View view) {
        Intent intent = new Intent(this, Animals_Menu_Activity.class);
        startActivity(intent);
    }
}