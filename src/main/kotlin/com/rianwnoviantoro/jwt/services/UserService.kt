package com.rianwnoviantoro.jwt.services

import com.rianwnoviantoro.jwt.domains.dto.requests.SigninRequest
import com.rianwnoviantoro.jwt.domains.dto.requests.SignupRequest
import com.rianwnoviantoro.jwt.domains.entities.UserEntity
import java.util.*

interface UserService {
    fun save(body: SignupRequest)

    fun findByEmail(body: SigninRequest): Optional<UserEntity>

    fun getById(id: UUID): Optional<UserEntity>
}