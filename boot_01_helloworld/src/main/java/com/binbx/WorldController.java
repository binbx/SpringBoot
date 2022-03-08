package com.binbx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: WorldController
 * @Author: bxie
 * @Date: 2022/3/8
 */
@RestController
public class WorldController {

    @RequestMapping("/w")
    public String world66(){
        return "World";
    }
}
