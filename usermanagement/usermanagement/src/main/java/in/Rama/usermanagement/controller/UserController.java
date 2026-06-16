package in.Rama.usermanagement.controller;

import in.Rama.usermanagement.dto.UserDto;
import in.Rama.usermanagement.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @Operation(summary = "Create a user")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto updatedUserDto = userService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(updatedUserDto);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
        try {
            UserDto userById = userService.getUserById(id);
            return ResponseEntity.status(HttpStatus.OK).body(userById);
        } catch (RuntimeException e) {
            if(e.getMessage().equals("Not Found")) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        }
        throw new RuntimeException();
    }
}
