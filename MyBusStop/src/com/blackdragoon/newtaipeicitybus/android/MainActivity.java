package com.blackdragoon.newtaipeicitybus.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy.BusOperatorDaoDummy;

public class MainActivity extends Activity {
	
	private static final String TAG = "Main-BusStop";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		BusOperatorDaoDummy dao = new BusOperatorDaoDummy();
		dao.getBusOperators(getBaseContext());
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
