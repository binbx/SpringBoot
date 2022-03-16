package com.binbx.admin.service.impl;

import com.binbx.admin.bean.Account;
import com.binbx.admin.mapper.AccountMapper;
import com.binbx.admin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @ClassName: AccountServiceImpl
 * @Author: bxie
 * @Date: 2022/3/14
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id){
        return accountMapper.getAcct(id);

    }
}
