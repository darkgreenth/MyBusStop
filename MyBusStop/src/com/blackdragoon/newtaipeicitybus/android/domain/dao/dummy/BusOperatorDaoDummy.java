package com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.blackdragoon.newtaipeicitybus.android.domain.BusOperator;
import com.blackdragoon.newtaipeicitybus.android.domain.dao.BusOperatorDao;

public class BusOperatorDaoDummy implements BusOperatorDao {

	private String TAG = "BusOperatorDaoDummy";
	
	
	private static List<BusOperator> convertJsonToBusOperatorList(JSONArray jsonArray){
		return null;
	}

	@Override
	public List<BusOperator> getBusOperators(Context context) {
		// TODO Auto-generated method stub

		List<BusOperator> result = new ArrayList<BusOperator>();
		
		RequestQueue queue = Volley.newRequestQueue(context);

		JsonArrayRequest jr = new JsonArrayRequest(
				BusOperatorDao.URL_API_BUS_OPERATOR,
				new Response.Listener<JSONArray>() {
					

					@Override
					public void onResponse(JSONArray response) {
						// TODO Auto-generated method stub
						Log.d(TAG, "array length : " + response.length());
					}

				}, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub

					}

				});

		queue.add(jr);

		return result;
	}

}
