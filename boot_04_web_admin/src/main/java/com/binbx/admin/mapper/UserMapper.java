package com.binbx.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.binbx.admin.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @ClassName: UserMapper
 * @Author: bxie
 * @Date: 2022/3/15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
