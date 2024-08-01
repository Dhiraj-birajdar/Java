package com.q3.service;

import com.q3.entity.Product;
import com.q3.repository.ProductJpaRepository;
import com.q3.repository.ProductRepository;
import com.q3.repository.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductJpaRepository jpaRpository;

    public Status update(Product p) {
        return repository.update(p);
    }

    public List<Product> getAbovePrice(double p) {
//        return repository.getAll().stream()
//                .filter(pr-> pr.getPrice()>p)
//                .toList();
        return jpaRpository.findAllByPriceGreaterThan(p);
    }

    public List<Product> getNMostExpensive(int n) {
//        return repository.getAll().stream()
//                .sorted((p1,p2)-> Double.compare(p2.getPrice(),p1.getPrice()))
//                .limit(n)
//                .toList();
//        Pageable pageable = PageRequest.of(0, n, Sort.by(Sort.Order.desc("price")));
//        return jpaRpository.findTopNMostExpensive(pageable);
return jpaRpository.nMostExpensive(n);
    }

    public List<Product> get(int n) {
        jpaRpository.save()
        return List.of();
    }
}
