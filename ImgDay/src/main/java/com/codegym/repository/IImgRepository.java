package com.codegym.repository;

import com.codegym.model.Img;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IImgRepository extends JpaRepository<Img, Long> {






}

//    List<Img> findAll();
//
//    Img findById(Long id);
//
//    void save(Img img);
//
//    void remove(Long id);
