package com.example.AFIP;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Afip,Long> {

	    List<Afip> findAllByNameLike(String nombre);

	    List<Afip> findAllByNameLikeOrSurnameLike(String nombre, String apellido);

}








