package com.im.productos.infraestructura.controlador;

import com.im.productos.aplicacion.dto.ProductoDto;
import com.im.productos.aplicacion.puerto.ProductoAppPuerto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/api/v1/productos")
public class ProductoControlador {

    private final ProductoAppPuerto productoAppPuerto;

    @GetMapping(path = "/{id}")
    public ProductoDto buscarPorId(@PathVariable("id") Long id) {
        return this.productoAppPuerto.buscarPorId(id);
    }

    @GetMapping(path = "/listar")
    public List<ProductoDto> listarTodos() {
        return this.productoAppPuerto.listarTodos();
    }
}
