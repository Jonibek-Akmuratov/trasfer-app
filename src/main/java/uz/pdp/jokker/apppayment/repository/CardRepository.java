package uz.pdp.jokker.apppayment.repository;

import uz.pdp.jokker.apppayment.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
    boolean existsByCardNumber(String cardNumber);
}
