package dio.lab.spring.ip.ipinfo.controller;

import dio.lab.spring.ip.ipinfo.model.UserIP;
import dio.lab.spring.ip.ipinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("IP")
public class UserRestController  {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<UserIP>> getAllUsers() {
        return ResponseEntity.ok(userService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserIP> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<UserIP> addUser(@RequestBody UserIP UserIP) {
        userService.salvar(UserIP);
        return ResponseEntity.ok(UserIP);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserIP> updateUser(@RequestBody UserIP UserIP, @PathVariable Long id) {
        userService.editar(id, UserIP);
        return ResponseEntity.ok(UserIP);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserIP> deleteUser(@PathVariable Long id) {
        userService.excluir(id);
        return ResponseEntity.ok().build();
    }




}
