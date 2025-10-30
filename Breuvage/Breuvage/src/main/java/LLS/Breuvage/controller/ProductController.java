/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.ProductRequestDto;
import LLS.Breuvage.model.dto.response.ProductResponseDto;
import LLS.Breuvage.model.entity.Product;
import LLS.Breuvage.model.entity.ProductCategory;
import LLS.Breuvage.service.implement.ProductServiceImp;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/product")
public class ProductController extends GController<Product, Long, ProductRequestDto, ProductResponseDto> {
    @Autowired
    public ProductController(ProductServiceImp service) {
        super(service);
    }

    @GetMapping(params = "category")
    public ResponseEntity<?> findProductsByCategory (ProductCategory category){
        List<Product> products = ((ProductServiceImp)super.getService()).findByCategory(category);
        return ResponseEntity.ok("");
    }

    @GetMapping(params = "name")
    public ResponseEntity<?> findProductByName(String name){
        return ResponseEntity.ok("");
    }

}
