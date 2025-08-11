package net.javaguides.springdatajpa.repository;

import net.javaguides.springdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
