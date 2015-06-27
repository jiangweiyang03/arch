package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysdepartMapper;
import com.yousoft.model.ArchConfig;
import com.yousoft.model.security.TSysdepart;
import com.yousoft.model.security.view.DepartTreeNode;
import com.yousoft.service.security.DepartService;
import com.yousoft.service.util.ArchState;

@Service
public class DepartServiceImpl implements DepartService {

	/** 日志处理对象. **/
	private static Logger logger = LoggerFactory
			.getLogger(DepartServiceImpl.class);
	@Autowired
	private TSysdepartMapper sysDepartMapper;

	@Override
	public int addDeaprt(TSysdepart depart, Long operatorCode) {
		if (depart != null && operatorCode != null) {
			depart.setCreatetime(new Date());
			depart.setCreateuser(operatorCode);
			sysDepartMapper.insertSelective(depart);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int modifyDepart(TSysdepart depart, Long operatorCode) {
		if (depart != null && depart.getDeptid() != null
				&& operatorCode != null) {
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
	public List<DepartTreeNode> findDepartTreeByUserIdAndDepartId(Long userId,
			int departId) {
		List<TSysdepart> departList = sysDepartMapper.selectByExample(null);
		if (ArchConfig.AdminUserID == userId) {
			// 管理员返回所有对象集合
			logger.info("管理员获取树形组织树...");
			return parseDepartTreeNodeList(0, departList);
		} else {
			// 返回该用户所在部门及下级部门
			logger.info("普通用户获取树形组织树...");
			return parseDepartTreeNodeList(departId, departList);
		}
	}

	/**
	 * 根据上级部门ID查询所有下级机构
	 * 
	 * @param upperDeptId
	 * @return
	 */
	private List<DepartTreeNode> parseDepartTreeNodeList(int upperDeptID,
			List<TSysdepart> allDepartList) {
		List<DepartTreeNode> nodeList = new ArrayList<DepartTreeNode>();
		if (allDepartList != null && allDepartList.size() > 0) {
			DepartTreeNode treeNode = null;
			for (TSysdepart depart : allDepartList) {
				if (depart.getUpperdeptid() == upperDeptID) {
					treeNode = new DepartTreeNode();
					treeNode.setId(depart.getDeptid().toString());
					treeNode.setText(depart.getDeptname());
					treeNode.setChildren(fetchAllChildNode(depart.getDeptid(),
							allDepartList));
					if (treeNode.getChildren() == null
							|| treeNode.getChildren().size() < 1) {
						treeNode.setLeaf(true);
					} else {
						treeNode.setLeaf(false);
					}
					nodeList.add(treeNode);
				}
			}
		}
		return nodeList;
	}

	/**
	 * 根据上级部门ID查询
	 * 
	 * @param upperDepartId
	 * @param allDepartList
	 * @return
	 */
	private List<DepartTreeNode> fetchAllChildNode(int upperDepartId,
			List<TSysdepart> allDepartList) {
		List<DepartTreeNode> treeNodeList = new ArrayList<DepartTreeNode>();
		if (allDepartList != null && allDepartList.size() > 0) {
			DepartTreeNode treeNode = null;
			for (TSysdepart depart : allDepartList) {
				if (depart.getUpperdeptid() == upperDepartId) {
					treeNode = new DepartTreeNode();
					treeNode.setId(depart.getDeptid().toString());
					treeNode.setText(depart.getDeptname());
					treeNode.setChildren(fetchAllChildNode(
							Integer.valueOf(treeNode.getId()), allDepartList));
					if (treeNode.getChildren() == null
							|| treeNode.getChildren().size() < 1) {
						treeNode.setLeaf(true);
					} else {
						treeNode.setLeaf(false);
					}
					treeNodeList.add(treeNode);
				}
			}
		}
		return treeNodeList;
	}

}
