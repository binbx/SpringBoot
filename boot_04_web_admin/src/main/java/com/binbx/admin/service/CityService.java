package com.binbx.admin.service;

import com.binbx.admin.bean.City;

/**
 * @Description:
 * @ClassName: CityService
 * @Author: bxie
 * @Date: 2022/3/15
 */
public interface CityService {

    City getById(Long id);

    void saveCity(City city);
}
