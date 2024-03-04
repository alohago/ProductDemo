package com.citi.service;

import com.citi.model.Product;
import com.citi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        // if optionalProduct has product object, return it. Otherwise, return null
        return optionalProduct.orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        if (optionalProduct.isPresent()) {
            Product bauProduct = optionalProduct.get();
            bauProduct.setName(product.getName());
            bauProduct.setPrice(product.getPrice());
            bauProduct.setCategory(product.getCategory());
            return productRepository.save(bauProduct);
        }
        return null;
    }

    @Override
    public int deleteProductById(Long productId) {
        productRepository.deleteById(productId);
        return 0;
    }
}
