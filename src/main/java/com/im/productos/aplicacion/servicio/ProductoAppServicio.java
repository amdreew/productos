package com.im.productos.aplicacion.servicio;

import com.im.productos.aplicacion.dto.ProductoDto;
import com.im.productos.aplicacion.mapeador.ProductoAppMapeador;
import com.im.productos.aplicacion.puerto.ProductoAppPuerto;
import com.im.productos.dominio.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductoAppServicio implements ProductoAppPuerto {

    @Autowired
    private ProductoServicio productoServicio;
    @Autowired
    private ProductoAppMapeador productoAppMapeador;

    @Override
    @Transactional(readOnly = true)
    public List<ProductoDto> listarTodos() {
        return this.productoServicio.listarTodos()
                .stream()
                .map(productoAppMapeador::dominioToDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ProductoDto buscarPorId(Long id) {
        return this.productoAppMapeador.dominioToDto(this.productoServicio.buscarPorId(id));
    }
}
