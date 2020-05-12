package igor.developer.userapp.controler;

import igor.developer.userapp.model.Ad;
import igor.developer.userapp.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdController {
    @Autowired
    private AdService adService;

    @GetMapping("/ad/{id}")
    @CrossOrigin
    public Ad getAd(@PathVariable("id")String id)throws Exception{
        return adService.getAd(id);
    }

    @GetMapping("/ads")
    @CrossOrigin
    public List<Ad>listAd(){
        return adService.listAd();
    }

    @PostMapping("/ad")
    @CrossOrigin
    public Ad createAd(@RequestBody Ad adProfile){
        return adService.createAd(adProfile);
    }

    @PutMapping("/ad/{id}")
    @CrossOrigin
    public Ad updateAd(@PathVariable("id")String id, @RequestBody Ad adProfile){
        return adService.updateAd(id, adProfile);
    }

    @DeleteMapping("/ad/{id}")
    @CrossOrigin
    public void deleteAd(@PathVariable("id") String id){
        adService.deleteAd(id);
    }


}
