package com.AutosGCP.mx.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.AutosGCP.mx.BodyEntity.BodyEntity;
import com.AutosGCP.mx.dominio.Auto;

public interface MetodosAutos {
	//public Auto guardar(Auto auto);
	//public List<Auto> listar();
	public ResponseEntity<BodyEntity> guardar(Auto auto);
	public ResponseEntity<BodyEntity> listar();
	public ResponseEntity<BodyEntity> eliminar(Auto auto);
	public ResponseEntity<BodyEntity> editar(Auto auto);
	public ResponseEntity<BodyEntity> buscar(Auto auto);
	
	
}
