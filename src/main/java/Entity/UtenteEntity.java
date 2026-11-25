package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;

@Entity
public class UtenteEntity {
@Id
int Id;
String nome;
String cognome;
}
