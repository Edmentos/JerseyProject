package ie.atu.project;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionId;
    private String regionName;
}
