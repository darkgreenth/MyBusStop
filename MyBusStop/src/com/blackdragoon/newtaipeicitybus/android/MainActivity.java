package com.blackdragoon.newtaipeicitybus.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

	private class FunctionAdapter extends BaseAdapter {

		// private Context context = null;
		private int resource = 0;
		private String[] arrays = null;
		private LayoutInflater inflater;
		private ViewHolder holder;

		private class ViewHolder {
			TextView func;
		}

		FunctionAdapter(Context context, int resource, String[] arrays) {
			// this.context = context;
			this.inflater = LayoutInflater.from(context);
			this.resource = resource;
			this.arrays = arrays;
		}

		@Override
		public int getCount() {
			return arrays.length;
		}

		@Override
		public Object getItem(int position) {
			return arrays[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View rowView = convertView;
			if (rowView == null) {
				rowView = inflater.inflate(resource, null);
				holder = new ViewHolder();
				holder.func = (TextView) rowView.findViewById(R.id.root_func);
			}

			holder.func.setText(arrays[position]);

			return rowView;
		}

	}
	
	private static final String TAG = "MainActivity";

	private GridView gridView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final String[] arrays = new String[] { "list of BusOperators",
				"bus stop nearby", "Arrival Alerts" };

		gridView = getView(R.id.main_functions);

		gridView.setAdapter(new FunctionAdapter(getBaseContext(),
				R.layout.function1, arrays));
		
		gridView.setOnItemClickListener(new OnItemClickListener(){

			final String[] commands = new String[]{"listOfBusOperators","busStopNearby","arrivalAlerts"};
			
			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Log.d(TAG, "onItemClick("+position+"/"+id+")");
				Intent intent = new Intent();
				intent.setClass(getBaseContext(), ContentActivity.class);
				intent.putExtra("_content", commands[position]);
				startActivity(intent);
			}
			
		});

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

}