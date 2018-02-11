package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actor", uniqueConstraints = {@UniqueConstraint(columnNames = {"FirstName", "LastName"})})
public class Actor implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ActorID")
    private Integer actorID;

    @Column(name = "FirstName", nullable = false, length = 45)
    private String firstName;

    @Column(name = "LastName", nullable = false, length = 45)
    private String lastName;

    @Column(name = "CreatedDate")
    //@Generated(value = GenerationTime.INSERT)
    //@CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "ModifiedDate")
    @Generated(value = GenerationTime.ALWAYS)
    private Timestamp modifiedDate;
}
