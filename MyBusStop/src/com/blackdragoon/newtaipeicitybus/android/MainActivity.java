package com.blackdragoon.newtaipeicitybus.android;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.blackdragoon.newtaipeicitybus.android.domain.BusOperator;
import com.blackdragoon.newtaipeicitybus.android.domain.dao.BaseVolleyListener;
import com.blackdragoon.newtaipeicitybus.android.domain.dao.BusOperatorDao;
//import com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy.BusOperatorDaoDummy;
//import com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy.BusOperatorDaoDummy;
//import com.blackdragoon.newtaipeicitybus.android.domain.dao.dummy.BusOperatorDaoDummy;

public class MainActivity extends Activity {
	
	private class Volley1Listener extends BaseVolleyListener implements BusOperatorDao{

		private List<BusOperator> convertJsonToBusOperatorList(JSONArray jsonArray) throws JSONException{
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
		
		@Override
		public void onErrorResponse(VolleyError error) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onResponse(JSONArray response) {
			Log.d(TAG, "array length : " + response.length());
			try {
//				result = convertJsonToBusOperatorList(response);
				
				MyAdapter adapter = new MyAdapter(getBaseContext(), R.layout.operator,
						convertJsonToBusOperatorList(response));
				Log.d(TAG, "adapter is null ? "+(adapter == null));
				listView.setAdapter(adapter);
				
			} catch (JSONException e) {
				Log.e(TAG, e.getMessage());
			}
			
		}

		@Override
		public List<BusOperator> getBusOperators(Context context) {
			RequestQueue queue = Volley.newRequestQueue(context);

			JsonArrayRequest jr = new JsonArrayRequest(
					BusOperatorDao.URL_API_BUS_OPERATOR,
					this,this);

			queue.add(jr);
			return null;
		}
		
	}

	private class MyAdapter extends ArrayAdapter<BusOperator> {

		private LayoutInflater inflater = null;
		private List<BusOperator> operators;

		public MyAdapter(Context context, int resource,
				List<BusOperator> operators) {
			super(context, resource, operators);
			inflater = LayoutInflater.from(context);
			this.operators = operators;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				v = inflater.inflate(R.layout.operator, null);
			}

			TextView v1 = (TextView) v.findViewById(R.id.id);
			TextView v2 = (TextView) v.findViewById(R.id.name);
			TextView v3 = (TextView) v.findViewById(R.id.type);
			BusOperator operator = operators.get(position);
			v1.setText(operator.getId());
			v2.setText(operator.getNameZh());
			v3.setText(operator.getType());

			return v;
		}

	}

	private static final String TAG = "Main-BusStop";

	private ListView listView = null;
//	private List<BusOperator> operators = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = (ListView) findViewById(R.id.listView1);
		Volley1Listener dao = new Volley1Listener();
		dao.getBusOperators(getBaseContext());
//		List<BusOperator> operators = dao.getBusOperators(getBaseContext());
//		Log.d(TAG, "operators is null ? "+(operators == null));
//		
//		MyAdapter adapter = new MyAdapter(getBaseContext(), R.layout.operator,
//				operators);
//		Log.d(TAG, "adapter is null ? "+(adapter == null));
//		listView.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
