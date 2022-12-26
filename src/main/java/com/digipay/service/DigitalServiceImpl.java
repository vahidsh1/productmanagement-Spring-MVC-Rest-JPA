package com.digipay.service;

import com.digipay.model.entity.DigitalProduct;
import com.digipay.repository.DigitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DigitalServiceImpl extends BaseServiceImpl<DigitalProduct> implements DigitalService {
    @Autowired
    protected DigitalRepository repo;

    public DigitalServiceImpl(DigitalRepository repo) {
        this.repo = repo;
    }

    public DigitalServiceImpl() {

    }

    @Override
    public void update(DigitalProduct digitalProductOld, DigitalProduct digitalProductFetched) {
        digitalProductFetched.setRam(digitalProductOld.getRam());
        digitalProductFetched.setPrice(digitalProductOld.getPrice());
        digitalProductFetched.setBrand(digitalProductOld.getBrand());
        digitalProductFetched.setCpuModel(digitalProductOld.getCpuModel());
        digitalProductFetched.setUserNationalID(digitalProductOld.getUserNationalID());
        repo.save(digitalProductFetched);
    }
}
