package com.AutosGCP.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.AutosGCP.mx.BodyEntity.BodyEntity;
import com.AutosGCP.mx.dao.AutosDao;
import com.AutosGCP.mx.dominio.Auto;



@Service
public class ImpAuto implements MetodosAutos{
	@Autowired
	AutosDao dao;

	
	BodyEntity body=new BodyEntity();
	
	@Override
	public ResponseEntity<BodyEntity> guardar(Auto auto){
		if(dao.existsById(auto.getId())) {
			body.setObject(null);
			body.setMessage("El auto ya esta registrado");
			
			return new ResponseEntity<BodyEntity>(body,HttpStatus.CONFLICT);
		}
		dao.save(auto);
		body.setObject(auto);
		body.setMessage("Registrando auto exitosamente");
		return new ResponseEntity<BodyEntity>(body,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<BodyEntity> listar(){
		List<Auto> autos=dao.findAll();
		if(autos.isEmpty()) {
			body.setMessage("La lista de autos esta vacia");
		}
		else {
			body.setMessage("Obteniendo datos Exitosamente");
		}
		body.setObject(autos);
		return new ResponseEntity<BodyEntity>(body,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<BodyEntity> eliminar(Auto auto) {
		Auto aux=dao.findById(auto.getId()).orElse(null);
		if(aux==null) {
			body.setObject(null);
			body.setMessage("El auto no existe");
			return new ResponseEntity<BodyEntity>(body,HttpStatus.NOT_FOUND);
		}
		dao.delete(aux);
		body.setObject(auto);
		body.setMessage("Eliminando auto exitosamente");
		return new ResponseEntity<BodyEntity>(body,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<BodyEntity> editar(Auto auto) {
		Auto aux=dao.findById(auto.getId()).orElse(null);
		if(aux==null) {
			body.setObject(null);
			body.setMessage("El auto no existe");
			return new ResponseEntity<BodyEntity>(body,HttpStatus.NOT_FOUND);
		}
		dao.save(auto);
		body.setObject(auto);
		body.setMessage("Editando auto exitosamente");
		return new ResponseEntity<BodyEntity>(body,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<BodyEntity> buscar(Auto auto) {
		Auto aux=dao.findById(auto.getId()).orElse(null);
		if(aux==null) {
			body.setObject(null);
			body.setMessage("El auto no existe");
			return new ResponseEntity<BodyEntity>(body,HttpStatus.NOT_FOUND);
		}
		body.setObject(aux);
		body.setMessage("Obteniendo auto exitosamente");
		return new ResponseEntity<BodyEntity>(body,HttpStatus.OK);
	}
	

}
