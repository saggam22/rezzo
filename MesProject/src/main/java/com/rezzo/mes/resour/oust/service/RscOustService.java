package com.rezzo.mes.resour.oust.service;

import java.util.List;

public interface RscOustService {

    List<RscOustVO> getLotByRscCd(RscOustVO rscOustVO);

    // 입력
    void setRscOust(List<RscOustVO> rscOustVOS);
    List<RscOustVO> schRscOustHist(RscOustVO rscOustVO);
}
