package ie.atu.project;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Team")
public class Team {
    @Id
    @Column(name = "teamId")
    private Long teamId;
    @Column(name = "teamName")
    private String teamName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
