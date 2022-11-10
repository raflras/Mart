package com.example.Mart.controller.apiController;

import com.example.Mart.ifs.CrudInterface;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.request.TestApiRequest;
import com.example.Mart.model.network.response.TestApiResponse;
import com.example.Mart.service.TestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController implements CrudInterface<TestApiRequest, TestApiResponse> {

    private TestService testService;

    @Override
    @PostMapping("")
    public Header<TestApiResponse> create(Header<TestApiRequest> request) {
        return null;
    }


    @GetMapping("/check")
    public Header check() {
        return Header.OK();
    }


    @Override
    @GetMapping("{id}")
    public Header<TestApiResponse> read(@PathVariable int id) {
        return testService.read(id);
    }

    @Override
    public Header<TestApiResponse> update(Header<TestApiRequest> request) {
        return null;
    }

    @Override
    public Header<TestApiResponse> delete(int id) {
        return null;
    }
}