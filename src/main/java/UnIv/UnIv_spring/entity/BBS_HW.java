package UnIv.UnIv_spring.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BBS_HW {

    @Id
    private String stationId;

    private String busNum;

    private String routeId;

    // Getters and setters

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getBusNum() {
        return busNum;
    }

    public void setBusNum(String busNum) {
        this.busNum = busNum;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
}
