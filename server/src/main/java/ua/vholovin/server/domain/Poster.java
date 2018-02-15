package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "poster", uniqueConstraints = {@UniqueConstraint(columnNames = {"PosterName"})})
public class Poster implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PosterID")
    private Integer posterID;

    @ManyToOne
    @JoinColumn(name = "MovieID", referencedColumnName = "MovieID", nullable = false)
    private Movie movie;

    @Column(name = "PosterData", nullable = false)
    @Lob
    private byte[] posterData;

    @Column(name = "PosterName", nullable = false, length = 30, unique = true)
    private String posterName;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
