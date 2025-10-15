/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.ProductRequestDto;
import LLS.Breuvage.model.dto.response.ProductResponseDto;
import LLS.Breuvage.model.entity.Product;
import LLS.Breuvage.service.ProductService;
import LLS.Breuvage.service.implement.ProductServiceImp;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/product")
public class ProductController extends GController<Product, Long, ProductRequestDto, ProductResponseDto> {
    @Autowired
    public ProductController(ProductServiceImp service) {
        super(service);
    }


}
