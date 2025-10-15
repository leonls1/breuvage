package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.CustomerNotFoundException;
import LLS.Breuvage.model.dto.request.CustomerRequestDto;
import LLS.Breuvage.model.dto.response.CustomerResponseDto;
import LLS.Breuvage.model.entity.Customer;
import LLS.Breuvage.model.mapper.CustomerMapper;
import LLS.Breuvage.model.mapper.GMapper;
import LLS.Breuvage.repository.CustomerRepository;
import LLS.Breuvage.repository.GRepository;
import LLS.Breuvage.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn({"customerRepository"})
public class CustomerServiceImp  extends GService<Customer, Long, CustomerRequestDto, CustomerResponseDto> implements ICustomerService {

    @Autowired
    public CustomerServiceImp(CustomerRepository repository, CustomerMapper mapper) {
        super(repository, mapper, new CustomerNotFoundException("There isn't a customer with that id"));
    }
}
