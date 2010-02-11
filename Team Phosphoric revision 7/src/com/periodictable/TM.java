package com.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TM extends Activity {

	//Your member variable declaration here
	
	// Called when the activity is first created.
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.transitionmetals);
	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	
	Button zo = (Button) findViewById(R.id.zoomout);
    zo.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) 
        {Intent myIntent = new Intent(TM.this, periodictable.class);
        TM.this.startActivity(myIntent);}});
    
    Button Sc = (Button) findViewById(R.id.Sc);
    Sc.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) 
        {Intent myIntent = new Intent(TM.this, Sc.class);
        TM.this.startActivity(myIntent);}});
	}
	}