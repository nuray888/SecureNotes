package org.example.noteapplication.repository;

import org.example.noteapplication.model.AppRole;
import org.example.noteapplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
