package com.example.Mart.service;

import com.example.Mart.ifs.CrudInterface;
import com.example.Mart.model.entity.Test;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.request.TestApiRequest;
import com.example.Mart.model.network.response.TestApiResponse;
import com.example.Mart.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TestService implements CrudInterface<TestApiRequest, TestApiResponse> {
    @Autowired
    private TestRepository testRepository;

    public Header<TestApiResponse> response(Test test) {
        TestApiResponse testApiResponse = TestApiResponse.builder()
                .id(test.getId())
                .build();
        return Header.OK(testApiResponse);
    }

        @Override
    public Header<TestApiResponse> create(Header<TestApiRequest> request) {
        return null;
    }

    @Override
    public Header<TestApiResponse> read(int id) {
        Optional<Test> test = testRepository.findById(id);
        return test.map(newTest -> response(newTest))
                .orElseGet(() -> Header.ERROR("데이터가 없대!"));
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
