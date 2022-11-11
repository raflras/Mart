package com.example.Mart.repositoryTest;

import com.example.Mart.MartApplicationTests;
import com.example.Mart.component.LoginUserAuditorAware;
import com.example.Mart.config.JpaConfig;
import com.example.Mart.model.entity.Admin;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.response.AdminApiResponse;
import com.example.Mart.repository.AdminRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import javax.transaction.Transactional;
import java.util.Optional;

@Import({LoginUserAuditorAware.class, JpaConfig.class})
public class AdminRepositoryTest extends MartApplicationTests {
    @Autowired
    private AdminRepository adminRepository;

    @Test
    public void create(){
        Admin admin = Admin.builder()
                .account("테스트100")
                .password("테스트1")
                .admGrade(2)
                .build();
        adminRepository.save(admin);
    }
    @Test
    @Transactional
    public Header<AdminApiResponse> readTest(Integer admId){
        Optional<Admin> admin = adminRepository.findById(1);
        return admin.map(newAdmin -> responseTest(newAdmin))
                .orElseGet(()-> Header.ERROR("데이터가 없대!"));
    }

    @Test
    public Header<AdminApiResponse> responseTest(Admin admin){
        AdminApiResponse adminApiResponse = AdminApiResponse.builder()
                .admId(admin.getAdmId())
                .account(admin.getAccount())
                .password(admin.getPassword())
                .admGrade(admin.getAdmGrade())
                .build();

        return null;
    }

}
