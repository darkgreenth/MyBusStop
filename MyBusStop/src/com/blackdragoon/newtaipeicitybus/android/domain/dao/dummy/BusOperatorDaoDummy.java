package com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

	private static final  String TAG = "BusOperatorDaoDummy";
	
	
	private static List<BusOperator> convertJsonToBusOperatorList(JSONArray jsonArray) throws JSONException{
		List<BusOperator>busOperators = new ArrayList<BusOperator>();
		Log.d(TAG, "jsonArray length : "+jsonArray.length());
		for(int i=0;i<jsonArray.length();i++){
			JSONObject jBusOperator = jsonArray.getJSONObject(i);
			BusOperator busOperator = new BusOperator();
			busOperator.setId(jBusOperator.getString(ATTR_ID));
			busOperator.setNameZh(jBusOperator.getString(ATTR_NAME_ZH));
			busOperator.setType(jBusOperator.getString(ATTR_TYPE));
			busOperators.add(busOperator);
		}
		
		
		return busOperators;
	}
	
	private List<BusOperator> result = null;

	@Override
	public List<BusOperator> getBusOperators(Context context) {
		// TODO Auto-generated method stub

		
		RequestQueue queue = Volley.newRequestQueue(context);

		JsonArrayRequest jr = new JsonArrayRequest(
				BusOperatorDao.URL_API_BUS_OPERATOR,
				new Response.Listener<JSONArray>() {
					

					@Override
					public void onResponse(JSONArray response) {
						// TODO Auto-generated method stub
						Log.d(TAG, "array length : " + response.length());
						try {
							result = convertJsonToBusOperatorList(response);
						} catch (JSONException e) {
							Log.e(TAG, e.getMessage());
						}
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
