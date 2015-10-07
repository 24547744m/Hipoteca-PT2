package com.diego;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etPreu;
    EditText etEstalvis;
    EditText etPlazo;
    EditText etEuribor;
    EditText diferencial;
    TextView tvMes;
    TextView tvTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPreu = (EditText) findViewById(R.id.etPreuInmob);
        etEstalvis = (EditText) findViewById(R.id.etEstalvis);
        etPlazo = (EditText) findViewById(R.id.etPlazo);
        etEuribor = (EditText) findViewById(R.id.etEuribor);
        diferencial = (EditText) findViewById(R.id.etDifer);
        tvMes = (TextView) findViewById(R.id.tvMes);
        tvTotal = (TextView) findViewById(R.id.tvTotal);

        tvMes.setText("0");
        tvTotal.setText("0");

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

    public void calculaImport(View v) {

//        Toast t = Toast.makeText(this, "HOLAAAAAAAAAAAAAAA", Toast.LENGTH_SHORT);
//        t.show();




    }


}
