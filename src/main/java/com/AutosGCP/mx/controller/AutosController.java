package com.AutosGCP.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutosGCP.mx.BodyEntity.BodyEntity;
import com.AutosGCP.mx.dominio.Auto;
import com.AutosGCP.mx.service.ImpAuto;

@RestController
@CrossOrigin
@RequestMapping("autos")
public class AutosController {
	@Autowired
	ImpAuto imp;
	
	@GetMapping("listar")
	public ResponseEntity<BodyEntity> listar(){
		return imp.listar();
	}
	
	@PostMapping("guardar")
	public ResponseEntity<BodyEntity> guardar(@RequestBody Auto auto) {
		return imp.guardar(auto);
	}
	
	@PostMapping("buscar")
	public ResponseEntity<BodyEntity> buscar(@RequestBody Auto auto) {
		return imp.buscar(auto);
	}

	@PostMapping("eliminar")
	public ResponseEntity<BodyEntity> eliminar(@RequestBody Auto auto) {
		return imp.eliminar(auto);
	}
	
	
	@PostMapping("editar")
	public ResponseEntity<BodyEntity> editar(@RequestBody Auto auto) {
		return imp.editar(auto);
	}
	
	
}
