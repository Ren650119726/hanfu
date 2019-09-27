package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.FileDesc;
import com.hanfu.product.center.model.FileDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    long countByExample(FileDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int deleteByExample(FileDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int insert(FileDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int insertSelective(FileDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    List<FileDesc> selectByExample(FileDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    FileDesc selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") FileDesc record, @Param("example") FileDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByExample(@Param("record") FileDesc record, @Param("example") FileDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByPrimaryKeySelective(FileDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    int updateByPrimaryKey(FileDesc record);
}