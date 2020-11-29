package com.im.productos.aplicacion.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductoDto {
    private Long id;
    private String nombre;
    private Double precio;
    private Timestamp createAt;
}
