package teran.towers.hr.management.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Position {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "position_id")
  private UUID id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "base_salary")
  private Double baseSalary;

  // TODO: Complete 2 Missing Attributes
}
