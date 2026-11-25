package Service;

import Entity.UtenteEntity;
import org.springframework.stereotype.Service;

@Service
public interface UtenteService {


    public UtenteEntity FindById (int id);
}
