package com.tcc.apicuartostcc.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mercancias")
public class mercancia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "iup")
    private Integer iup;
    @Column (name = "volumen")
    private Double volumen;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "tipo_remitente")
    private String tipoRemitente;
    @Column (name = "id_remitente")
    private String idRemitente;
    @Column (name = "nombre_remitente")
    private String nombreRemitente;
    @Column (name = "departamento_remitente")
    private String departamentoRemitente;
    @Column (name = "municipio_remitente")
    private String municipioRemitente;
    @Column (name = "direccion_remitente")
    private String direccionRemitente;

    @Column (name = "tipo_destiantario")
    private String tipoDestinatario;
    @Column (name = "id_destinatario")
    private String idDestinatario;
    @Column (name = "nombre_destinatario")
    private String nombreDestinatario;
    @Column (name = "departamento_destinatario")
    private String departamentoDestinatario;
    @Column (name = "municipio_destinatario")
    private String municipioDestinatario;
    @Column (name = "direccion_destinatario")
    private String direccionDestinatario;

    @ManyToOne(optional = false)
    @JoinColumn(name= "fk_zona",referencedColumnName = "id")
    @JsonBackReference
    private Zona zona;


    public mercancia() {
    }


    public Integer getIup() {
        return iup;
    }

    public Double getVolumen() {
        return volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoRemitente() {
        return tipoRemitente;
    }

    public String getIdRemitente() {
        return idRemitente;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public String getDepartamentoRemitente() {
        return departamentoRemitente;
    }

    public String getMunicipioRemitente() {
        return municipioRemitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public String getTipoDestinatario() {
        return tipoDestinatario;
    }

    public String getIdDestinatario() {
        return idDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public String getDepartamentoDestinatario() {
        return departamentoDestinatario;
    }

    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }
}
