package danghuy.deptrai.entity;

import javax.persistence.*;

@Entity
@Table(name = "testspringmvc")
public class NhanVienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tenNhanVien")
    private String tenNhanVien;

    @Column(name = "diaChi")
    private String diaChi;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
}
