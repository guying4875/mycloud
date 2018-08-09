package com.dev.server;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午1:13
 */

import com.dev.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午1:13
 *
 */
@SuppressWarnings("all")
@RestController
@RequestMapping("user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String queryUser(@PathVariable("id")String id){
        logger.debug("调用服务层");
        return userService.selectUserById(id);
//        return id;
    }

    @RequestMapping("queryusers")
    public List queryUsers(){
        return userService.selectUsers();
    }
}
