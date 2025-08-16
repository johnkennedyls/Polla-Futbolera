package co.edu.icesi.pf.infrastructure.drivenadapter.jpa.helpers;

import co.edu.icesi.pf.domain.model.records.Example;
import co.edu.icesi.pf.infrastructure.drivenadapter.jpa.data.ExampleDAO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExampleMapper {

    ExampleMapper INSTANCE = Mappers.getMapper(ExampleMapper.class);

    @Mapping(target = "id", ignore = true)
    ExampleDAO exampleToDAO(Example example);

    Example daoToExample(ExampleDAO exampleDAO);

}
