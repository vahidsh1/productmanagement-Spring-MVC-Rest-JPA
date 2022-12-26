package com.digipay.controller;

import external.client.generated.User;

import java.util.List;

public interface BaseController<T> {
    List<T> list(String userNationalID);
    String create(T t, String userNationalID);
    String delete(int id,  String userNationalID);
    String update(Integer id, T t, String userNationalID);

}