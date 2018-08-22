package com.sgomezr.msproductmanagement.Msproductmanagement.service.impl;

import com.sgomezr.msproductmanagement.Msproductmanagement.entity.ProductEntity;
import com.sgomezr.msproductmanagement.Msproductmanagement.repository.IProductRepository;
import com.sgomezr.msproductmanagement.Msproductmanagement.service.IProductService;
import com.sgomezr.msproductmanagement.Msproductmanagement.web.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> collect = productRepository.findAll()
                .stream()
                .map(
                        entity -> new ProductDTO(
                                entity.getIdProduct(),
                                entity.getIdUser(),
                                entity.getName(),
                                entity.getCode()
                        )
                ).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<ProductDTO> getProductByIdUser(long idUser) {
        List<ProductDTO> collect = productRepository.findByIdUser(idUser)
                .stream()
                .map(entity -> new ProductDTO(
                        entity.getIdProduct(),
                        entity.getIdUser(),
                        entity.getName(),
                        entity.getCode()
                )).collect(Collectors.toList());
        return collect;
    }

    @Override
    public ProductDTO createProductByUser(long idUser, ProductDTO product) {
        ProductEntity entity = new ProductEntity(
                null,
                idUser,
                product.getName(),
                product.getCode()
        );
        ProductEntity result = productRepository.save(entity);

        return new ProductDTO(
                result.getIdProduct(),
                result.getIdUser(),
                result.getName(),
                result.getCode()
        );
    }

    @Override
    public List<ProductDTO> deleteProductsByUser(long idUser) {
        List<ProductEntity> productDelete= productRepository.deleteByIdUser(idUser);
        return productDelete.stream().map(entity -> new ProductDTO(
                entity.getIdProduct(),
                entity.getIdUser(),
                entity.getName(),
                entity.getCode()
        )).collect(Collectors.toList());
    }
}


