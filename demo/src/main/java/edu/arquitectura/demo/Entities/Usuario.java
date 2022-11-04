package edu.arquitectura.demo.Entities;


import edu.arquitectura.demo.enums.EnumTipoIdentificacion;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Usuario extends EntityBase{


    @Column
    private String nombre;

    @Enumerated(EnumType.STRING)
    private EnumTipoIdentificacion tipoIdentificacion;

    @Column
    private String identificacion;
}
