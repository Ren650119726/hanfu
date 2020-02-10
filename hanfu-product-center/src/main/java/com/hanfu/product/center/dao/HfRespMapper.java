package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfResp;
import com.hanfu.product.center.model.HfRespExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfRespMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    long countByExample(HfRespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int deleteByExample(HfRespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int insert(HfResp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int insertSelective(HfResp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    List<HfResp> selectByExample(HfRespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    HfResp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfResp record, @Param("example") HfRespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int updateByExample(@Param("record") HfResp record, @Param("example") HfRespExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int updateByPrimaryKeySelective(HfResp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_resp
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    int updateByPrimaryKey(HfResp record);
}