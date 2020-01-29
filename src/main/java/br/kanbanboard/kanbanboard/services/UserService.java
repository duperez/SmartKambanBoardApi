package br.kanbanboard.kanbanboard.services;

import br.kanbanboard.kanbanboard.domain.DTO.UserDTO;
import br.kanbanboard.kanbanboard.domain.entity.User;
import br.kanbanboard.kanbanboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> find(){
        List<UserDTO> lst = new ArrayList<>();
        userRepository.findAll().forEach(user -> lst.add(new UserDTO(user)));
        return lst;
    }


}
