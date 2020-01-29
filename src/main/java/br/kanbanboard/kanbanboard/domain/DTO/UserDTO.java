package br.kanbanboard.kanbanboard.domain.DTO;

import br.kanbanboard.kanbanboard.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDTO {

    private String id;
    private String name;


    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
    }
}
