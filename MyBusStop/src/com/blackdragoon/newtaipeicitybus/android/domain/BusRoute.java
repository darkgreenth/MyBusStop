package com.blackdragoon.newtaipeicitybus.android.domain;

/**
 * Represent of the bus route
 * 
 * @author RomanYu
 * 
 */
public class BusRoute {

	/**
	 * 路線代碼, response string RouteID/Route_Id(BusStop API)
	 */
	private String id;
	/**
	 * 路線名稱, response string RouteName/Route_nameZh(BusStop API)
	 */
	private String nameZh;
	
	/**
	 * 路線名稱, response string Route_En(BusStop API)
	 */
	private String nameEn;
	
	/**
	 * 路線狀態, response string Route_status (BusStop API)
	 */
	private String status;
	
	/**
	 * 迄點(中), response string Route_destinationZh (BusStop API)
	 */
	private String destinationZh;
	
	/**
	 * 迄點(英), response string Route_destinationEn (BusStop API)
	 */
	private String destinationEn;
	
	
	/**
	 * 起點(中), response string Route_departureZh (BusStop API)
	 */
	private String departureZh;
	
	/**
	 * 起點(英), response string Route_departureEn (BusStop API) 
	 */
	private String departureEn;
	
	/**
	 * 露線系統參數, response string RouteQueryCode
	 */
	private String queryCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameZh() {
		return nameZh;
	}

	public void setNameZh(String nameZh) {
		this.nameZh = nameZh;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDestinationZh() {
		return destinationZh;
	}

	public void setDestinationZh(String destinationZh) {
		this.destinationZh = destinationZh;
	}

	public String getDestinationEn() {
		return destinationEn;
	}

	public void setDestinationEn(String destinationEn) {
		this.destinationEn = destinationEn;
	}

	public String getDepartureZh() {
		return departureZh;
	}

	public void setDepartureZh(String departureZh) {
		this.departureZh = departureZh;
	}

	public String getDepartureEn() {
		return departureEn;
	}

	public void setDepartureEn(String departureEn) {
		this.departureEn = departureEn;
	}

	public String getQueryCode() {
		return queryCode;
	}

	public void setQueryCode(String queryCode) {
		this.queryCode = queryCode;
	}


}
