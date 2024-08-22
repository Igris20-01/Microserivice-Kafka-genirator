package uz.broker.datageneratorgrpcmicroservice.web.mapper;

import org.mapstruct.Mapper;
import uz.broker.datageneratorgrpcmicroservice.model.test.DataTestOptions;
import uz.broker.datageneratorgrpcmicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
