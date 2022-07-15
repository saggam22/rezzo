package com.rezzo.mes.resour.insp.service;

import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.vo.OrdrVO;
import com.rezzo.mes.resour.insp.vo.RscInfVO;
import com.rezzo.mes.resour.insp.vo.RscInspVO;

import java.util.List;

public interface InspService {

    List<VendVO> getVendList();
    List<VendVO> getVendListByKw(VendVO vendVO);
    List<OrdrVO> getOrdrList(OrdrVO ordrVO);
    void insertInspList(List<RscInspVO> rscInspVOS); // test

}
