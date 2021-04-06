package com.projras.devras.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projras.devras.dto.CidadeDTO;
import com.projras.devras.dto.CidadeInsertDTO;
import com.projras.devras.services.CidadePostService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadePostResource {

	@Autowired
	private CidadePostService service;
	
	@PostMapping
	public ResponseEntity<CidadeDTO> insert(@RequestBody CidadeInsertDTO dto){
		
		CidadeDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
		
	}
}
