package com.rezzo.mes.resour.insp.web;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class InspController {

    private final InspService sv;
    private final CcdsService cdsv;

    // direct to page
    @RequestMapping("rscInsp")
    public String rscInsp() {
        return "resour/rscInsp";
    }

    @RequestMapping("rscInspList")
    public String rscInspList() {
        return "resour/rscInspList";
    }

    // search conditions
    @RequestMapping("getVendors")
    @ResponseBody
    public List<VendVO> getRscVendList(@ModelAttribute VendVO vendVO) {
        return sv.getRscVendList(vendVO);
    }

    @RequestMapping("getResources")
    @ResponseBody
    public List<RscVO> getResources(@ModelAttribute RscVO rscVO) {
        return sv.getResources(rscVO);
    }

    // 검사내역 저장
    @RequestMapping("setRscInspList")
    @ResponseBody
    public void setRscInspList(@RequestBody List<RscInspVO> rscInspVOS) {
        sv.setRscInspList(rscInspVOS);
    }

    @RequestMapping("getRscOrdrList")
    @ResponseBody
    public List<RscOrdrVO> getRscOrdrList(@ModelAttribute RscOrdrVO rscOrdrVO) {
        return sv.getRscOrdrList(rscOrdrVO);
    }

    @RequestMapping("getRscInspHist")
    @ResponseBody
    public List<RscInspVO> getRscInspHist(@ModelAttribute RscInspVO rscInspVO) {
        return sv.getRscInspHist(rscInspVO);
    }

    @RequestMapping("schRscInspHist")
    @ResponseBody
    public List<RscInspVO> schRscInspHist(@ModelAttribute RscInspVO rscInspVO) {
        return sv.schRscInspHist(rscInspVO);
    }

    @RequestMapping("getRscInspHistByCd")
    @ResponseBody
    public List<RscInspVO> getRscInspHistByCd(@RequestBody RscInspVO rscInspVO) {
        return sv.getRscInspHistByCd(rscInspVO);
    }

    @RequestMapping("updRscInspHist")
    @ResponseBody
    public void updRscInspHist(@RequestBody List<RscInspVO> rscInspVOS) {
        sv.updRscInspHist(rscInspVOS);
    }

    // 검사상세
    @RequestMapping("getInfCdList")
    @ResponseBody
    public List<CcdsVO> getInfCdList() {
        return sv.getInfCdList();
    }

    //삭제
    @RequestMapping("delRscInspHistSingle")
    @ResponseBody
    public void delRscInspHistSingle(@RequestBody List<RscInspVO> rscInspVOS) {
        sv.delRscInspHistSingle(rscInspVOS);
    }

    @RequestMapping("delRscInspHist")
    @ResponseBody
    public void delRscInspHist(@RequestBody List<RscInspVO> rscInspVOS) {
        sv.delRscInspHistAll(rscInspVOS);
    }
}
