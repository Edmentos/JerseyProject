package ie.atu.project.repository;

import ie.atu.project.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface TeamRepository extends JpaRepository<Team,Long>{
    List<Team> findByRegionRegionId(Long regionid);
}
