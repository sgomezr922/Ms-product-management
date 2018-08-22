package com.sgomezr.msproductmanagement.Msproductmanagement.web.rest;

import com.sgomezr.msproductmanagement.Msproductmanagement.service.IProductService;
import com.sgomezr.msproductmanagement.Msproductmanagement.web.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class ProductResource {

    @Autowired
    IProductService productService;

    @RequestMapping(value = "product", method = RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @RequestMapping(value = "product/{idUser}", method = RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> getProductsByIdUser(@PathVariable Long idUser){
        List<ProductDTO> productByIdUser = productService.getProductByIdUser(idUser);
        return ResponseEntity.ok(productByIdUser);
    }

    @RequestMapping(value = "product/{idUser}", method = RequestMethod.POST)
    public ResponseEntity<Void> createProductForUser(
            @RequestBody ProductDTO productDTO,
            @PathVariable Long idUser) {
        productService.createProductByUser(idUser, productDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "product/{idUser}", method = RequestMethod.DELETE)
    public ResponseEntity<List<ProductDTO>> deleteProductsByIdUser(@PathVariable Long idUser){
        List<ProductDTO> productDelete = productService.deleteProductsByUser(idUser);
        System.out.println("Deleting product...");
        return ResponseEntity.ok(productDelete);
    }


}
