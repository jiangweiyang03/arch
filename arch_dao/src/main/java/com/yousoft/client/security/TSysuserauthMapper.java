package com.yousoft.client.security;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yousoft.model.security.TSysuserauth;
import com.yousoft.model.security.TSysuserauthExample;
import com.yousoft.model.security.view.SecurityUser;

@Repository
public interface TSysuserauthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int countByExample(TSysuserauthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int deleteByExample(TSysuserauthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int deleteByPrimaryKey(Long auid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int insert(TSysuserauth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int insertSelective(TSysuserauth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    List<TSysuserauth> selectByExample(TSysuserauthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    TSysuserauth selectByPrimaryKey(Long auid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") TSysuserauth record, @Param("example") TSysuserauthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int updateByExample(@Param("record") TSysuserauth record, @Param("example") TSysuserauthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int updateByPrimaryKeySelective(TSysuserauth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysuserauth
     *
     * @mbggenerated Thu Jun 04 14:54:12 CST 2015
     */
    int updateByPrimaryKey(TSysuserauth record);
    
    /**
     * 根据登录代码查询返回应用的用户信息
     * @param loginCode  登录代码
     * @return
     */
    SecurityUser findSecurityUserByLoginCode(@Param("loginCode") String loginCode);
}