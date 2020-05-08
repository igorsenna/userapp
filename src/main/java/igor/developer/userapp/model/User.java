package igor.developer.userapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;
    private  String name;
    private  String surname;
    private  String email;

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
