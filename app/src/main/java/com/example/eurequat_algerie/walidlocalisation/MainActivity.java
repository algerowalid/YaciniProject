package com.example.eurequat_algerie.walidlocalisation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import Traitement.Network;


public class MainActivity extends ActionBarActivity {

    public static Network net;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void choix1(View arg){


        Intent launch  = new Intent(MainActivity.this,choix1.class);
        startActivity(launch);
    }

    public void choix2(View arg){

        String req = "insert into test (nom,valeur)" +
                "Values ('walid',50)";

        net.connection();
        net.query(req);
        net.close();



/*
        Intent launch  = new Intent(MainActivity.this,choix1.class);
        startActivity(launch);
  */  }


}
