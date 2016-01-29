package com.zbt.elasticsearch.controller;

import com.zbt.elasticsearch.model.Dish;
import com.zbt.elasticsearch.repository.DishRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Frank Zhang on 16/1/26.
 */
@RestController
@RequestMapping("/dish")
public class DishController {

    @Resource
    private DishRepository dishRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Dish dish) {
        dishRepository.save(dish);
        return null;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Dish get(@PathVariable String id) {
        Dish dish = dishRepository.findOne(id);
        return dish;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public String update() {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public String delete() {
        return null;
    }

}
