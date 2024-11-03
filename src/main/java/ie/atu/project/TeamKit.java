package ie.atu.project;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TeamKit")
public class TeamKit {
    @Id
    @Column(name = "kitId")
    private Long kitId;
    @Column(name = "kitType")
    private String kitType;
    @Column(name = "kitOption")
    private String kitOption;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Long getKitId() {
        return kitId;
    }

    public void setKitId(Long kitId) {
        this.kitId = kitId;
    }

    public String getKitType() {
        return kitType;
    }

    public void setKitType(String kitType) {
        this.kitType = kitType;
    }

    public String getKitOption() {
        return kitOption;
    }

    public void setKitOption(String kitOption) {
        this.kitOption = kitOption;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
