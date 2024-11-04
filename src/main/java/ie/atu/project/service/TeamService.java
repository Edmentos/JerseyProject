package ie.atu.project.service;

import ie.atu.project.Team;
import ie.atu.project.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    public List<Team> getTeamsByRegion(Long regionId){
        return teamRepository.findByRegionRegionId(regionId);
    }
}
