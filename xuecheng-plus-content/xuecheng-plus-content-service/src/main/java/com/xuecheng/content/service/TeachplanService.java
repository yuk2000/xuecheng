package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.dto.BindTeachplanMediaDto;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;

import java.util.List;

/**
 * <p>
 * 课程计划 服务类
 * </p>
 *
 * @author itcast
 * @since 2023-06-10
 */
public interface TeachplanService extends IService<Teachplan> {

    public List<TeachplanDto> findTeachplanTree(long courseId);

    public void saveTeachplan(SaveTeachplanDto teachplanDto);

    public void deleteTeachplan(long courseId);

    public TeachplanMedia associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);

    public void deleteMedia(long id);
}
