package igor.developer.userapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ads")
public class Ad {
    @Id
    private String id;
    private String time;
    private float cost;s
    private String user_id;
    private String channel_id;

//    private String channel_Id;
//    private String user_Id;

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public float getCost() {
        return cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getId_U() {
        return user_id;
    }

    public void setId_U(String id_U) {
        this.user_id = id_U;
    }

    public String getId_C() {
        return channel_id;
    }

    public void setId_C(String id_C) {
        this.channel_id = id_C;
    }

    //    public String getChannel_Id() {
//        return channel_Id;
//    }
//
//    public void setChannel_Id(String channel_Id) {
//        this.channel_Id = channel_Id;
//    }
//
//    public String getUser_Id() {
//        return user_Id;
//    }
//
//    public void setUser_Id(String user_Id) {
//        this.user_Id = user_Id;
//    }
}
