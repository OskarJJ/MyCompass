package com.example.oskar.mycompass;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.*;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
protected Vibrator vibe;
    public int i = 0;
    private TextView chatbox;

    public void goToCompass1(View view) {
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);
    }
    public void goToCompass2(View view) {
        Intent intent = new Intent(this, Compass2Activity.class);
        startActivity(intent);
    }
    public void aNow(View view) {
        Intent intent = new Intent(this, AccelerateActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibe = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
        setUpViews();
    }

    private void setUpViews() {
        chatbox = (TextView) findViewById(R.id.textView);
    }



    public void vibrateNow(View view) {
        vibe.vibrate(60*10);// milliseconds (the duration of the vibration)
        i = i + 1;
        chatbox.setText(Integer.toString(i));
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
