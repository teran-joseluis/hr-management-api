package teran.towers.hr.management.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "department_id")
  private UUID id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;
}
