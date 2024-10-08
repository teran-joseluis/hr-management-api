package teran.towers.hr.management.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Position {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "position_id")
  private UUID positionId;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "base_salary")
  private Double baseSalary;

  @Column(name = "record_creation_date")
  @Temporal(TemporalType.DATE)
  private Date recordCreationDate;

  @Column(name = "record_update_date")
  @Temporal(TemporalType.DATE)
  private Date recordUpdateDate;
}
