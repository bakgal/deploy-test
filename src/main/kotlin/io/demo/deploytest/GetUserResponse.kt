package io.demo.deploytest

data class GetUserResponse(
    val id: Long,
    val name: String,
    val age: Int,
) {
    companion object {
        fun toDto(user: User): GetUserResponse =
            GetUserResponse(
                id = user.id!!,
                name = user.name,
                age = user.age,
            )
    }
}