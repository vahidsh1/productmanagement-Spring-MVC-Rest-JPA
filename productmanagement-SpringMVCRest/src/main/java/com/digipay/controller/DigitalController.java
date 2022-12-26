package com.digipay.controller;

import com.digipay.model.entity.DigitalProduct;

public interface DigitalController extends BaseController<DigitalProduct> {

    public String update(Integer id, DigitalProduct digitalProduct,String userNationalID);

}
