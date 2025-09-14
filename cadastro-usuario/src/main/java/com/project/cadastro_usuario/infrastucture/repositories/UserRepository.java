package com.project.cadastro_usuario.infrastucture.repositories;

import com.project.cadastro_usuario.infrastucture.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
