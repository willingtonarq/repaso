package edu.arquitectura.demo.Entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Producto extends EntityBase{

    @Column
    private String nombre;

    @Column
    private BigDecimal precio;
}
