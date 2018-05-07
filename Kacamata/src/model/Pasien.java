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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ilsan
 */
@Entity
public class Pasien implements Serializable {

    @OneToMany(mappedBy = "pasien")
    private List<Jadwal> jadwals;

    @OneToOne(mappedBy = "pasien")
    @JoinColumn(referencedColumnName = "id")
    private Login login;

    @OneToMany(mappedBy = "pasien")
    private List<KuitansiPesanan> kuitansiPesanans;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 30, nullable = false)
    private String nama;
    @Column(length = 30, nullable = false)
    private String alamat;
    @Column(length = 20, nullable = false)
    private String handphone;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalLahir;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalOrderTerakhir;
    @Column(nullable = false)
    private double jumlahTransaksiTerakhir;
    @Column(length = 20, nullable = false)
    private String statusReminder;
    @Column(length = 20, nullable = false)
    private String sudahMembuatJanji;
    @ManyToOne
    private Outlet outlet;

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
        if (!(object instanceof Pasien)) {
            return false;
        }
        Pasien other = (Pasien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pasien[ id=" + id + " ]";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalOrderTerakhir() {
        return tanggalOrderTerakhir;
    }

    public void setTanggalOrderTerakhir(Date tanggalOrderTerakhir) {
        this.tanggalOrderTerakhir = tanggalOrderTerakhir;
    }

    public double getJumlahTransaksiTerakhir() {
        return jumlahTransaksiTerakhir;
    }

    public void setJumlahTransaksiTerakhir(double jumlahTransaksiTerakhir) {
        this.jumlahTransaksiTerakhir = jumlahTransaksiTerakhir;
    }

    public String getStatusReminder() {
        return statusReminder;
    }

    public void setStatusReminder(String statusReminder) {
        this.statusReminder = statusReminder;
    }

    public String getSudahMembuatJanji() {
        return sudahMembuatJanji;
    }

    public void setSudahMembuatJanji(String sudahMembuatJanji) {
        this.sudahMembuatJanji = sudahMembuatJanji;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    public List<Jadwal> getJadwals() {
        return jadwals;
    }

    public void setJadwals(List<Jadwal> jadwals) {
        this.jadwals = jadwals;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<KuitansiPesanan> getKuitansiPesanans() {
        return kuitansiPesanans;
    }

    public void setKuitansiPesanans(List<KuitansiPesanan> kuitansiPesanans) {
        this.kuitansiPesanans = kuitansiPesanans;
    }
    
}
