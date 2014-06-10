package com.blackdragoon.newtaipeicitybus.android.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

	public SQLiteHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	private static final String STMT_CREATE_BUS_OPERATORS = "CREATE TABLE IF "
			+ "NOT EXISTS BUS_OPERATORS "
			+ "(TYPE VARCHAR, NAME_ZH VARCHAR, NAME_EN VARCHAR, ID VARCHAR,UPDATE_TIME INTEGER);";

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(STMT_CREATE_BUS_OPERATORS);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
