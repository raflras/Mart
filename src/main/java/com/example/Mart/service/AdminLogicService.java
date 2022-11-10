package com.example.Mart.service;

import com.example.Mart.component.LoginUserAuditorAware;
import com.example.Mart.config.JpaConfig;
import com.example.Mart.ifs.CrudInterface;
import com.example.Mart.model.entity.Admin;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.request.AdminApiRequest;
import com.example.Mart.model.network.response.AdminApiResponse;
import com.example.Mart.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Import({JpaConfig.class, LoginUserAuditorAware.class})
public class AdminLogicService implements CrudInterface<AdminApiRequest, AdminApiResponse> {

    @Autowired
    private AdminRepository adminRepository;

    public Header<AdminApiResponse> response(Admin admin) {
        AdminApiResponse adminApiResponse = AdminApiResponse.builder()
                .admId(admin.getAdmId())
                .account(admin.getAccount())
                .password(admin.getPassword())
                .admGrade(admin.getAdmGrade())
                .build();
        return Header.OK(adminApiResponse);
    }

    @Override
    public Header<AdminApiResponse> create(Header<AdminApiRequest> request) {
        AdminApiRequest adminApiRequest = request.getData();
        Admin admin = Admin.builder()
                .account(adminApiRequest.getAccount())
                .password(adminApiRequest.getPassword())
                .admGrade(adminApiRequest.getAdmGrade())
                .build();
        Admin newAdmin = adminRepository.save(admin);
        return response(newAdmin);
    }

    @Override
    public Header<AdminApiResponse> read(int id) {
        Optional<Admin> admin = adminRepository.findById(id);
        return admin.map(newAdmin -> response(newAdmin))
                .orElseGet(()->Header.ERROR("작동 왜 안 돼!!"));

    }

    @Override
    public Header<AdminApiResponse> update(Header<AdminApiRequest> request) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> delete(int id) {
        return null;
    }
}
