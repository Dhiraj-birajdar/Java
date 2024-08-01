package com.q3.repository;

import com.q3.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product,Integer> {

    public List<Product> findAllByPriceGreaterThan(double price);
//    public List<Product> findTopByPriceOrderByPriceIdDesc();

    @Query("""
select p from Product p order by p.price desc limit :n
""")
    public List<Product> nMostExpensive(int n);

    @Query("select p from Product p order by p.price desc")
public List<Product> findTopNMostExpensive(Pageable pageable);



}
