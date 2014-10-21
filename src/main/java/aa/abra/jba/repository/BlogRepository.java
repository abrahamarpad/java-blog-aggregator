package aa.abra.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aa.abra.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
