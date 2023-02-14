package com.unidad2.examen.services.product;

import com.unidad2.examen.controllers.product.ProductController;
import com.unidad2.examen.models.product.Product;
import com.unidad2.examen.models.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;


}
