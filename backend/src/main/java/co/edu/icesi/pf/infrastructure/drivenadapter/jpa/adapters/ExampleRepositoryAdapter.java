package co.edu.icesi.pf.infrastructure.drivenadapter.jpa.adapters;

import co.edu.icesi.pf.domain.model.gateways.repositories.ExampleRepository;
import co.edu.icesi.pf.domain.model.records.Example;
import co.edu.icesi.pf.infrastructure.drivenadapter.jpa.helpers.ExampleMapper;
import co.edu.icesi.pf.infrastructure.drivenadapter.jpa.repositories.ExampleDAORepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class ExampleRepositoryAdapter implements ExampleRepository {

    private final ExampleDAORepository exampleDAORepository;

    @Override
    public Example getExample() {
        return ExampleMapper.INSTANCE.daoToExample(exampleDAORepository.findFirstByOrderByIdAsc());
    }
}
