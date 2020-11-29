package com.im.productos.infraestructura.adaptador.respositorio.mapeador;

import com.im.productos.dominio.modelo.Producto;
import com.im.productos.infraestructura.adaptador.respositorio.entidad.ProductoEntidad;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductoMapeador {
    ProductoEntidad dominioToEntidad(Producto producto);
    Producto entidadToDominio(ProductoEntidad productoEntidad);
}
