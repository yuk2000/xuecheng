package com.xuecheng.content.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.base.exception.XueChengPlusException;
import com.xuecheng.content.mapper.CourseTeacherMapper;
import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 课程-教师关系表 服务实现类
 * </p>
 *
 * @author itcast
 */
@Slf4j
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher> implements CourseTeacherService {

    @Autowired
    CourseTeacherMapper courseTeacherMapper;

    @Override
    public List<CourseTeacher> findTeacher(long id) {
        return courseTeacherMapper.findTeacher(id);
    }

    @Transactional
    public void saveTeacher(CourseTeacher courseTeacher) {
        if (courseTeacher.getId() != null) {
            courseTeacherMapper.updateById(courseTeacher);
        }else {
            int i = courseTeacherMapper.insert(courseTeacher);
            if(i<=0) {
                XueChengPlusException.cast("新增教师失败");
            }
        }
    }

//    @Transactional
//    public CourseTeacher updateTeacher(CourseTeacher courseTeacher) {
////        courseTeacherMapper.
//        courseTeacherMapper.updateById(courseTeacher);
//        return courseTeacherMapper.selectById(courseTeacher.getId());
//    }

    @Transactional
    public void deleteTeacher(long id) {
        int i = courseTeacherMapper.deleteById(id);
        if (i == 0) {
            XueChengPlusException.cast("删除失败");
        }
    }
}
