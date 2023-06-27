package com.xuecheng.content.api;

import com.xuecheng.content.mapper.CourseTeacherMapper;
import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "教师编辑接口",tags = "教师编辑接口")
@RestController
public class CourseTeacherController {

    @Autowired
    CourseTeacherService courseTeacherService;

    @GetMapping("/courseTeacher/list/{id}")
    public List<CourseTeacher> findTeacher(@PathVariable Long id) {
        return courseTeacherService.findTeacher(id);
    }

    @PostMapping("/courseTeacher")
    public void saveTeacher(@RequestBody CourseTeacher courseTeacher) {
        courseTeacherService.saveTeacher(courseTeacher);
    }

//    @PutMapping("/courseTeacher")
//    public CourseTeacher updateTeacher(@RequestBody CourseTeacher courseTeacher) {
//        return courseTeacherService.updateTeacher(courseTeacher);
//    }

    @DeleteMapping("/courseTeacher/course/{i}/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        courseTeacherService.deleteTeacher(id);
    }
}
