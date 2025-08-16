package co.edu.icesi.pf.infrastructure.drivenadapter.jpa.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@Table(name = "examples")
public class ExampleDAO {

    @Id
    @UuidGenerator
    private String id;

    private String message;
}
