package com.codegym.studycase4.service.user;


import com.codegym.studycase4.model.User;
import com.codegym.studycase4.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Page<User> findAll(Integer page, Integer size);

    Page<User> findAllByUsernameContaining(String username, Integer page, Integer size);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Page<User> findAllByRoleName(String roleName, Integer page, Integer size);
}
