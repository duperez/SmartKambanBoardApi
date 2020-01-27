package com.kanban.board.kanban.Controllers;


import com.kanban.board.kanban.models.ResponseModel;
import com.kanban.board.kanban.models.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseModel<>(new UserModel("001")));
    }
}
