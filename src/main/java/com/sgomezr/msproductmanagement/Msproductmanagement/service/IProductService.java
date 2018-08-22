package com.sgomezr.msproductmanagement.Msproductmanagement.service;

import com.sgomezr.msproductmanagement.Msproductmanagement.web.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getAllProducts();
    List<ProductDTO> getProductByIdUser(long idUser);
    ProductDTO createProductByUser(long idUser, ProductDTO product);
    List<ProductDTO> deleteProductsByUser(long idUser);

}

