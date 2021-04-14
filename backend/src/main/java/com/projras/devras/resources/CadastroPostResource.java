package com.projras.devras.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projras.devras.dto.CadastroInsertPostDTO;
import com.projras.devras.dto.CadastroPostDTO;
import com.projras.devras.services.CadastroPostService;

@RestController
@RequestMapping(value = "/cadastros")
public class CadastroPostResource {

	@Autowired
	private CadastroPostService service;
	
	@PostMapping
	public ResponseEntity<CadastroPostDTO> insert(@RequestBody CadastroInsertPostDTO dto){
		
		CadastroPostDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
		
	}
}
