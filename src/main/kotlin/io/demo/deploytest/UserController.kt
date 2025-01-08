package io.demo.deploytest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userService: UserService,
) {
    @GetMapping("/{userId}")
    fun getUser(@PathVariable(name = "userId") userId: Long): ResponseEntity<GetUserResponse> {
        return ResponseEntity.ok(userService.getUserById(userId))
    }

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<GetUserResponse>> {
        return ResponseEntity.ok(userService.getAllUsers())
    }

    @PostMapping
    fun saveUser(@RequestBody request: CreateUserRequest) {
        userService.saveUser(request)
    }
}