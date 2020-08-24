package com.hukun.dao;

import com.hukun.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-24 12:34:06
 */
@Repository
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserEntity queryById(Integer id);

    public int count();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param User 实例对象
     * @return 对象列表
     */
    List<UserEntity> queryAll(UserEntity User);

    /**
     * 新增数据
     *
     * @param User 实例对象
     * @return 影响行数
     */
    int insert(UserEntity User);

    /**
     * 修改数据
     *
     * @param User 实例对象
     * @return 影响行数
     */
    int update(UserEntity User);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}