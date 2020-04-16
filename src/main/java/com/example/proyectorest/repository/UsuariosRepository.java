package com.example.proyectorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectorest.model.Usuarios;


public interface UsuariosRepository extends JpaRepository <Usuarios, Long> {

}
