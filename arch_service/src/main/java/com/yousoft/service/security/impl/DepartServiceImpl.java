package com.yousoft.service.security.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysdepartMapper;
import com.yousoft.model.security.TSysdepart;
import com.yousoft.model.security.view.DepartTreeNode;
import com.yousoft.service.security.DepartService;
import com.yousoft.service.util.ArchState;

@Service
public class DepartServiceImpl implements DepartService {

	/**日志处理对象.**/
	private static Logger logger = LoggerFactory.getLogger(DepartServiceImpl.class);
	@Autowired
	private TSysdepartMapper sysDepartMapper;

	@Override
	public int addDeaprt(TSysdepart depart, Long operatorCode) {
		if (depart != null && operatorCode != null){
			depart.setCreatetime(new Date());
			depart.setCreateuser(operatorCode);
			sysDepartMapper.insertSelective(depart);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int modifyDepart(TSysdepart depart, Long operatorCode) {
		if (depart != null && depart.getDeptid() != null && operatorCode != null) {
			depart.setModifytime(new Date());
			depart.setUpdatercode(operatorCode);
			sysDepartMapper.updateByPrimaryKeySelective(depart);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int deleteDepart(TSysdepart depart) {
		if (depart != null && depart.getDeptid() != null) {
			sysDepartMapper.deleteByPrimaryKey(depart.getDeptid());
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}
	
	@Override
	public List<DepartTreeNode> findDepartTreeByUserId(Long userId) {
		return null;
	}

}
