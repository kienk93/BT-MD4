package com.example.imgoftheday.service.img;

import com.example.imgoftheday.model.Img;
import com.example.imgoftheday.repository.IImgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ImgServiceImpl implements IImgService{
    @Autowired
    IImgRepository imgRepository;


    @Override
    public Iterable<Img> findAll() {
        return imgRepository.findAll();
    }

    @Override
    public Optional<Img> findById(Long id, Pageable pageable) {
        return imgRepository.findById(id,pageable);
    }


    @Override
    public Img save(Img img) {
        return imgRepository.save(img);
    }

    @Override
    public void delete(Long id) {
        imgRepository.deleteById(id);
    }

    @Override
    public Page<Img> findAll(Pageable pageable) {
        return imgRepository.findAll(pageable);
    }
}
