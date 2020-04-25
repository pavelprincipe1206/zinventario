/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/Entity.java.e.vm
 */
package com.incloud.hcp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.MoreObjects;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "venta")
//@Audited
//@AuditTable("_audi_VENTA")
public class Venta extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(Venta.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private Date fechaVenta;

    // Many to one
    private Lote lote;
    private Boleta boleta;

    @Override
    public String entityClassName() {
        return Venta.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "id_venta", precision = 5)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_venta")
    @Id
    @SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Venta id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [fechaVenta] ------------------------

    @NotNull
    @Column(name = "fecha_venta", nullable = false, length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Venta fechaVenta(Date fechaVenta) {
        setFechaVenta(fechaVenta);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: Venta.idLote ==> Lote.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "id_lote", nullable = false)
    @ManyToOne
    public Lote getLote() {
        return lote;
    }

    /**
     * Set the {@link #lote} without adding this Venta instance on the passed {@link #lote}
     */
    public void setLote(Lote idLote) {
        this.lote = lote;
    }

    public Venta lote(Lote lote) {
        setLote(lote);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: Venta.idBoleta ==> Boleta.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "id_boleta", nullable = false)
    @ManyToOne
    public Boleta getBoleta() {
        return boleta;
    }

    /**
     * Set the {@link #boleta} without adding this Venta instance on the passed {@link #boleta}
     */
    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }

    public Venta boleta(Boleta boleta) {
        setBoleta(boleta);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Venta withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Venta && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Venta instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("fechaVenta", getFechaVenta()) //
                .add("idLo", getLote()) //
                .add("idBole", getBoleta()) //
                .toString();
    }
}
