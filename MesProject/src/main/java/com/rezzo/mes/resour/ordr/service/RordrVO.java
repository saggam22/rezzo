package com.rezzo.mes.resour.ordr.service;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RordrVO {

	//자재발주 디테일 테이블
	private int ordrNo;
	private String rscCd;
	private String rscNm;
	private int ordrCnt;
	
	//자재발주 테이블
	private String vendNm;
	private Date paprdCmndDt;
	private Date ordrReqDt;
	
	
}
