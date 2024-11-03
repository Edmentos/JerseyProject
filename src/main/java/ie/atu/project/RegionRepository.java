package ie.atu.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {

}

public interface TeamRepository extends JpaRepository<Team, Long>{

}
