package com.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*This is for zooming into the right section of the table containing the
 * Post-Transition Metals, Metalloids, Nonmetals, Halogens, and Noble Gases */

public class Right extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.right);	//Set view to right.xml
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);	//Force landscape mode
	
		/*Button used to zoom back out to full table view */
	Button zo = (Button) findViewById(R.id.zoomout);
    zo.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) 
        {Intent myIntent = new Intent(Right.this, periodictable.class);
        Right.this.startActivity(myIntent);}});

}
}
