package com.example.Mart.repositoryTest;

import com.example.Mart.MartApplicationTests;
import com.example.Mart.component.LoginUserAuditorAware;
import com.example.Mart.config.JpaConfig;
import com.example.Mart.model.entity.Admin;
import com.example.Mart.repository.AdminRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@Import({LoginUserAuditorAware.class, JpaConfig.class})
public class AdminRepositoryTest extends MartApplicationTests {
    @Autowired
    private AdminRepository adminRepository;

    @Test
    public void create(){
        Admin admin = Admin.builder()
                .account("테스트1")
                .password("테스트1")
                .admGrade(2)
                .build();
        adminRepository.save(admin);
    }
}
