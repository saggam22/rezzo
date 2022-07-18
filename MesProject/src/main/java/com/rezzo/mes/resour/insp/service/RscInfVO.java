package com.rezzo.mes.resour.insp.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscInfVO {

    String rscInspCd; // 검사코드
    String rscCd; // 자재코드
    String ccdDtl; // 공통 불량코드
    int infCnt; // 불량수량

}
