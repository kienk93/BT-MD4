package com.codegym.studycase4.service.role;


import com.codegym.studycase4.model.security.ERole;
import com.codegym.studycase4.model.Role;
import com.codegym.studycase4.service.IGeneralService;

import java.util.Optional;

public interface IRoleService extends IGeneralService<Role> {
    Optional<Role> findByName(ERole name);
}
