package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance implements Serializable {
    private Integer seanceID;
    private Movie movie;
    private Hall hall;
    private Integer cost;
    private Date date;
    private Date modifiedDate;
}
