package com.AutosGCP.mx.dominio;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
 *  id NUMERIC PRIMARY KEY,
    modelo CHAR(50),
    marca CHAR(50),
    color CHAR(50),
    PRECIO numeric
    */
@Data
@Entity
@Table(name="autos")
public class Auto {
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="modelo")
	String modelo;
	
	@Column(name="marca")
	String marca;
	
	@Column(name="color")
	String color;
	@Column(name="PRECIO")
	double precio;

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(int id, String modelo, String marca, String color, double precio) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Auto [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", precio=" + precio
				+ "]";
	}
	
	
}