package igor.developer.userapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;
    private  String name;
    private  String surname;
    private  String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user_id")
    //@JoinColumn(name = "user_Id")
    private List<Ad> ads;

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }



//public long getId(){
//    return id;
//}
//
//public String getName(){
//    return name;
//}
//
//public String getSurname(){
//        return surname;
//    }
//
//public String getEmail(){
//    return email;
//}
}
