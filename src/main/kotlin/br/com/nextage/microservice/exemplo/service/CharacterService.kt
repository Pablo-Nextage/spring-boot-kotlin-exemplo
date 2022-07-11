package br.com.nextage.microservice.exemplo.service

import br.com.nextage.microservice.exemplo.dto.CharacterDTO

interface CharacterService {

    fun listar(): List<CharacterDTO>
}
