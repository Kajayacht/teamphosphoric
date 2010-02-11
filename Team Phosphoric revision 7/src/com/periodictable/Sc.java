package com.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sc extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sc);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
		Button zo = (Button) findViewById(R.id.scz);
	    zo.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) 
	        {Intent myIntent = new Intent(Sc.this, TM.class);
	        Sc.this.startActivity(myIntent);}});
	    
	    Button web = (Button) findViewById(R.id.web);
	    web.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) 
	        {String url = "http://www.youtube.com/v/yFuD2JSDueU&color1=0xb1b1b1&color2=0xcfcfcf&hl=en_US&feature=player_embedded&fs=1";
		    Intent i = new Intent(Intent.ACTION_VIEW);
		    i.setData(Uri.parse(url));
		    startActivity(i);
		    }});
	    	    

}
}
