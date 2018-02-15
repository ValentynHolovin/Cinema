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
@Table(name = "place", uniqueConstraints = {@UniqueConstraint(columnNames = {"HallID", "LineNumber", "PlaceNumber"})})
public class Place implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PlaceID")
    private Integer placeID;

    @ManyToOne
    @JoinColumn(name = "HallID", referencedColumnName = "HallID", nullable = false)
    private Hall hall;

    @Column(name = "LineNumber", nullable = false, length = 2, columnDefinition = "TINYINT(2)")
    @Type(type = "byte")
    private Integer lineNumber;

    @Column(name = "PlaceNumber", nullable = false, length = 2, columnDefinition = "TINYINT(2)")
    @Type(type = "byte")
    private Integer placeNumber;

    @Column(name = "IsAccessible", nullable = false)
    @ColumnDefault(value = "1")
    private Boolean isAccessible;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
