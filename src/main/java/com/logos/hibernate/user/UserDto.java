package com.logos.hibernate.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-16 21:59
 */
@Entity
@org.hibernate.annotations.Immutable
@org.hibernate.annotations.Subselect(
        value = "SELECT  u.id AS ID, u.name AS NAME,p.name AS NICK_NAME FROM user u \n" +
                "LEFT JOIN user_po p ON u.id =p.id"
)
@org.hibernate.annotations.Synchronize({"user","user_po"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name="NICK_NAME")
    private String nickName;
}
