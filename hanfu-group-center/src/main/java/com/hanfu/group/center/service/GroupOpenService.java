package com.hanfu.group.center.service;


import com.hanfu.group.center.manual.dao.GroupOpenMapper;
import com.hanfu.group.center.manual.model.GroupOpen;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author:gyj
 * @date: 2019/12/13
 * @time: 11:05
 */
public interface GroupOpenService {
    int deleteByPrimaryKey(Integer id);
//    根据 groupId删除
    int deleteByGroupId(Integer groupId);
    //    根据groupId查询所在开表编号
    List<Integer> selectId(Integer groupId);
//添加开团表
    void insert(Integer groupId,  Date startTime,Date stopTime);
//    获取停止时间
    List<Date> getStopTime();
    //    根据停止时间查
    GroupOpen selectStopTime(Date stopTime);

    int insertSelective(GroupOpenMapper groupOpen);

    GroupOpenMapper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupOpenMapper groupOpen);

    int updateByPrimaryKey(GroupOpenMapper groupOpen);
    //    查询参团人数
    int selectNumber(Integer groupId);
//    查询参团用户id
    List<Integer> selectUserId(Integer groupId);
//    查看开团信息
    GroupOpen selectByGroupOpen(Integer groupId);
    //查一个
    GroupOpen selectByStopTime( Integer groupId,  Date stopTime);
    //    更改开团转态
    void updateByIsDeleted(Integer id);
}