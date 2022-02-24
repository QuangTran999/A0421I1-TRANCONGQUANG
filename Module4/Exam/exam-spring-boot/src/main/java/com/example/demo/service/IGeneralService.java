package com.codegym.furama.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Integer id);

    void save(T t);

    void remove(Integer id);
}
