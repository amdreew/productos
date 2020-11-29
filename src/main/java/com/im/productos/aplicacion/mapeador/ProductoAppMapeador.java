package com.im.productos.aplicacion.mapeador;

import com.im.productos.aplicacion.dto.ProductoDto;
import com.im.productos.dominio.modelo.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductoAppMapeador {
    Producto dtoTodominio(ProductoDto productoDto);
    ProductoDto dominioToDto(Producto producto);
}
