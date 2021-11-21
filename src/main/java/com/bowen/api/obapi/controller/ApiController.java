package com.bowen.api.obapi.controller;

import com.bowen.api.obapi.pojo.ApiBalanceChangeParam;
import com.bowen.api.obapi.pojo.ApiQueryBalanceParam;
import com.bowen.api.obapi.pojo.ApiQueryOrderStatusParam;
import com.bowen.api.obapi.util.ResultApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApiController {
    @PostMapping("/queryBalance")
    public Object queryBalance(HttpServletRequest request) {
        ApiQueryBalanceParam param = new ApiQueryBalanceParam();
        param.setBalance(100);
        return ResultApi.suc(param);
    }

    @PostMapping("/queryOrderStatus")
    public Object queryOrderStatus(HttpServletRequest request) {
        ApiQueryOrderStatusParam param = new ApiQueryOrderStatusParam();
        param.setStatus(0);
        param.setTradeAmount(800);
        param.setOrderId("12345:1577445928225");
        param.setTradeType(0);
        return ResultApi.suc(param);
    }

    @PostMapping("/balanceChange")
    public Object balanceChange(HttpServletRequest request) {
        ApiBalanceChangeParam param = new ApiBalanceChangeParam();
        param.setTradeType(2);
        param.setTradeAmount(800);
        param.setBalance(5000);
        return ResultApi.suc(param);
    }
}
