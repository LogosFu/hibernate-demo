package com.logos.hibernate.web;

import com.logos.hibernate.user.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:35
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService iUserService;

    public UserController( IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/")
    public UserVo create(@RequestBody UserCreateParams userCreateParams){
        return iUserService.save(userCreateParams);
    }


    @GetMapping("/")
    public List<UserDto> get(){
        return iUserService.getDto();
    }
}
