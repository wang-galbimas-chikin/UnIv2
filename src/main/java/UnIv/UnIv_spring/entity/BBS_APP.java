package UnIv.UnIv_spring.entity;
import jakarta.persistence.*;
@Entity
public class BBS_APP {
//public class BBS_APP
    @Id
    private String userId;

    private String busNum;

    @ManyToOne
    @JoinColumn(name = "BBS_HW_stationId")
    private BBS_HW bbsHw;

    // Getters and setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBusNum() {
        return busNum;
    }

    public void setBusNum(String busNum) {
        this.busNum = busNum;
    }

    public BBS_HW getBbsHw() {
        return bbsHw;
    }

    public void setBbsHw(BBS_HW bbsHw) {
        this.bbsHw = bbsHw;
    }
}

/*
package UnIv.UnIv_spring.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "bbs_app")
public class bbs_app {

    @Id
    private String user_id;

    private String bus_num;

    @ManyToOne
    @JoinColumn(name = "bbs_hw_station_id")
    private bbs_hw bbsHw;

    // Getters and setters

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBus_num() {
        return bus_num;
    }

    public void setBus_num(String bus_num) {
        this.bus_num = bus_num;
    }

    public bbs_hw getBbsHw() {
        return bbsHw;
    }

    public void setBbsHw(bbs_hw bbsHw) {
        this.bbsHw = bbsHw;
    }
}*/