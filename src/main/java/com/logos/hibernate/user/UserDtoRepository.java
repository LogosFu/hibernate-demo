package com.logos.hibernate.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-16 22:06
 */
public interface UserDtoRepository extends JpaRepository<UserDto,Long> {
}
