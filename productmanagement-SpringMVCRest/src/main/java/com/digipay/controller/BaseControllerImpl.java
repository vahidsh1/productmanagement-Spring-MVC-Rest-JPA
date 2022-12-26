package com.digipay.controller;

import com.digipay.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseControllerImpl<T> implements BaseController<T> {

    @Autowired
    private AccessController accessController;
    @Autowired
    private BaseService<T> baseService;

    Boolean accessFlag=false;
    @GetMapping("/list")
    @Override
    public List<T> list(@RequestParam String userNationalID) {
        accessFlag = accessController.checkAccess(userNationalID, "list");
        if (accessFlag) {
            List<T> t = baseService.listAll();
            return t;
        } else {
            throw new RuntimeException();
        }

    }

    //todo: add check user access before crud operation
    @PostMapping("/create")
    @Override
    public String create(@RequestBody T t, @RequestParam String userNationalID) {
        accessFlag = accessController.checkAccess(userNationalID, "create");
        if (accessFlag) {
            baseService.create(t);
            return "The product saved!";
        } else {
            throw new RuntimeException();
        }
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public String delete(@PathVariable int id,  @RequestParam String userNationalID) {
        accessFlag = accessController.checkAccess(userNationalID, "delete");
        if (accessFlag) {
            baseService.delete(id);
            return "Product deleted!";
        } else {
            throw new RuntimeException();
        }
    }
    @Override
    public String update(Integer id,  T t, String userNationalID){

        return "Product updated!";
    }

}
