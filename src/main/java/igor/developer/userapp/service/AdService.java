package igor.developer.userapp.service;

import igor.developer.userapp.model.Ad;
import igor.developer.userapp.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Optional;

@Service
@EnableWebMvc
public class AdService {
    @Autowired
    private AdRepository adRepository;

    public Ad createAd(Ad adProfile){
        return adRepository.save(adProfile);
    }

    public Ad updateAd(String id, Ad adProfile){
        adProfile.setId(id);
        return adRepository.save(adProfile);
    }

    public List<Ad> listAd(){
        return adRepository.findAll();
    }

    public Ad getAd(String id) throws Exception{
        Optional<Ad> optionalAd=adRepository.findById(id);

        if(!optionalAd.isPresent())
            throw new Exception("Ad record is not avaliable ...");

        return optionalAd.get();
    }

    public void deleteAd(String id){
        adRepository.deleteById(id);
    }
}
