package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;  // Spotify Streamer
    private Button button2; // Scores App
    private Button button3; // Library App
    private Button button4; // Build it Bigger
    private Button button5; // XYZ Reader
    private Button button6; // Capstone: My Own App

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /* UI components */
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.button:
                    Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Toast.makeText(getApplicationContext(), "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button3:
                    Toast.makeText(getApplicationContext(), "This button will launch Library App!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button4:
                    Toast.makeText(getApplicationContext(), "This button will launch Build it Together!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button5:
                    Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button6:
                    Toast.makeText(getApplicationContext(), "This button will launch Capstone: My Own App!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

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
