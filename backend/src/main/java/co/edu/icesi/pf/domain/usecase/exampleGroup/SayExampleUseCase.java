package co.edu.icesi.pf.domain.usecase.exampleGroup;

import co.edu.icesi.pf.domain.model.gateways.repositories.ExampleRepository;
import co.edu.icesi.pf.domain.model.records.Example;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SayExampleUseCase {

    private final ExampleRepository exampleRepository;

    public Example sayExample() {
        return exampleRepository.getExample();
    }

}
