package br.kanbanboard.kanbanboard.controllers;

import br.kanbanboard.kanbanboard.controllers.common.Response;
import br.kanbanboard.kanbanboard.domain.DTO.UserDTO;
import br.kanbanboard.kanbanboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Burger REST Controller.
 *
 * @author Anthony Vilarim Caliani
 * @since 19.2.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public ResponseEntity findAll() {
        return ResponseEntity.ok(userService.find());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity findOnde(@PathVariable Long id) {
        return ResponseEntity.ok(new Response("ble"));
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity save(@PathVariable UserDTO userDTO){
        return ResponseEntity.ok(new Response("bll"));
    }

}
