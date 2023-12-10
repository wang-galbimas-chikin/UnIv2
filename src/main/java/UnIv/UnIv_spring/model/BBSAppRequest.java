package UnIv.UnIv_spring.model;

public class BBSAppRequest {
    private String stationId;
    private String busNum;

    // Constructors, getters, and setters

    public BBSAppRequest() {
        // JSON 역직렬화를 위해 필요한 기본 생성자
    }

    public BBSAppRequest(String stationId, String busNum) {
        this.stationId = stationId;
        this.busNum = busNum;
    }

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
}