package com.im.productos.dominio.modelo;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    private Timestamp createAt;
}
