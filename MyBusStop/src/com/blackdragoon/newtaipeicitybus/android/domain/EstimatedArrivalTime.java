package com.blackdragoon.newtaipeicitybus.android.domain;

public class EstimatedArrivalTime {
	
	/**
	 * 公車站牌, response string StationId
	 */
	private BusStop busStop;
	
	/**
	 * 預估到達時間, 單位:分, response string EstimateTime,-1表示未發車或無資料
	 */
	private String estimateTime;
	
	
	/**
	 * 備註, response string Memo
	 */
	private String description;

	/**
	 * 公車路線, response string RouteID
	 */
	private BusRoute route;

	public BusStop getBusStop() {
		return busStop;
	}

	public void setBusStop(BusStop busStop) {
		this.busStop = busStop;
	}

	public String getEstimateTime() {
		return estimateTime;
	}

	public void setEstimateTime(String estimateTime) {
		this.estimateTime = estimateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BusRoute getRoute() {
		return route;
	}

	public void setRoute(BusRoute route) {
		this.route = route;
	} 
}
