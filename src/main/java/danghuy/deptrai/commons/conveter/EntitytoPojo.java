package danghuy.deptrai.commons.conveter;

import danghuy.deptrai.entity.NhanVienEntity;
import danghuy.deptrai.pojo.NhanVienPojo;
import org.springframework.stereotype.Component;

@Component
public class EntitytoPojo {
    public NhanVienPojo conveterNhanVien(NhanVienEntity nhanVienEntity){
        NhanVienPojo nhanVienPojo = new NhanVienPojo();
        return nhanVienPojo;
    }
}
