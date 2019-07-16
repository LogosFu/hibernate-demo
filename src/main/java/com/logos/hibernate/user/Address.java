package com.logos.hibernate.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author LogosFu
 * @since 2019-07-14 10:17
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;
    private String zipCode;
}
