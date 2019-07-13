package com.logos.hibernate.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:28
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
