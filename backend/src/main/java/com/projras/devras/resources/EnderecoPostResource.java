package com.projras.devras.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projras.devras.dto.EnderecoInsertDTO;
import com.projras.devras.dto.EnderecoPostDTO;
import com.projras.devras.services.EnderecoPostService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoPostResource {

	@Autowired
	private EnderecoPostService service;
	
	@PostMapping
	public ResponseEntity<EnderecoPostDTO> insert(@RequestBody EnderecoInsertDTO dto){
		
		EnderecoPostDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
		
	}
}
