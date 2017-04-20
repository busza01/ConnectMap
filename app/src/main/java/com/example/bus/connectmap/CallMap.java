package com.example.bus.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    } //onCreate method
    public void runCallMap(View view){
        // inttial view
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
        EditText label = (EditText) findViewById(R.id.mapLabel);

        String lat = latitude.getText().toString().trim();
        String lng = longtitude.getText().toString().trim();
        String mlabel = label.getText().toString().trim();

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.759481,100.541525(ศูนย์รางน้ำ)");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
       // mapIntent.setPackage("com.google.android.apps.maps");//ใช้ไม่ได้กับGenymotion
        startActivity(mapIntent);
    }//runCallMap
}//main class
