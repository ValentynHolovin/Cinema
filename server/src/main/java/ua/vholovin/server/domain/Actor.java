package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


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

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
