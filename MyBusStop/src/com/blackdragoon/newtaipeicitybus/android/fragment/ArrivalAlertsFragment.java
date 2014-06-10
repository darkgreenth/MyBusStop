package com.blackdragoon.newtaipeicitybus.android.fragment;

import android.app.Fragment;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blackdragoon.newtaipeicitybus.android.R;

public class ArrivalAlertsFragment extends Fragment implements LocationListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.arrivalalert, null);
		return v;
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		LocationManager locationManager = (LocationManager) getActivity()
				.getSystemService(Context.LOCATION_SERVICE);

		boolean gpsIsEnabled = locationManager
				.isProviderEnabled(LocationManager.GPS_PROVIDER);
		boolean networkIsEnabled = locationManager
				.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

		String provider = LocationManager.NETWORK_PROVIDER;

		if (gpsIsEnabled) {
			provider = LocationManager.GPS_PROVIDER;
		} else if (networkIsEnabled) {
			provider = LocationManager.NETWORK_PROVIDER;
		} else {
			// Show an error dialog that GPS is disabled...
		}
		
		

	}

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}

}
