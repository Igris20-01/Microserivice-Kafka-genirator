package uz.broker.datageneratorgrpcmicroservice.service;

import uz.broker.datageneratorgrpcmicroservice.model.Data;

import java.util.List;

public interface GRPCDataService {

    void send(Data data);

    void send(List<Data> data);
}
