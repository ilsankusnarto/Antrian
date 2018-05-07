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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ilsan
 */
@Entity
public class KuitansiPesanan implements Serializable {

    @OneToMany(mappedBy = "kuitansipesanan")
    private List<Barang> barangs;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 25, nullable = false)
    private long nomorPesanan;
    @ManyToOne
    private Pasien pasien;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    @Column(length = 50, nullable = false)
    private String deskripsi;
    @Column(length = 20, nullable = false)
    private String tipe;
    @Column(nullable = false)
    private double harga;
    @Column(nullable = false)
    private double jumlah;
    @Column(nullable = false)
    private double subtotal;
    @Column(nullable = false)
    private double total;
    @Column(nullable = false)
    private double DP;
    @Column(nullable = false)
    private double sisaBayar;
    

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
        if (!(object instanceof KuitansiPesanan)) {
            return false;
        }
        KuitansiPesanan other = (KuitansiPesanan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.KuitansiPesanan[ id=" + id + " ]";
    }

    public long getNomorPesanan() {
        return nomorPesanan;
    }

    public void setNomorPesanan(long nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDP() {
        return DP;
    }

    public void setDP(double DP) {
        this.DP = DP;
    }

    public double getSisaBayar() {
        return sisaBayar;
    }

    public void setSisaBayar(double sisaBayar) {
        this.sisaBayar = sisaBayar;
    }

    public List<Barang> getBarangs() {
        return barangs;
    }

    public void setBarangs(List<Barang> barangs) {
        this.barangs = barangs;
    }
    
}
