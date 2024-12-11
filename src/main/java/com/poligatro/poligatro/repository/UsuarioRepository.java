package com.poligatro.poligatro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poligatro.poligatro.models.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
