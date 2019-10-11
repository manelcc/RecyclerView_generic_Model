package com.example.exampleinheritancemodelrecyclerview;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        List<ExternModel> valuesList = makeDummyDate();
        List<AnotherModelClass> anotherList = makeDummyDateAnother();
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        AdapterRecycler<ExternModel> adapter = new AdapterRecycler<>(valuesList, new OnEventClickExample() {

            @Override
            public void onEventAction(ModelAdapter items) {
                Log.e("manel", "desde el evento el id es" + ((ExternModel) items).getId());
                if (items instanceof ExternModel) {
                    Log.e("manel", "desde dentro de instaceof" + ((ExternModel) items).getId());
                }
            }
        });

        recycler.setAdapter(adapter);
    }


    private List<ExternModel> makeDummyDate() {
        List<ExternModel> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            ExternModel externModel = new ExternModel();
            externModel.setTitle("titulo " + i);
            externModel.setDescription("descripcion " + i);
            externModel.setId("1" + i);
            list.add(externModel);
        }
        return list;
    }

    private List<AnotherModelClass> makeDummyDateAnother() {
        List<AnotherModelClass> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            AnotherModelClass another = new AnotherModelClass();
            another.setTitulo("titulo " + i);
            another.setDescripcion("descripcion " + i);
            another.setId("1");
            list.add(another);
        }
        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
