package br.kanbanboard.kanbanboard.domain.entity;

import br.kanbanboard.kanbanboard.domain.DTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @Generated
    private String id;

    @Column(nullable = false, length = 100, name="name")
    private String name;

    /**
     * TO Constructor.
     * @param user {@Link UserDTO} DTO
     *
     */

    public User(UserDTO user){
        this.id = user.getId();
        this.name = user.getName();
    }


}
