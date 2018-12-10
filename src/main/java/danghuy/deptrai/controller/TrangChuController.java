package danghuy.deptrai.controller;

import danghuy.deptrai.entity.NhanVienEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/")
public class TrangChuController {

    @Autowired
    SessionFactory sessionFactory;

    @GetMapping()
    @Transactional
    public String getrTrangChu(){
        Session session = sessionFactory.getCurrentSession().getSession();
        NhanVienEntity nhanVienEntity = (NhanVienEntity) session.createQuery("FROM NhanVienEntity WHERE id = 2").uniqueResult();

        return "trangchu";
    }

}
