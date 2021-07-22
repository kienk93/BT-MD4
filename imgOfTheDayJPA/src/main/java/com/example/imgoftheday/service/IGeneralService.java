package com.example.imgoftheday.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id, Pageable pageable);

    T save (T t);

    void delete(Long id);
}
