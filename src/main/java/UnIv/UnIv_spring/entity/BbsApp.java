/*
// BbsApp 엔티티 클래스
package UnIv.UnIv_spring.entity;

import jakarta.persistence.*;

@Entity
public class BbsApp {
    @Id
    private String userId;
    private String busNum;

    @ManyToOne
    @JoinColumn(name = "BBS_HW_stationId")
    private BbsHw bbsHw;

    public BbsApp() {
    }

    public BbsApp(String userId, String busNum, BbsHw bbsHw) {
        this.userId = userId;
        this.busNum = busNum;
        this.bbsHw = bbsHw;
    }

    public BbsApp(String busNum, BbsHw bbsHw) {
    }

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

    public BbsHw getBbsHw() {
        return bbsHw;
    }

    public void setBbsHw(BbsHw bbsHw) {
        this.bbsHw = bbsHw;
    }
}*/