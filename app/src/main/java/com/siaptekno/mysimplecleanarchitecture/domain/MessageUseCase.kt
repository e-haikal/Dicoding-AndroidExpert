package com.siaptekno.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}