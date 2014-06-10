package com.blackdragoon.newtaipeicitybus.android;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import com.blackdragoon.newtaipeicitybus.android.fragment.ArrivalAlertsFragment;
import com.blackdragoon.newtaipeicitybus.android.fragment.BusOperatorsFragment;

public class ContentActivity extends BaseActivity {
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

	private static final String TAG = "ContentActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		Intent intent = getIntent();
		String command = intent.getStringExtra("_content");
		Log.d(TAG, "command --> " + command);

		Fragment f = null;
		if ("listOfBusOperators".equals(command)) {
			f = new BusOperatorsFragment();
		} else if ("busStopNearby".equals(command)) {

		} else if ("arrivalAlerts".equals(command)) {
			f = new ArrivalAlertsFragment();
		}

		FragmentManager fm = getFragmentManager();
		if (f != null) {
			FragmentTransaction tx = fm.beginTransaction();

			tx.replace(R.id.fragment_content, f);

			tx.commit();
		}

	}

}
