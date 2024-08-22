package uz.broker.datageneratorgrpcmicroservice.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.broker.datageneratorgrpcmicroservice.model.Data;


@Getter
@Setter
@NoArgsConstructor
public class DataTestOptions {

    private int delayInSeconds;

    private Data.MeasurementType[] measurementTypes;

}
