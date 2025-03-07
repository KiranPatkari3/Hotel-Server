package com.hotelbooking.lakeSide_hotel.repository;



import com.hotelbooking.lakeSide_hotel.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String role);


    boolean existsByName(String role);
}
