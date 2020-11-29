package com.im.productos.dominio.puerto;

import com.im.productos.dominio.modelo.Producto;

import java.util.List;

public interface ProductoPuerto {
    List<Producto> listarTodos();
    Producto buscarPorId(Long  id);
}
