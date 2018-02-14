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
@Table(name = "seance")
public class Seance implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SeanceID")
    private Integer seanceID;

    @ManyToOne(targetEntity = Movie.class)
    @JoinColumn(name = "MovieID", referencedColumnName = "MovieID")
    private Movie movie;

    @ManyToOne(targetEntity = Hall.class)
    @JoinColumn(name = "HallID", referencedColumnName = "HallID")
    private Hall hall;

    @Column(name = "Cost", nullable = false)
    private Integer cost;

    @Column(name = "Date", nullable = false)
    private Date date;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
