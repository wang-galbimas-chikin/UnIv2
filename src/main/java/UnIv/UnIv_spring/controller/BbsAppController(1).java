/*package UnIv.UnIv_spring.controller;

import UnIv.UnIv_spring.entity.BbsApp;
import UnIv.UnIv_spring.entity.BbsHw;
import UnIv.UnIv_spring.repository.BbsAppRepository;
import UnIv.UnIv_spring.repository.BbsHwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbsAppController {
    private final BbsAppRepository bbsAppRepository;
    private final BbsHwRepository bbsHwRepository;

    @Autowired
    public BbsAppController(BbsAppRepository bbsAppRepository, BbsHwRepository bbsHwRepository) {
        this.bbsAppRepository = bbsAppRepository;
        this.bbsHwRepository = bbsHwRepository;
    }

    @PostMapping("/api/bbsApp")
    public void createBbsApp(@RequestBody String busNum) {
        // 버스 번호를 받아와서 BbsApp 객체 생성
        BbsHw bbsHw = bbsHwRepository.findByBusNum(busNum); // 예시: BbsHw 엔티티에서 busNum으로 조회하는 메서드 활용
        BbsApp bbsApp = new BbsApp(busNum, bbsHw);

        // 생성한 BbsApp 객체를 데이터베이스에 저장
        bbsAppRepository.save(bbsApp);
    }
}*/
