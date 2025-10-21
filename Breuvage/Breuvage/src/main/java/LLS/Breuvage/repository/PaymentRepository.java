package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends GRepository<Payment, Long> {
}
