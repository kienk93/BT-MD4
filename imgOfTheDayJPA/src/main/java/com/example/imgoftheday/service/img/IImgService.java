package com.example.imgoftheday.service.img;


import com.example.imgoftheday.model.Img;
import com.example.imgoftheday.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IImgService extends IGeneralService<Img> {
    Page<Img> findAll(Pageable pageable);

    Page<Img> findByI
}
