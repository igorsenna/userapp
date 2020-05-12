package igor.developer.userapp.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "channels")
public class Channel {
    @Id
   private String id;
   private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "channel_id")
    //@JoinColumn(name = "channel_Id")
    private List<Ad> ads;

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public void setId(String id) { this.id = id; }

    public void setName(String name) { this.name = name; }
}
