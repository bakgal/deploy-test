package io.demo.deploytest

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>