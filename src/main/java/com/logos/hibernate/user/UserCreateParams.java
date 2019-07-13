package com.logos.hibernate.user;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:32
 */
@Data
public class UserCreateParams {
    /**
     * 所创建用户的用户名
     */
    private String name;
}
