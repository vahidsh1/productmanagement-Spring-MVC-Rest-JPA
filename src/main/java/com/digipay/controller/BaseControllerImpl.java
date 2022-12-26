package com.digipay.controller;

import com.digipay.service.BaseService;
import external.client.generated.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestBody
public class BaseControllerImpl<T> implements BaseController<T> {
    @Autowired
    private BaseService<T> baseService;

    @GetMapping("/list")
    @Override
    public List<T> list(@RequestBody User user) {
            List<T> t = baseService.listAll();
            return t;
    }

    //todo: add check user access before crud operation
    @PostMapping("/create")
    @Override
    public String create(@RequestBody T t) {
            baseService.create(t);
            return "The product saved!";
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(@PathVariable int id, T t) {
        baseService.delete(id);
        return "Product deleted!";
    }
    @Override
    public String update(Integer id, T t){
        return "Product updated!";
    }

}
