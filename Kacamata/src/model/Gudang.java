/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ilsan
 */
@Entity
public class Gudang implements Serializable {

    @OneToMany(mappedBy = "gudang")
    private List<Barang> barangs;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 30, nullable = false)
    private String lokasi_gudang;

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
        if (!(object instanceof Gudang)) {
            return false;
        }
        Gudang other = (Gudang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Gudang[ id=" + id + " ]";
    }

    public String getLokasi_gudang() {
        return lokasi_gudang;
    }

    public void setLokasi_gudang(String lokasi_gudang) {
        this.lokasi_gudang = lokasi_gudang;
    }

    public List<Barang> getBarangs() {
        return barangs;
    }

    public void setBarangs(List<Barang> barangs) {
        this.barangs = barangs;
    }
    
}
