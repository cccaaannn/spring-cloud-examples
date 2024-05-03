package com.kurtcan.sepproductservice.product;

import com.kurtcan.sepproductservice.product.request.ProductAdd;
import com.kurtcan.sepproductservice.product.request.ProductUpdate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface ProductService {
    Product getProduct(UUID id);

    Page<Product> searchProduct(String criteriaStr, PageRequest pageRequest);

    Product addProduct(ProductAdd productAdd);

    Product updateProduct(UUID id, ProductUpdate productUpdate);

    void deleteProduct(UUID id);
}
