package com.binbx.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public interface Person {

   String getName();
   Integer getAge();

}
