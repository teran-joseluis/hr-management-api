package teran.towers.hr.management.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "employee_id")
  private UUID employeeId;

  @Column(name = "name")
  private String name;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "birth_date")
  private Date birthDate;

  @Column(name = "email")
  private String email;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "record_creation_date")
  @Temporal(TemporalType.DATE)
  private Date recordCreationDate;

  @Column(name = "record_update_date")
  @Temporal(TemporalType.DATE)
  private Date recordUpdateDate;

  @OneToMany(mappedBy = "employee")
  @JsonIgnore()
  private List<Contract> contracts;

  @ManyToOne()
  @JoinColumn(name = "position_id")
  private Position position;
}
