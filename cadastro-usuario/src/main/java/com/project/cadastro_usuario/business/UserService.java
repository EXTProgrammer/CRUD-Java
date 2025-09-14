package com.project.cadastro_usuario.business;

import com.project.cadastro_usuario.infrastucture.entities.User;
import com.project.cadastro_usuario.infrastucture.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.saveAndFlush(user);
    }

    public User searchUserByEmail(String email){

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado.")
        );
    }

    public void deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }

    public void updateUserById(Integer id, User user){
        User userEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado.")
        );
        User updatedUser = User.builder()
            .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
            .name(user.getName() != null ? user.getName() : userEntity.getName())
            .phoneNum(user.getPhoneNum() != null ? user.getPhoneNum() : userEntity.getPhoneNum())
            .id(userEntity.getId())
            .build();

        repository.saveAndFlush(updatedUser);
    }

}
