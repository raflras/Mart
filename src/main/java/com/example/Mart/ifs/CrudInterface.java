package com.example.Mart.ifs;

import com.example.Mart.model.network.Header;

public interface CrudInterface<Req, Res> {

    Header<Res> create(Header<Req> request);
    Header<Res> read(int id);
    Header<Res> update(Header<Req> request);
    Header<Res> delete(int id);


}
