package br.com.nextage.microservice.exemplo.service

import br.com.nextage.microservice.exemplo.dto.PessoaDTO
import br.com.nextage.microservice.exemplo.model.PessoaEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface PessoaService {

    fun save(pessoaEntity: PessoaEntity): PessoaDTO?

    fun findById(id: Long): PessoaDTO?

    fun deleteById(id: Long)

    fun findAllFields(search: String?, page: Pageable?): Page<PessoaDTO>

    fun findAll(page: Pageable?): Page<PessoaDTO>
}
