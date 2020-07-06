package com.xy.system.bill.service;

import com.xy.system.bill.domain.BillVO;

import java.util.List;


/**
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/21 11:04
 */
public interface IBillService {

    List<BillVO> findBill(BillVO cond);
}
