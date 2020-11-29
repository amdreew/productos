package com.im.productos.infraestructura.adaptador.respositorio.jpa;

import com.im.productos.infraestructura.adaptador.respositorio.entidad.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoJpaRepositorio extends JpaRepository<ProductoEntidad, Long> {
}
