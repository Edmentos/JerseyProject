package ie.atu.project.crontroller;

import ie.atu.project.Team;
import ie.atu.project.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @GetMapping("/region/{regionId}")
    public List<Team> getTeamsByRegion(@PathVariable Long regionId){
        return teamService.getTeamsByRegion(regionId);
    }


}
