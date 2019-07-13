package com.logos.hibernate.user;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:32
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
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
}
