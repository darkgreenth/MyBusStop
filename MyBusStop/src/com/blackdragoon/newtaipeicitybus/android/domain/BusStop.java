package com.blackdragoon.newtaipeicitybus.android.domain;

/**
 * Bus Stop.
 * @author RomanYu
 *
 */
public class BusStop {
	
	
	/**
	 * 公車業者
	 */
	private BusOperator operator;	 
	
	/**
	 * 公車路線
	 */
	private BusRoute route;
	
	
	/**
	 * 站牌名稱(中), response string Station_nameZh
	 */
	private String nameZh;
	
	/**
	 * 站牌名稱(英), response string Station_nameEn
	 */
	private String nameEn;
	 
	/**
	 * 站牌編號, response string Station_Id
	 */
	private String id;
	 
	/**
	 * 站牌序號, response string Station_seqNo
	 */
	private String seqId;
	 
	/**
	 * 站牌經度, reponse string Station_longitude
	 */
	private String longitude;
	 
	/**
	 * 站牌緯度, response string Station_latitude
	 */
	private String latitude;
	 
	/**
	 * 地區代碼, response string Station_districtId
	 */
	private String districtId;
	 
	/**
	 * 去回程標計, :0=去程,1=回程, response string Station_goBack
	 */
	private String isGoBack;

	public BusOperator getOperator() {
		return operator;
	}

	public void setOperator(BusOperator operator) {
		this.operator = operator;
	}

	public BusRoute getRoute() {
		return route;
	}

	public void setRoute(BusRoute route) {
		this.route = route;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSeqId() {
		return seqId;
	}

	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getIsGoBack() {
		return isGoBack;
	}

	public void setIsGoBack(String isGoBack) {
		this.isGoBack = isGoBack;
	}
	 
}
 
