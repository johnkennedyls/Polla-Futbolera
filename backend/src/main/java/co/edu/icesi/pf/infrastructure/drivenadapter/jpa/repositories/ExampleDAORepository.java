package co.edu.icesi.pf.infrastructure.drivenadapter.jpa.repositories;

import co.edu.icesi.pf.infrastructure.drivenadapter.jpa.data.ExampleDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleDAORepository extends JpaRepository<ExampleDAO, String> {

    ExampleDAO findFirstByOrderByIdAsc();

}
