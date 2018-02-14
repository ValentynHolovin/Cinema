package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trailer", uniqueConstraints = {@UniqueConstraint(columnNames = {"TrailerURL"})})
public class Trailer implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TrailerID")
    private Integer trailerID;

    @ManyToOne
    @JoinColumn(name = "MovieID", referencedColumnName = "MovieID")
    private Movie movie;

    @Column(name = "TrailerURL", nullable = false, length = 2083, unique = true)
    private URL trailerURL;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;

}
