package aa.abra.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aa.abra.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
