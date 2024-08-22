package uz.broker.datageneratorgrpcmicroservice.service;

import uz.broker.datageneratorgrpcmicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions dataTestOptions);

}
