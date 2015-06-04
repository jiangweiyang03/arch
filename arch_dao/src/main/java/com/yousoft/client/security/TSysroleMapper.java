package com.yousoft.client.security;

import com.yousoft.model.security.TSysrole;
import com.yousoft.model.security.TSysroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TSysroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int countByExample(TSysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int deleteByExample(TSysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int deleteByPrimaryKey(Integer roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int insert(TSysrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int insertSelective(TSysrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    List<TSysrole> selectByExample(TSysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    TSysrole selectByPrimaryKey(Integer roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByExampleSelective(@Param("record") TSysrole record, @Param("example") TSysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByExample(@Param("record") TSysrole record, @Param("example") TSysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByPrimaryKeySelective(TSysrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysrole
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByPrimaryKey(TSysrole record);
}