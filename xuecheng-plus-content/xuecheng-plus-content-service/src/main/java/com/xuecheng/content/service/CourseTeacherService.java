package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

/**
 * <p>
 * 课程-教师关系表 服务类
 * </p>
 *
 * @author itcast
 * @since 2023-06-10
 */
public interface CourseTeacherService extends IService<CourseTeacher> {

    public List<CourseTeacher> findTeacher(long id);

    void saveTeacher(CourseTeacher courseTeacher);

//    CourseTeacher updateTeacher(CourseTeacher courseTeacher);

    void deleteTeacher(long id);

}
