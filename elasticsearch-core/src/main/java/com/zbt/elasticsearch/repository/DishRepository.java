package com.zbt.elasticsearch.repository;

import com.zbt.elasticsearch.model.Dish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Frank Zhang on 16/1/21.
 */
public interface DishRepository extends CrudRepository<Dish, String> {

    List<Dish> findByName(String name);
}
