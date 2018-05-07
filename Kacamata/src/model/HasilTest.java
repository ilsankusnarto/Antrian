/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ilsan
 */
@Entity
public class HasilTest implements Serializable {
    @Embedded
    @ManyToMany(mappedBy = "hasiltestList")
    private List<AhliKacamata> ahliKacamatas;


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date jam;
    @Column(length = 30, nullable = false)
    private String nama_ahli_kacamata;
    @Column(length = 30, nullable = false)
    private String resep;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HasilTest)) {
            return false;
        }
        HasilTest other = (HasilTest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.HasilTest[ id=" + id + " ]";
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getJam() {
        return jam;
    }

    public void setJam(Date jam) {
        this.jam = jam;
    }

    public String getNama_ahli_kacamata() {
        return nama_ahli_kacamata;
    }

    public void setNama_ahli_kacamata(String nama_ahli_kacamata) {
        this.nama_ahli_kacamata = nama_ahli_kacamata;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public List<AhliKacamata> getAhliKacamatas() {
        return ahliKacamatas;
    }

    public void setAhliKacamatas(List<AhliKacamata> ahliKacamatas) {
        this.ahliKacamatas = ahliKacamatas;
    }
    
}
