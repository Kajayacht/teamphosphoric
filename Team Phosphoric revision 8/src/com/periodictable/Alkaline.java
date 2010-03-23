package com.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*This is for zooming into the left section of the table containing Alkali Metals,
 * Alkaline Earth Metals, and Hydrogen */

public class Alkaline extends Activity {


	/*Call activity to create the button layout in alkaline.xml */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alkaline);  //Set view to alkaline.xml
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);  //Force landscape mode
		
		/*Button to return to full table view */
		Button zo = (Button) findViewById(R.id.zoomout);
		zo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(Alkaline.this, periodictable.class);
				Alkaline.this.startActivity(myIntent);
			}
		});

	}
}