package com.projras.devras.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projras.devras.dto.CidadeDTO;
import com.projras.devras.services.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

	@Autowired
	private CidadeService service;
	
	@GetMapping
	public ResponseEntity<List<CidadeDTO>> findAll(){
		List<CidadeDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
