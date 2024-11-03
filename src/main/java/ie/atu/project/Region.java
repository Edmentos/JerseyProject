package ie.atu.project;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Region")
public class Region {
    @Id
    @Column(name = "regionId")
    private Long regionId;
    @Column(name = "teamName")
    private String regionName;

    @OneToMany(mappedBy = "region")
    private List<Team> teams;

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}