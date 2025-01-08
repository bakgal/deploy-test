package io.demo.deploytest

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserService(
    private val userRepository: UserRepository,
) {
    fun getUserById(userId: Long): GetUserResponse {
        val user = userRepository.findByIdOrNull(userId) ?: throw RuntimeException("user empty!")
        return GetUserResponse.toDto(user)
    }

    fun getAllUsers(): List<GetUserResponse> {
        return userRepository.findAll().map { GetUserResponse.toDto(it) }
    }

    @Transactional
    fun saveUser(request: CreateUserRequest) {
        User(
            name = request.name,
            age = request.age,
        ).also(userRepository::save)
    }
}