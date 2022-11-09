package com.example.Mart.service;

import com.example.Mart.component.LoginUserAuditorAware;
import com.example.Mart.config.JpaConfig;
import com.example.Mart.ifs.CrudInterface;
import com.example.Mart.model.entity.User;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.request.UserApiRequest;
import com.example.Mart.model.network.response.UserApiResponse;
import com.example.Mart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Import({JpaConfig.class, LoginUserAuditorAware.class})
public class UserLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserRepository userRepository;

    public Header<UserApiResponse> response(User user) {
        UserApiResponse userApiResponse = UserApiResponse.builder()
                .userId(user.getUserId())
                .account(user.getAccount())
                .password(user.getPassword())
                .name(user.getName())
                .phoneNumber(user.getPhoneNumber())
                .address(user.getAddress())
                .gender(user.getGender())
                .build();
        return Header.OK(userApiResponse);
    }

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();
        User user = User.builder()
                .account(userApiRequest.getAccount())
                .password(userApiRequest.getPassword())
                .name(userApiRequest.getName())
                .phoneNumber(userApiRequest.getPhoneNumber())
                .build();
        User newUser = userRepository.save(user);
        return response(newUser);
    }

    @Override
    public Header<UserApiResponse> read(int userId) {
        Optional <User> user = userRepository.findById(userId);
        return user.map(newUser -> response(newUser))
                .orElseGet(()->Header.ERROR("데이터 없음"));
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> delete(int id) {
        return null;
    }
}
