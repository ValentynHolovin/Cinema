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
@Table(name = "ticket", uniqueConstraints = {@UniqueConstraint(columnNames = {"SeanceID", "PlaceID"})})
public class Ticket implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TicketID")
    private Integer ticketID;

    @ManyToOne(targetEntity = Seance.class)
    @JoinColumn(name = "SeanceID", referencedColumnName = "SeanceID", nullable = false)
    private Seance seance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PlaceID", referencedColumnName = "PlaceID", nullable = false)
    private Place place;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID", referencedColumnName = "UserID", nullable = false)
    private User user;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
