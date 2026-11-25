package Service.ServiceImpl;

import Entity.UtenteEntity;
import Repository.UtenteRepository;
import Service.UtenteService;

public class UtenteServiceImpl implements UtenteService {
    UtenteRepository utenrepo;

    @Override
    public UtenteEntity FindById(int id){
        utenrepo.findById(id);
        return ute;
    }

}
