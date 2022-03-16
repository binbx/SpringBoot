package com.binbx.admin.service.impl;

import com.binbx.admin.bean.City;
import com.binbx.admin.mapper.CityMapper;
import com.binbx.admin.service.CityService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @ClassName: CityServiceImpl
 * @Author: bxie
 * @Date: 2022/3/14
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    //统计计数
    Counter counter;
    public CityServiceImpl(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("cityService.saveCity.count");
    }


    //查询
    public City getById(Long id){
        return cityMapper.getById(id);
    }

    //插入
    public void saveCity(City city) {
//        counter.increment();
        cityMapper.insert(city);

    }
}
