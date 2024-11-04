package ie.atu.project.repository;

import ie.atu.project.TeamKit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamKitRepository extends JpaRepository<TeamKit, Long> {
    List<TeamKit> findByTeamTeamId(Long teamId);
}
