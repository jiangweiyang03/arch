package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysmenuMapper;
import com.yousoft.model.security.TSysmenu;
import com.yousoft.model.security.view.MenuTreeNode;
import com.yousoft.service.security.MenuService;
import com.yousoft.service.util.ArchState;

@Service
public class MenuServiceImpl implements MenuService {
	/** 日志对象 **/
	private static Logger logger = LoggerFactory
			.getLogger(MenuServiceImpl.class);
	@Autowired
	private TSysmenuMapper menuMapper;

	@Override
	public int addMenu(TSysmenu menu, Long operatrorCode) {
		if (menu != null) {
			menu.setCreateuser(operatrorCode);
			menu.setCreatetime(new Date());
			menuMapper.insertSelective(menu);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int deleteMenu(TSysmenu menu) {
		if (menu != null && menu.getMenuid() != null) {
			menuMapper.deleteByPrimaryKey(menu.getMenuid());
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public int modifyMenu(TSysmenu menu, Long operatorCode) {
		if (menu != null && menu.getMenuid() != null) {
			menu.setUpdatercode(operatorCode);
			menu.setModifytime(new Date());
			menuMapper.updateByPrimaryKeySelective(menu);
			return ArchState.SUCCESS.getState();
		}
		return ArchState.ERROR.getState();
	}

	@Override
	public List<MenuTreeNode> findMenuByUserId(Long userid) {
		/** 查询表中所有的菜单记录 **/
		List<TSysmenu> menuList = menuMapper.selectByExample(null);
		List<MenuTreeNode> nodeList = new ArrayList<MenuTreeNode>();
		if (menuList != null && menuList.size() > 0) {
			MenuTreeNode treeNode = null;
			for (TSysmenu sysMenu : menuList) {
				if (sysMenu.getUppermenuid() == 0) {
					treeNode = new MenuTreeNode();
					treeNode.setId(sysMenu.getMenuid().toString());
					treeNode.setText(sysMenu.getMenuname());
					treeNode.setChildren(fetchAllChildNode(sysMenu.getMenuid(),
							menuList));
					treeNode.setIcon(sysMenu.getIcon());
					treeNode.setUrl(sysMenu.getMenuurl());
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
	 * 根据上级节点查询所有的下级节点集合
	 * 
	 * @param upperMenuId
	 *            上级节点ID
	 * @param menuList
	 *            所有的菜单集合
	 * @return
	 */
	private List<MenuTreeNode> fetchAllChildNode(int upperMenuId,
			List<TSysmenu> menuList) {
		List<MenuTreeNode> treeNodeList = new ArrayList<MenuTreeNode>();
		if (menuList != null && menuList.size() > 0) {
			MenuTreeNode treeNode = null;
			for (TSysmenu menu : menuList) {
				if (menu.getUppermenuid() == upperMenuId) {
					treeNode = new MenuTreeNode();
					treeNode.setId(menu.getMenuid().toString());
					treeNode.setText(menu.getMenuname());
					treeNode.setChildren(fetchAllChildNode(
							Integer.valueOf(treeNode.getId()), menuList));
					treeNode.setIcon(menu.getIcon());
					treeNode.setUrl(menu.getMenuurl());
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
