package ie.atu.project.api;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionId;
    @Column(name = "regionName")
    private String regionName;
}
