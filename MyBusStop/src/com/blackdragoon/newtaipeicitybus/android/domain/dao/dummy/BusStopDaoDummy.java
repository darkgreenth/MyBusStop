package com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy;

import java.util.List;

import org.json.JSONArray;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.blackdragoon.newtaipeicitybus.android.domain.BusStop;
import com.blackdragoon.newtaipeicitybus.android.domain.dao.BusStopDao;

public class BusStopDaoDummy implements BusStopDao {
	
	private static final String TAG = "BusStopDaoDummy";

	// http://data.ntpc.gov.tw/NTPC/od/data/api/TRB29/?$format=json


	@Override
	public List<BusStop> getBusStop(Context context) {
		// TODO Auto-generated method stub

		String url = "http://data.ntpc.gov.tw/NTPC/od/data/api/TRB29/?$format=json";

		RequestQueue queue = Volley.newRequestQueue(context);

		JsonArrayRequest jr = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {

			@Override
			public void onResponse(JSONArray response) {
				// TODO Auto-generated method stub
				Log.d(TAG, "array length : "+response.length());
				
			}
			
		}, new Response.ErrorListener(){

			@Override
			public void onErrorResponse(VolleyError error) {
				// TODO Auto-generated method stub
				
			}
			
		});

		queue.add(jr);

		return null;
	}

}
