package edu.arquitectura.demo.Entities;

import edu.arquitectura.demo.enums.EnumEstado;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityBase {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private EnumEstado estado;
}
