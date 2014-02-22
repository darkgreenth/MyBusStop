package com.blackdragoon.newtaipeicitybus.android.domain;

/**
 * Represent of New Taipei City Bus operators
 * 
 * @author RomanYu
 * 
 */
public class BusOperator {

	/**
	 * 業者類別, response string : type
	 */
	private String type;
	/**
	 * 業者名稱, response string : nameZh
	 */
	private String nameZh;
	
	/**
	 * 業者名稱, response string : nameEn(BusStop API)
	 */
	private String nameEn;

	/**
	 * 業者代碼, response string : Id
	 */
	private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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


}
