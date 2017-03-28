package org.sxdata.jingwei.dao;

import org.springframework.stereotype.Repository;
import org.sxdata.jingwei.entity.JobEntity;
import org.sxdata.jingwei.entity.TaskGroupAttributeEntity;
import org.sxdata.jingwei.entity.TaskGroupEntity;
import org.sxdata.jingwei.entity.TransformationEntity;

import java.util.List;

/**
 * Created by cRAZY on 2017/3/22.
 */
@Repository
public interface TaskGroupDao {
    //TODO 获取当前用户下所有的任务组信息 分页形式获取 暂无用户模块
    public List<TaskGroupEntity> getAllTaskGroup(int start,int limit);

    public Integer getTotalCountTaskGroup();

    public void addTaskGroup(TaskGroupEntity taskGroup);

    public void addTaskGroupAttribute(TaskGroupAttributeEntity taskGroupAttribute);

    public List<JobEntity> getAllJob();

    public List<TransformationEntity> getAllTrans();

    public List<TaskGroupEntity> getAllTaskGroupNoLimit();

    public void updateTaskGroup(TaskGroupEntity taskGroup);

    public void updateTaskGroupAttributes(String oldName,String newName);

    public List<TaskGroupAttributeEntity> getTaskGroupAttributesByName(String name);

    public void deleteTaskGroupAttributesByName(String name);

    public void deleteTaskGroupByName(String name);

    public Integer isContainsTask(String taskName,String type,String groupName);

    public void deleteTaskGroupAttributesByTaskName(String taskName,String type);

    public List<TaskGroupAttributeEntity> getTaskGroupByTaskName(String taskName,String type);

    public TaskGroupEntity getTaskGroupById(Integer id);

}
