package com.flyingh.intent;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class OtherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		Toast.makeText(getApplicationContext(), new Date().toString(), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_other, menu);
		return true;
	}

}
