package com.apps.inventory.repository;


import com.apps.inventory.model.Restaurant;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RestaurantRepository extends SimpleJpaRepository<Restaurant, String> {
    private final EntityManager em;
    public RestaurantRepository(EntityManager em) {
        super(Restaurant.class, em);
        this.em = em;
    }
    @Override
    public List<Restaurant> findAll() {
        return em.createNativeQuery("Select * from \"InventoryV611\".\"Restaurant\"", Restaurant.class).getResultList();
    }
}