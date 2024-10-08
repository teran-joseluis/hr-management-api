package teran.towers.hr.management.api.repository.entities;

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
public class Contract {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "contract_id")
  private UUID contractId;

  @Column(name = "start_date")
  private Date startDate;

  @Column(name = "end_date")
  private Date endDate;

  @Column(name = "record_creation_date")
  @Temporal(TemporalType.DATE)
  private Date recordCreationDate;

  @Column(name = "record_update_date")
  @Temporal(TemporalType.DATE)
  private Date recordUpdateDate;

  @ManyToOne()
  @JoinColumn(name = "employee_id")
  private Employee employee;

  @ManyToOne()
  @JoinColumn(name = "user_id")
  private User user;
}
