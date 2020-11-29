package com.im.productos.dominio.servicio;

import com.im.productos.dominio.modelo.Producto;
import com.im.productos.dominio.puerto.ProductoPuerto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {
    @Autowired
    private ProductoPuerto productoPuerto;

    public List<Producto> listarTodos() {
        return this.productoPuerto.listarTodos();
    }

    public Producto buscarPorId(Long  id) {
        return this.productoPuerto.buscarPorId(id);
    }
}
