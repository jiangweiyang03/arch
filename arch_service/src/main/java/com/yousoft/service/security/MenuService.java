package com.yousoft.service.security;

import java.util.List;

import com.yousoft.model.security.TSysmenu;
import com.yousoft.model.security.view.MenuTreeNode;

/**
 * 菜单接口服务
 * 
 * @author jiangweiyang01
 * @version 1.0
 * @since 2015/06/19
 */
public interface MenuService {
	
	/**
	 * 根据用户Id查询其配置的角色所拥有的菜单集合
	 * 
	 * @param userid
	 *            查询的用户Id
	 * @return 菜单集合对象
	 */
	public List<MenuTreeNode> findMenuByUserId(Long userid);
	
	/**
	 * 添加菜单对象
	 * @param menu 菜单对象
	 * @param operatorCode 操作者ID
	 * @return 处理状态
	 */
	public int addMenu(TSysmenu menu,Long operatrorCode);
	
	/**
	 * 删除菜单对象
	 * @param menu 菜单对象
	 * @return 处理状态
	 */
	public int deleteMenu(TSysmenu menu);
	
	/**
	 * 修改菜单对象
	 * @param menu 菜单对象
	 * @param operatorCode 操作者ID
	 * @return 处理状态
	 */
	public int modifyMenu(TSysmenu menu,Long operatorCode);
	
	

}
