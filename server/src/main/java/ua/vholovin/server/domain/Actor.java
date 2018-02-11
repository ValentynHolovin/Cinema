package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actor")
public class Actor implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ActorID", unique = true, nullable = false, updatable = false, insertable = false)
    private Integer actorID;
    @Column(name = "FirstName", nullable = false, length = 45)
    private String firstName;
    @Column(name = "LastName", nullable = false, length = 45)
    private String lastName;
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
}
