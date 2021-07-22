package com.example.imgoftheday.repository;


import com.example.imgoftheday.model.Img;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IImgRepository extends JpaRepository<Img, Long> {
    Page<Img> findAll(Pageable pageable);

    Optional<Img> findById(Long id, Pageable pageable);




}

//    List<Img> findAll();
//
//    Img findById(Long id);
//
//    void save(Img img);
//
//    void remove(Long id);

//@Transactional
//public class ImgRepository implements IImgRepository{
//    @PersistenceContext
//    private EntityManager em;
//    @Override
//    public List<Img> findAll() {
//         TypedQuery<Img> query = em.createQuery("select c from Img c",Img.class);
//         return query.getResultList();
//    }
//
//    @Override
//    public Img findById(Long id) {
//        TypedQuery<Img> query = em.createQuery("select c from Img c where  c.id=:id", Img.class);
//        query.setParameter("id", id);
//        try {
//            return query.getSingleResult();
//        } catch (NoResultException e) {
//            return null;
//        }
//    }
//
//    @Override
//    public void save(Img img) {
//        if (img.getId() != null) {
//            em.merge(img);
//        } else {
//            em.persist(img);
//        }
//    }
//
//    @Override
//    public void remove(Long id) {
//        Img img = findById(id);
//        if (img != null) {
//            em.remove(img);
//        }
//
//    }
