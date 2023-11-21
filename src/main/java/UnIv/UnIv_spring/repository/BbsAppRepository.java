package UnIv.UnIv_spring.repository;

import UnIv.UnIv_spring.entity.BbsApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BbsAppRepository extends JpaRepository<BbsApp, Long> {
    // 추가적인 메서드 필요시 작성
}