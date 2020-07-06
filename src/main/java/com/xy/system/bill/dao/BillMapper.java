package com.xy.system.bill.dao;


import com.xy.system.bill.domain.BillVO;
import org.mybatis.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillMapper extends BaseMapper<BillVO> {

    List<BillVO> findBill(BillVO cond);

}