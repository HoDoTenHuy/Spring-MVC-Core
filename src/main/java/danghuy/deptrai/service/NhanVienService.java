package danghuy.deptrai.service;

import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.NhanVienDao;
import danghuy.deptrai.entity.NhanVienEntity;
import danghuy.deptrai.pojo.NhanVienPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService {
    @Autowired
    NhanVienDao nhanVienDao;

    @Autowired
    EntitytoPojo entitytoPojo;
    public NhanVienPojo getNhanVienId(Integer id){
        NhanVienEntity nhanVienEntity = nhanVienDao.getNhanVien(id);
        NhanVienPojo nhanVienPojo = entitytoPojo.conveterNhanVien(nhanVienEntity);
       return nhanVienPojo;
    }
}
