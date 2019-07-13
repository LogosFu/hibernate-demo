package com.logos.hibernate.web;

import com.logos.hibernate.user.UserCreateParams;
import com.logos.hibernate.user.UserService;
import com.logos.hibernate.user.UserVo;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:35
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public UserVo create(@RequestBody UserCreateParams userCreateParams){
        return userService.save(userCreateParams);
    }
}
