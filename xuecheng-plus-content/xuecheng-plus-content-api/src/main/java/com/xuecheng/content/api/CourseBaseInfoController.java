package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
//@RequestMapping("content")
public class CourseBaseInfoController {

    @Autowired
    CourseBaseService courseBaseService;

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> List(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {

        PageResult<CourseBase> pageResult = courseBaseService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        return pageResult;

    }

    @ApiOperation("新增课程基础信息")
    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody AddCourseDto addCourseDto){

        Long companyId = 1232141425L;
        return courseBaseService.createCourseBase(companyId,addCourseDto);

    }

}
