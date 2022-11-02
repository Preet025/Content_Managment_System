package com.upsc.contentmgmt.repo;

import com.upsc.contentmgmt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
