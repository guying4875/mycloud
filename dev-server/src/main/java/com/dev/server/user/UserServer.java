package com.dev.server.user;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 上午11:58
 */

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 上午11:58
 *
 */
@RestController
@RequestMapping("/user")
public class UserServer {

    @RequestMapping(value="/getuser/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getUserById(@PathVariable("id")String id){
        return "hello"+id+"user-server";
    }

    @RequestMapping("/getusers")
    public List getUsers(){
        List list = new ArrayList();
        for(int i=0;i<10;i++){
            list.add("user-"+i);
        }
        return list;
    }
}
