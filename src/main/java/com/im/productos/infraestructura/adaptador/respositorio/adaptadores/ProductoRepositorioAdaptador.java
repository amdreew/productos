package com.im.productos.infraestructura.adaptador.respositorio.adaptadores;

import com.im.productos.dominio.modelo.Producto;
import com.im.productos.dominio.puerto.ProductoPuerto;
import com.im.productos.infraestructura.adaptador.respositorio.jpa.ProductoJpaRepositorio;
import com.im.productos.infraestructura.adaptador.respositorio.mapeador.ProductoMapeador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductoRepositorioAdaptador implements ProductoPuerto {

    @Autowired
    private ProductoJpaRepositorio productoJpaRepositorio;
    @Autowired
    private ProductoMapeador productoMapeador;




    @Override
    public List<Producto> listarTodos() {
        return this.productoJpaRepositorio.findAll()
                .stream()
                .map(productoMapeador::entidadToDominio)
                .collect(Collectors.toList());
    }

    @Override
    public Producto buscarPorId(Long id) {
        return this.productoMapeador.entidadToDominio(this.productoJpaRepositorio.findById(id).orElse(null));
    }
}
