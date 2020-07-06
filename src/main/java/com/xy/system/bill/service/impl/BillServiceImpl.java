package com.xy.system.bill.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xy.center.management.common.utils.DateUtils;
import com.xy.center.management.common.utils.DigestUtils;
import com.xy.center.management.dao.BaseAdminUserMapper;
import com.xy.center.management.dto.AdminUserDTO;
import com.xy.center.management.dto.UserSearchDTO;
import com.xy.center.management.pojo.BaseAdminUser;
import com.xy.center.management.response.PageDataResult;
import com.xy.center.management.service.AdminUserService;
import com.xy.system.bill.dao.BillMapper;
import com.xy.system.bill.domain.BillVO;
import com.xy.system.bill.service.IBillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/21 11:04
 */
@Service
@Primary
public class BillServiceImpl implements IBillService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BillMapper billMapper;


	@Override
	public List<BillVO> findBill(BillVO cond) {
		return billMapper.findBill(cond);
	}
}
