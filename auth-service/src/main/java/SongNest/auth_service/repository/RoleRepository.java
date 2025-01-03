package SongNest.auth_service.repository;

import SongNest.auth_service.enums.RoleName;
import SongNest.auth_service.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}