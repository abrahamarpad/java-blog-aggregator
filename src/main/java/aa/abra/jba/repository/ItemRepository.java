package aa.abra.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aa.abra.jba.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}
