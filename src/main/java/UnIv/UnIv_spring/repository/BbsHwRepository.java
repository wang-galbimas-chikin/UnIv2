package UnIv.UnIv_spring.repository;

import UnIv.UnIv_spring.entity.BbsHw;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BbsHwRepository extends JpaRepository<BbsHw, Long> {
    BbsHw findByBusNum(String busNum);
}