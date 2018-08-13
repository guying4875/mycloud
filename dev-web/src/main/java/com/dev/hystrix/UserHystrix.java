package com.dev.hystrix;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午2:55
 */

import com.dev.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午2:55
 *
 */
@Component
public class UserHystrix implements UserService {
    @Override
    public String selectUserById(String id) {
        return "sorry selectuserbyid is stop";
    }

    @Override
    public List selectUsers() {
        return new ArrayList();
    }
}
