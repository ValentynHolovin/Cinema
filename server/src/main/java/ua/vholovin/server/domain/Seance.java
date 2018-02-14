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
@Table(name = "seance")
public class Seance implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SeanceID")
    private Integer seanceID;

    private Movie movie;
    private Hall hall;
    private Integer cost;
    private Date date;
    private Date modifiedDate;
}
