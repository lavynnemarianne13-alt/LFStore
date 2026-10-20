package com.lavynne.lfstore.repositories;

import com.lavynne.lfstore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
