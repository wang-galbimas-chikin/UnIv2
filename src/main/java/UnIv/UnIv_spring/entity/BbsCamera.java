// BbsCamera 엔티티 클래스
package UnIv.UnIv_spring.entity;

import jakarta.persistence.*;

@Entity
public class BbsCamera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBbsCamera;

    @ManyToOne
    @JoinColumn(name = "BBS_HW_stationId")
    private BbsHw bbsHw;

    private String plateNo;

    public BbsCamera() {
    }

    public BbsCamera(BbsHw bbsHw, String plateNo) {
        this.bbsHw = bbsHw;
        this.plateNo = plateNo;
    }

    public Long getIdBbsCamera() {
        return idBbsCamera;
    }

    public void setIdBbsCamera(Long idBbsCamera) {
        this.idBbsCamera = idBbsCamera;
    }

    public BbsHw getBbsHw() {
        return bbsHw;
    }

    public void setBbsHw(BbsHw bbsHw) {
        this.bbsHw = bbsHw;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}