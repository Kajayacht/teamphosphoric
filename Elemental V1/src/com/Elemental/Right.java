package com.Elemental;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*This is for zooming into the right section of the table containing the
 * Post-Transition Metals, Metalloids, Nonmetals, Halogens, and Noble Gases */

public class Right extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.right); // Set view to right.xml
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // Force
		// landscape
		// mode

		/* Button used to zoom back out to full table view */
		Button zo = (Button) findViewById(R.id.zoomout);
		zo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

	}

	public String getParsedMyXML(String el) throws Exception {
		StringBuffer inLine = new StringBuffer();
		/* Get a SAXParser from the SAXPArserFactory. */
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();

		/* Get the XMLReader of the SAXParser */
		XMLReader xr = sp.getXMLReader();
		/* Create a new ContentHandler and apply it to the XML-Reader */
		XMLHandler myExampleHandler = new XMLHandler();
		myExampleHandler.setel(el);
		xr.setContentHandler(myExampleHandler);
		/* Load xml file from raw folder */
		InputStream in = this.getResources().openRawResource(R.raw.myxml);
		/* Begin parsing */
		xr.parse(new InputSource(in));
		XMLDataSet parsedExampleDataSet = myExampleHandler.getParsedData();
		inLine.append(parsedExampleDataSet.toString());
		in.close();
		return inLine.toString();

	}

	public String getvidurl(String el) throws Exception {
		StringBuffer inLine = new StringBuffer();
		/* Get a SAXParser from the SAXPArserFactory. */
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();

		/* Get the XMLReader of the SAXParser */
		XMLReader xr = sp.getXMLReader();
		/* Create a new ContentHandler and apply it to the XML-Reader */
		XMLHandler myExampleHandler = new XMLHandler();
		myExampleHandler.setel(el);
		xr.setContentHandler(myExampleHandler);
		/* Load xml file from raw folder */
		InputStream in = this.getResources().openRawResource(R.raw.myxml);
		/* Begin parsing */
		xr.parse(new InputSource(in));
		XMLDataSet parsedExampleDataSet = myExampleHandler.getParsedData();
		inLine.append(parsedExampleDataSet.getvid());
		in.close();
		return inLine.toString();

	}

	public void popup(final String el) {
		Builder builder = new AlertDialog.Builder(Right.this);
		builder.setTitle(el);
		builder.setIcon(R.drawable.icon);
		OnClickListener web = new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				String url;
				try {
					url = getvidurl(el);
					Intent i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(url));
					startActivity(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		try {
			builder.setMessage(getParsedMyXML(el));
		} catch (Exception e1) {
			builder.setMessage("epic fail");
		}
		builder.setNegativeButton("Done", null);
		builder.setPositiveButton("Video", web);
		builder.show();
	}
}
