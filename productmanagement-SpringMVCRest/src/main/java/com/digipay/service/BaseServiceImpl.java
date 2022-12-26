package com.digipay.service;

import com.digipay.repository.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected BaseRepository<T> repo;

    public BaseServiceImpl(BaseRepository<T> repo) {

        this.repo = repo;
    }

    public BaseServiceImpl() {

    }

    @Override
    public void create(T Entity) {

        repo.save(Entity);
    }

    public T listByID(int id) {

        return repo.findById(id).orElseThrow(()-> new EntityNotFoundException());
    }

    @Override
    public List<T> listAll() {

        return repo.findAll();
    }

    @Override
    public void delete(int id) {

        repo.deleteById(id);
    }

    @Override
    public void update(T EntityNew, T EntityFetched){

    }
}
