package br.com.nextage.microservice.exemplo.controller

import br.com.nextage.microservice.exemplo.dto.CharacterDTO
import br.com.nextage.microservice.exemplo.dto.ContatoDTO
import br.com.nextage.microservice.exemplo.service.CharacterService
import br.com.nextage.microservice.exemplo.service.ContatoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/character")
class CharacterController {

    @Autowired
    private lateinit var characterService: CharacterService

    @GetMapping(value = ["/v1/"])
    fun list(@RequestParam search: String?, page: Pageable?): ResponseEntity<List<CharacterDTO>> {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.listar())
    }
}
