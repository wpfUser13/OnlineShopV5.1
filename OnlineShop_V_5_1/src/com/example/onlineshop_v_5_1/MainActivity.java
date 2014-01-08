package com.example.onlineshop_v_5_1;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	Button button;
	public void addListenerOnButton() {
		
		button = (Button) findViewById(R.id.HFU_Button);
		button.setOnClickListener(new OnClickListener() {
			
		
		public void onClick(View arg0) {
			Intent browserIntent =
					new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.hs-furtwangen.de"));
					startActivity(browserIntent);
		}
		});
	}

}
