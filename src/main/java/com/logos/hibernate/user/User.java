package com.logos.hibernate.user;

import com.logos.hibernate.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-13 22:11
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR)
    private Long id;
    private String name;

    public User(UserCreateParams params) {
        this.name = params.getName();
    }

    public UserVo toVo(){
        UserVo vo = new UserVo(this.name);
        return vo;
    }
}
