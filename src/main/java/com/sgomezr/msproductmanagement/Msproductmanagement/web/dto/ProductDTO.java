package com.sgomezr.msproductmanagement.Msproductmanagement.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long idProduct;
    private Long idUser;
    private String name;
    private String code;
}
