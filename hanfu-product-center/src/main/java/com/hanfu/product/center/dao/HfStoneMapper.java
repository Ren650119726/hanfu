package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfStone;
import com.hanfu.product.center.model.HfStoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfStoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    long countByExample(HfStoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int deleteByExample(HfStoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int insert(HfStone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int insertSelective(HfStone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    List<HfStone> selectByExample(HfStoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    HfStone selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") HfStone record, @Param("example") HfStoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByExample(@Param("record") HfStone record, @Param("example") HfStoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByPrimaryKeySelective(HfStone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByPrimaryKey(HfStone record);
}