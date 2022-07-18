package com.rezzo.mes.resour.ist.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class IstController {

    @RequestMapping("rscIst")
    public String rscIst() {
        return "resour/rscIst";
    }
}
