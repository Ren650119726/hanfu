package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.HfStoreRele;
import com.hanfu.user.center.model.HfStoreReleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfStoreReleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    long countByExample(HfStoreReleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int deleteByExample(HfStoreReleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int insert(HfStoreRele record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int insertSelective(HfStoreRele record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    List<HfStoreRele> selectByExample(HfStoreReleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    HfStoreRele selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfStoreRele record, @Param("example") HfStoreReleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int updateByExample(@Param("record") HfStoreRele record, @Param("example") HfStoreReleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int updateByPrimaryKeySelective(HfStoreRele record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_rele
     *
     * @mbg.generated Wed Mar 25 13:31:31 CST 2020
     */
    int updateByPrimaryKey(HfStoreRele record);
}