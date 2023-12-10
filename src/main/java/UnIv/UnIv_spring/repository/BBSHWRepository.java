package UnIv.UnIv_spring.repository;

import UnIv.UnIv_spring.entity.BBS_HW;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BBSHWRepository extends JpaRepository<BBS_HW, String> {
    // 추가적인 쿼리 메소드가 필요한 경우 여기에 작성할 수 있습니다.
}
/*package UnIv.UnIv_spring.repository;

import UnIv.UnIv_spring.entity.BbsHw;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BbsHwRepository extends JpaRepository<BbsHw, Long> {
    BbsHw findByBusNum(String busNum);
}*/