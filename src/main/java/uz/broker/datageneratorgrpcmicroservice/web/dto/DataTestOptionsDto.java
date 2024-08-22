package uz.broker.datageneratorgrpcmicroservice.web.dto;

import  lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.broker.datageneratorgrpcmicroservice.model.Data;


@Getter
@Setter
@NoArgsConstructor
public class DataTestOptionsDto {

    private int delayInSeconds;

    private Data.MeasurementType[] measurementTypes;

}
