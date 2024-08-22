package uz.broker.datageneratorgrpcmicroservice.web.mapper;

import org.mapstruct.Mapper;
import uz.broker.datageneratorgrpcmicroservice.model.Data;
import uz.broker.datageneratorgrpcmicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {



}
