package com.ly.edu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ly.edu.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.edu.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author ly
 * @since 2020-11-26
 */
public interface TeacherService extends IService<Teacher> {
    void pageQuery(Page<Teacher> pageParam, TeacherQuery teacherQuery);
}
