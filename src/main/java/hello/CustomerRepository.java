package hello;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by prasetia on 7/5/2017.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
