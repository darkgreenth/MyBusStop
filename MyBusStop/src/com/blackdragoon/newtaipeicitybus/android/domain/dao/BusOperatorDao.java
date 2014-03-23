package com.blackdragoon.newtaipeicitybus.android.domain.dao;

import java.util.List;

import android.content.Context;

import com.blackdragoon.newtaipeicitybus.android.domain.BusOperator;

public interface BusOperatorDao {
	
	public static final String URL_API_BUS_OPERATOR = "http://data.ntpc.gov.tw/NTPC/od/data/api/TRB26/?$format=json";
	
	public static final String ATTR_ID = "Id";
	public static final String ATTR_TYPE = "type";
	public static final String ATTR_NAME_ZH = "nameZh";
	
	public abstract List<BusOperator>getBusOperators(final Context context);
}
