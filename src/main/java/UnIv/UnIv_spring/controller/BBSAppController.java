package UnIv.UnIv_spring.controller;

import UnIv.UnIv_spring.entity.BBS_APP;
import UnIv.UnIv_spring.entity.BBS_HW;
import UnIv.UnIv_spring.model.BBSAppRequest;
import UnIv.UnIv_spring.repository.BBSAppRepository;
import UnIv.UnIv_spring.repository.BBSHWRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/bus-app")
public class BBSAppController {

    @Autowired
    private BBSAppRepository bbsAppRepository;

    @Autowired
    private BBSHWRepository bbsHwRepository;

    @PostMapping("/save-bus-data")
    public ResponseEntity<Object> saveBusData(@RequestBody BBSAppRequest request) {
        try {
            // Log the received request for debugging
            System.out.println("Received request: " + request.toString());

            // 랜덤 키 (UUID)를 생성하여 userId로 설정
            String userId = UUID.randomUUID().toString();

            // 요청에서 가져온 stationId를 기반으로 기존의 BBS_HW 엔터티를 검색
            BBS_HW bbsHw = bbsHwRepository.findById(request.getStationId()).orElse(null);
            if (bbsHw == null) {
                return new ResponseEntity<>("{\"error\": \"잘못된 stationId\"}", HttpStatus.BAD_REQUEST);
            }

            // BBS_APP 엔터티를 생성하고 기존의 BBS_HW 엔터티와 연결
            BBS_APP bbsApp = new BBS_APP();
            bbsApp.setUserId(userId);
            bbsApp.setBusNum(request.getBusNum());
            bbsApp.setBbsHw(bbsHw);

            // 데이터를 데이터베이스에 저장
            bbsAppRepository.save(bbsApp);

            // JSON 형식의 응답 생성
            String jsonResponse = "{\"userId\": \"" + userId + "\"}";
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("{\"error\": \"데이터 저장 중 오류 발생\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}