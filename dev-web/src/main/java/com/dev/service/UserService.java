package com.dev.service;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午1:13
 */

import com.dev.hystrix.UserHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午1:13
 *
 */
@FeignClient(name="userserver",fallback = UserHystrix.class)
public interface UserService {

    @RequestMapping(value="/user/getuser/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String selectUserById(@PathVariable("id")String id);

    @RequestMapping("/user/getusers")
    public List selectUsers();
}
