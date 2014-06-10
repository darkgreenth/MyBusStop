package com.blackdragoon.newtaipeicitybus.android;

import android.app.Activity;
import android.view.View;

public class BaseActivity extends Activity {
	@SuppressWarnings("unchecked")
	public final <E extends View> E getView(int id) {
		return (E) findViewById(id);
	}
}
