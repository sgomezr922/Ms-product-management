package com.sgomezr.msproductmanagement.Msproductmanagement.repository;

import com.sgomezr.msproductmanagement.Msproductmanagement.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<ProductEntity,Long> {
    List<ProductEntity> findByIdUser(Long idUser);
    List<ProductEntity> deleteByIdUser(Long idUser);
}
