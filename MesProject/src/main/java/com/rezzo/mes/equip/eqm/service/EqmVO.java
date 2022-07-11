package com.rezzo.mes.equip.eqm.service;

import lombok.Data;

@Data
public class EqmVO {
	private String eqmCd;
	private String lineCd;
	private String prcsCd;
	private String eqmNm;
	private String eqmIstDt;
	private int minTemp;
	private int maxTemp;
	private int chckPred;
	private String useYn;
	private String prcsNm;
	private String imgPath;
	private String eqmImg;
}
