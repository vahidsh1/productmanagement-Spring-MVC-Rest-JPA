package com.digipay.controller;

import external.client.generated.User;

import java.util.List;

public interface BaseController<T> {
    List<T> list(User user);
    String create(T t);
    String delete(int id, T t);
    String update(Integer id, T t);

}