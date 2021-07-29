package com.codegym.studycase4.repository;

import com.codegym.studycase4.model.security.ERole;
import com.codegym.studycase4.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
