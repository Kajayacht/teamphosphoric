package com.periodictable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class periodictable extends Activity{
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button Welcome = (Button) findViewById(R.id.welcome);
        Welcome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) 
            {setContentView(R.layout.transitionmetals);}});

        
        
    }
    
}

