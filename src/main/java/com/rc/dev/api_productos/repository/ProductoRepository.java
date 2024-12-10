package com.rc.dev.api_productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rc.dev.api_productos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
