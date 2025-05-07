package com.seccion4.orm4.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;  // lo transforma en una tabla
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  // clave primaria
import jakarta.persistence.Table;   // para dar nombre a la tabla
import lombok.AllArgsConstructor; //constructores con argumentos
import lombok.Data; // para los constructores
import lombok.NoArgsConstructor; // constructores sin argumentos

// de los @ de abajo sale cada import correspondiente
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paciente")


//Column da los formatos/tipos de dato a cada atributo
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para generar el numero del ID
    private int id;

    @Column(length = 13, nullable = false, unique = true)   // para darle formato al rut
    private String rut;

    @Column(length = 50, nullable = false, unique = false)
    private String nombre;

    @Column(length = 50, nullable = false, unique = false)
    private String apellido;

    @Column(nullable = false)
    private LocalDate fecha_nacimiento;
    
    @Column(length = 200)
    private String correo;



}



