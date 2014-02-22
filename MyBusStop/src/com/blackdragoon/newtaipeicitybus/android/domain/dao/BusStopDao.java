package com.blackdragoon.newtaipeicitybus.android.domain.dao;

import java.util.List;

import android.content.Context;

import com.blackdragoon.newtaipeicitybus.android.domain.BusStop;

public interface BusStopDao {
	public abstract List<BusStop> getBusStop(Context context);
}
