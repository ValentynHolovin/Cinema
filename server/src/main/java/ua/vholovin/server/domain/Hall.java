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
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hall", uniqueConstraints = {@UniqueConstraint(columnNames = {"HallName"})})
public class Hall implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HallID")
    private Integer hallID;

    @Column(name = "HallName", nullable = false, length = 15, unique = true)
    private String hallName;

    @Column(name = "Width", nullable = false, length = 2)
    private Integer width;

    @Column(name = "Height", nullable = false, length = 2)
    private Integer height;

    @OneToMany(mappedBy = "hall", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Place> places;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
