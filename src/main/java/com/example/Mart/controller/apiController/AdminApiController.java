package com.example.Mart.controller.apiController;

import com.example.Mart.ifs.CrudInterface;
import com.example.Mart.model.network.Header;
import com.example.Mart.model.network.request.AdminApiRequest;
import com.example.Mart.model.network.response.AdminApiResponse;
import com.example.Mart.service.AdminLogicService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminApiController implements CrudInterface<AdminApiRequest, AdminApiResponse> {

    private AdminLogicService adminLogicService;

    @Override
    @PostMapping("")
    public Header<AdminApiResponse> create(@RequestBody Header<AdminApiRequest> request) {
        return adminLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<AdminApiResponse> read(@PathVariable int id) {
        return adminLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<AdminApiResponse> update(@RequestBody Header<AdminApiRequest> request) {
        return adminLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<AdminApiResponse> delete(@PathVariable int id) {
        return adminLogicService.delete(id);
    }
}
