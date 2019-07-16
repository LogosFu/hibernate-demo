package com.logos.hibernate.user;

import org.springframework.stereotype.Service;
import org.w3c.dom.UserDataHandler;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:32
 */
@Service
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final UserDtoRepository userDtoRepository;

    public UserService(UserRepository userRepository, UserDtoRepository userDtoRepository) {
        this.userRepository = userRepository;
        this.userDtoRepository = userDtoRepository;
    }

    @Transactional
    public UserVo save(UserCreateParams params){
        // gen domain
        User user = new User(params);
        // save
        userRepository.save(user);
        // return vo
        return user.toVo();
    };

    public List<UserDto> getDto(){
        return  userDtoRepository.findAll();
    }
}
