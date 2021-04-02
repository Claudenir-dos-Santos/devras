package com.projras.devras.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projras.devras.dto.CadastroDTO;
import com.projras.devras.services.CadastroService;

@RestController
@RequestMapping(value = "/cadastros")
public class CadastroResource {

	@Autowired
	private CadastroService service;
	
	@GetMapping
	public ResponseEntity<List<CadastroDTO>> findAll(){
		List<CadastroDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}
