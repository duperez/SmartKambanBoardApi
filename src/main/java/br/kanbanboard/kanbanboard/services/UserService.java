package br.kanbanboard.kanbanboard.services;

import br.kanbanboard.kanbanboard.domain.DTO.UserDTO;
import br.kanbanboard.kanbanboard.domain.entity.User;
import br.kanbanboard.kanbanboard.repositories.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> find(){
        List<UserDTO> lst = new ArrayList<>();
        userRepository.findAll().forEach(user -> lst.add(new UserDTO(user)));
        return lst;
    }

    @SneakyThrows
    public UserDTO findById(String id){
        Optional<User> user = userRepository.findById(id);
        if(!user.isPresent())
            throw new Exception("user not found");
        return new UserDTO(user.get());
    }


    public UserDTO save(UserDTO userDTO) {
        return new UserDTO(userRepository.save(new User(userDTO)));
    }

    public UserDTO update(UserDTO userDTO) {
        return new UserDTO(userRepository.save(new User(userDTO)));
    }
}
