package uz.broker.datageneratorgrpcmicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.broker.datageneratorgrpcmicroservice.model.Data;
import uz.broker.datageneratorgrpcmicroservice.model.test.DataTestOptions;
import uz.broker.datageneratorgrpcmicroservice.service.GRPCDataService;
import uz.broker.datageneratorgrpcmicroservice.service.TestDataService;
import uz.broker.datageneratorgrpcmicroservice.web.dto.DataDto;
import uz.broker.datageneratorgrpcmicroservice.web.dto.DataTestOptionsDto;
import uz.broker.datageneratorgrpcmicroservice.web.mapper.DataMapper;
import uz.broker.datageneratorgrpcmicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final GRPCDataService grpcDataService;

    private final TestDataService testDataService;

    private final DataMapper dataMapper;

    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto){
        Data data = dataMapper.toEntity(dto);
        grpcDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto){
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
