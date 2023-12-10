package UnIv.UnIv_spring.repository;

import UnIv.UnIv_spring.entity.BBS_APP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BBSAppRepository extends JpaRepository<BBS_APP, String> {
    // You can add custom query methods here if needed
}

/*package UnIv.UnIv_spring.repository;

import UnIv.UnIv_spring.entity.BbsApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BbsAppRepository extends JpaRepository<BbsApp, Long> {
    // 추가적인 메서드 필요시 작성
}*/
