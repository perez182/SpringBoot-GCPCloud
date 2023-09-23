package com.AutosGCP.mx.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.AutosGCP.mx.dominio.Auto;


@Repository
public interface AutosDao extends JpaRepository<Auto, Integer>{

}
