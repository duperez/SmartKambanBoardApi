package br.kanbanboard.kanbanboard.repositories;

import br.kanbanboard.kanbanboard.domain.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {



}
