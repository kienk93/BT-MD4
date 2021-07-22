package com.codegym.service;

import com.codegym.model.Comment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class CommentServiceImpl implements ICommentService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Comment> findAllWithinDay() {
        String queryString = "SELECT C FROM Comment AS c where c.timestamp >= current_date";
        TypedQuery<Comment> query = entityManager.createQuery(queryString, Comment.class);
        return query.getResultList();
    }

    @Override
    public Comment findById(Long id) {
        String query2 = "SELECT c from Comment AS c where c.id= :id";
        TypedQuery<Comment> query = entityManager.createQuery(query2, Comment.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Comment save(Comment comment) {
        if (comment.getId() != null) {
            entityManager.merge(comment);
        } else {
            entityManager.persist(comment);
        }

        return comment;
    }

}