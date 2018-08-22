package com.sgomezr.msproductmanagement.Msproductmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue
    @Column(name = "idProduct")
    private Long idProduct;

    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

}
