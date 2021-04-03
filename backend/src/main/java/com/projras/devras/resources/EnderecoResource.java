package com.projras.devras.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projras.devras.dto.EnderecoDTO;
import com.projras.devras.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService service;
	
	@GetMapping
	public ResponseEntity<List<EnderecoDTO>> fingAll(){
		List<EnderecoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}	
}
