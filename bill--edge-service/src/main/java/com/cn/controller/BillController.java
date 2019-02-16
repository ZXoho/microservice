package com.cn.controller;

import com.cn.pojo.Bill;
import com.cn.service.BillService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zxoho
 * @date 19-2-16 下午11:37
 */
@Controller
@RequestMapping("/bill")
public class BillController {

    @Reference
    private BillService billService;

    @GetMapping("/findBills")
    public List<Bill> findBills(@RequestParam("companyId") String companyId,
                                @RequestParam("userId") String userId) {
        return billService.findBills(companyId, userId);
    }
}
