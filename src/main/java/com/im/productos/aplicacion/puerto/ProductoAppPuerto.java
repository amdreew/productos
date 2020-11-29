package com.im.productos.aplicacion.puerto;

import com.im.productos.aplicacion.dto.ProductoDto;

import java.util.List;

public interface ProductoAppPuerto {
    List<ProductoDto> listarTodos();
    ProductoDto buscarPorId(Long id);
}
