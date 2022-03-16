package com.binbx.admin.mapper;


import com.binbx.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @ClassName: AccountMapper
 * @Author: bxie
 * @Date: 2022/3/14
 */
@Mapper
public interface AccountMapper {

    public Account getAcct(Long id);
}
