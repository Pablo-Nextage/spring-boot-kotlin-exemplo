package br.com.nextage.microservice.exemplo.service

import br.com.nextage.microservice.exemplo.dto.ContatoDTO
import br.com.nextage.microservice.exemplo.model.ContatoEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ContatoService {

    fun save(contatoEntity: ContatoEntity): ContatoDTO?

    fun findById(id: Long?): ContatoDTO?

    fun deleteById(id: Long)

    fun findAllFields(search: String?, page: Pageable?): Page<ContatoDTO>

    fun findAll(page: Pageable?): Page<ContatoDTO>
}
