package net.javaguides.springboot_restful_webservices_dto.repository;

import net.javaguides.springboot_restful_webservices_dto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}
