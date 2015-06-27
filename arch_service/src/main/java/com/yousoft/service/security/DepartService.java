package com.yousoft.service.security;

import java.util.List;

import com.yousoft.model.security.TSysdepart;
import com.yousoft.model.security.view.DepartTreeNode;

/**
 * 部门处理接口服务
 * 
 * @author jiangweiyang01
 * @version 1.0
 * @since 2015/06/19
 */
public interface DepartService {

	/**
	 * 添加部门信息
	 * 
	 * @param depart
	 *            部门对象
	 * @param operatorCode
	 *            操作者ID
	 * @return
	 */
	public int addDeaprt(TSysdepart depart, Long operatorCode);

	/**
	 * 修改部门信息
	 * 
	 * @param depart
	 *            部门对象
	 * @param operatorCode
	 *            操作者ID
	 * @return
	 */
	public int modifyDepart(TSysdepart depart, Long operatorCode);

	/**
	 * 删除部门信息
	 * 
	 * @param depart
	 *            待删除的部门对象
	 * @return 部门对象删除是否成功
	 */
	public int deleteDepart(TSysdepart depart);

	/**
	 * 根据用户ID查询满足条件的部门集合
	 * 
	 * @param userId
	 *            用户ID
	 * @return 部门集合List
	 */
	public List<DepartTreeNode> findDepartTreeByUserIdAndDepartId(Long userId,
			int departId);

}
