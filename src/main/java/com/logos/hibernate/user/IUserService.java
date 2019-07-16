package com.logos.hibernate.user;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-16 22:08
 */
public interface IUserService {
     UserVo save(UserCreateParams params);
     List<UserDto> getDto();
}
