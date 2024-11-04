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
}
