package Service;

import model.ModelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import repository.RepositoryExample;
import org.springframework.stereotype.Service;
@Service
public class ServiceExample {

    @Autowired
    RepositoryExample repository;
    
    public int incrementCounter() {
        System.out.println(System.getenv("PASSWORD"));
        ModelExample model = repository.findById(new Long(0)).orElse(null);

        if(model == null) {
            model = new ModelExample();
            model.setId(new Long(0));
            model.setCnt(0);

        }
        model.setCnt(model.getCnt()+1);

        repository.save(model);

        return model.getCnt();
    }
}
