package com.yousoft.client.security;

import com.yousoft.model.security.TSysroleresource;
import com.yousoft.model.security.TSysroleresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TSysroleresourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int countByExample(TSysroleresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int deleteByExample(TSysroleresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int deleteByPrimaryKey(Integer roleresid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int insert(TSysroleresource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int insertSelective(TSysroleresource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    List<TSysroleresource> selectByExample(TSysroleresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    TSysroleresource selectByPrimaryKey(Integer roleresid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByExampleSelective(@Param("record") TSysroleresource record, @Param("example") TSysroleresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByExample(@Param("record") TSysroleresource record, @Param("example") TSysroleresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByPrimaryKeySelective(TSysroleresource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sysroleresource
     *
     * @mbggenerated Tue Jun 02 21:20:20 CST 2015
     */
    int updateByPrimaryKey(TSysroleresource record);
}