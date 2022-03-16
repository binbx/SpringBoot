package com.binbx.admin.service;

import com.binbx.admin.bean.Account;

/**
 * @Description:
 * @ClassName: AccountService
 * @Author: bxie
 * @Date: 2022/3/15
 */
public interface AccountService {

    Account getAcctByid(Long id);
}
