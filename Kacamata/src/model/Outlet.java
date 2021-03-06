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
public class Outlet implements Serializable {

    @OneToMany(mappedBy = "outlet")
    private List<Admin> admins;

    @OneToMany(mappedBy = "outlet")
    private List<Pasien> pasiens;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 30, nullable = false)
    private String lokasiOutlet;
    

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
        if (!(object instanceof Outlet)) {
            return false;
        }
        Outlet other = (Outlet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Outlet[ id=" + id + " ]";
    }

    public String getLokasiOutlet() {
        return lokasiOutlet;
    }

    public void setLokasiOutlet(String lokasiOutlet) {
        this.lokasiOutlet = lokasiOutlet;
    }

    public List<Pasien> getPasiens() {
        return pasiens;
    }

    public void setPasiens(List<Pasien> pasiens) {
        this.pasiens = pasiens;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
    
}
