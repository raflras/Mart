package com.example.Mart.controller.apiController;

import com.example.Mart.ifs.CrudInterface;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.request.UserApiRequest;
import com.example.Mart.model.network.response.UserApiResponse;
import com.example.Mart.service.UserLogicService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {

    private UserLogicService userLogicService;

    @Override
    @PostMapping("")
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        return userLogicService.create(request);
    }

    @Override
    @GetMapping("{userId}")
    public Header<UserApiResponse> read(@PathVariable int userId) {
        return userLogicService.read(userId);
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
