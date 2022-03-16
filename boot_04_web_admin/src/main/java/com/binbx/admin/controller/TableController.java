package com.binbx.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.binbx.admin.bean.User;
import com.binbx.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 处理 table静态资源目录下面的资源跳转
 * @ClassName: TableController
 * @Author: bxie
 * @Date: 2022/3/10
 */
@Controller
public class TableController {

    @Autowired
    UserService userService;

    /**
     *
     * @param a  不带请求参数或者参数类型不对 报400；Bad Request  一般都是浏览器的参数没有传递正确
     * @return
     */
    @GetMapping("/basic_table")
    public String basic_table(@RequestParam("a") int a){

        int i = 10/0;
        return "table/basic_table";
    }

    //删除的方法
    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra){

        userService.removeById(id);

        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }


    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value="pn",defaultValue = "1") Integer pn, Model model){
        //表格内容的遍历
    //    response.sendError
//        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
//                new User("lisi", "123444"),
//                new User("haha", "aaaaa"),
//                new User("hehe ", "aaddd"));
//        model.addAttribute("users",users);

//        if(users.size()>3){
//            throw new UserTooManyException();
//        }


        //从数据库中查出user表中的用户进行展示
//        List<User> list = userService.list();
//        model.addAttribute("users",list);

        //构造分页参数
        Page<User> page = new Page<>(pn, 2);
        //调用page进行分页
        Page<User> userPage = userService.page(page, null);

//        userPage.getRecords()
//        userPage.getCurrent()
//        userPage.getPages()

        model.addAttribute("users",userPage);

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
