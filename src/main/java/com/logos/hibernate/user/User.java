package com.logos.hibernate.user;

import com.logos.hibernate.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
    @Enumerated(EnumType.STRING)
    private UserType type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date createTime;

    private Address address;
    @AttributeOverrides({
            @AttributeOverride(name ="street",column = @Column(name="billing_street")),
            @AttributeOverride(name ="zipCode",column = @Column(name="billing_zip_code"))
    })
    private Address billingAddress;
    public User(UserCreateParams params) {
        this.name = params.getName();
        this.type = UserType.MASTER;
        this.address = new Address(params.getStreet(),params.getZipCode());
        this.billingAddress = new Address(params.getBillingStreet(),params.getBillingZipCode());
    }

    public UserVo toVo(){
        UserVo vo = new UserVo(this.name);
        return vo;
    }
}
