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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_list);

    }
}