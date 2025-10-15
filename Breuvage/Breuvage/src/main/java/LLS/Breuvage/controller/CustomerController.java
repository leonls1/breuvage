package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.CustomerRequestDto;
import LLS.Breuvage.model.dto.response.CustomerResponseDto;
import LLS.Breuvage.model.entity.Customer;
import LLS.Breuvage.service.ICustomerService;
import LLS.Breuvage.service.implement.CustomerServiceImp;
import LLS.Breuvage.service.implement.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController extends GController<Customer, Long, CustomerRequestDto, CustomerResponseDto> {
    @Autowired
    public CustomerController(CustomerServiceImp service) {
        super(service);
    }
}
