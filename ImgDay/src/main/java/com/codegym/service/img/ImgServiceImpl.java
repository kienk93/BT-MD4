package com.codegym.service.img;

import com.codegym.model.Img;
import com.codegym.repository.IImgRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ImgServiceImpl implements IImgService{
    @Autowired
    IImgRepository imgRepository;
    @Override
    public Iterable<Img> findAll() {
        return imgRepository.findAll();
    }

    @Override
    public Optional<Img> findById(Long id) {
        return imgRepository.findById(id);
    }

    @Override
    public Img save(Img img) {
        return imgRepository.save(img);
    }

    @Override
    public void delete(Long id) {
        imgRepository.deleteById(id);
    }
}
