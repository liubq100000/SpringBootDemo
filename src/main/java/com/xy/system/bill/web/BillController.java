package com.xy.system.bill.web;

import com.xy.center.management.dto.LoginDTO;
import com.xy.system.bill.domain.BillVO;
import com.xy.system.bill.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Title: test
 * @version: 1.0
 * @date: 2018/11/20 11:39
 */
@Controller
@RequestMapping("bill")
public class BillController {

    @Autowired
    private IBillService billService;



    @RequestMapping("test")
    @ResponseBody
    public List<BillVO> test(HttpServletRequest request, LoginDTO loginDTO, HttpSession session){
        return billService.findBill(new BillVO());
    }

}
