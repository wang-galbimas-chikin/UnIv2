package UnIv.UnIv_spring.entity;
import jakarta.persistence.*;
@Entity
public class BBS_CAMERA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBBS_CAMERA;

    @ManyToOne
    @JoinColumn(name = "BBS_HW_stationId")
    private BBS_HW bbsHw;

    private String plateNo;

    // Getters and setters

    public Long getIdBBS_CAMERA() {
        return idBBS_CAMERA;
    }

    public void setIdBBS_CAMERA(Long idBBS_CAMERA) {
        this.idBBS_CAMERA = idBBS_CAMERA;
    }

    public BBS_HW getBbsHw() {
        return bbsHw;
    }

    public void setBbsHw(BBS_HW bbsHw) {
        this.bbsHw = bbsHw;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}
/*
package UnIv.UnIv_spring.entity;
import jakarta.persistence.*;
@Entity
public class bbs_camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbbs_camera;

    @ManyToOne
    @JoinColumn(name = "bbs_hw_station_id")
    private bbs_hw bbsHw;

    private String plate_no;

    // Getters and setters

    public Long getIdBBS_CAMERA() {
        return idbbs_camera;
    }

    public void setIdBBS_CAMERA(Long idBBS_CAMERA) {
        this.idbbs_camera = idBBS_CAMERA;
    }

    public bbs_hw getBbsHw() {
        return bbsHw;
    }

    public void setBbsHw(bbs_hw bbsHw) {
        this.bbsHw = bbsHw;
    }

    public String getPlateNo() {
        return plate_no;
    }

    public void setPlateNo(String plateNo) {
        this.plate_no = plateNo;
    }
}*/