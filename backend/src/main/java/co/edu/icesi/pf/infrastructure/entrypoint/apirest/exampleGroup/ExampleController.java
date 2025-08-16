package co.edu.icesi.pf.infrastructure.entrypoint.apirest.exampleGroup;

import co.edu.icesi.pf.domain.usecase.exampleGroup.SayExampleUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ExampleController {

    private final SayExampleUseCase sayExampleUseCase;

    @GetMapping("/example")
    public String getExample() {
        return sayExampleUseCase.sayExample().message();
    }

}
