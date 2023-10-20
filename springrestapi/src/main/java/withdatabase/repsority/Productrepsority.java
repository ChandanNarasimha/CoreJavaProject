package withdatabase.repsority;
import org.springframework.data.jpa.repository.JpaRepository;

import withdatabase.entity.Product;




public interface Productrepsority extends JpaRepository<Product, Integer> {

}