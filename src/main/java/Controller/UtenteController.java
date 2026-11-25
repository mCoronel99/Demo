package Controller;

import Entity.UtenteEntity;
import Repository.UtenteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtenteController {

@Service
     UtenteService utenteService;

   public UtenteEntity trovaUtente(int id){
       UtenteEntity entity = new UtenteEntity();
       utenteService.FindById(entity.Id);

       return entity;
   }
}
