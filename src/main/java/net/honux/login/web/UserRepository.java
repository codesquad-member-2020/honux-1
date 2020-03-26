package net.honux.login.web;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

   @Query("select id, email, created_date from user where email = :email")
   Optional<User> findByEmail(@Param("email") String email);

}
