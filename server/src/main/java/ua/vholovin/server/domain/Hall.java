package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hall {
    private Integer hallID;
    private String hallName;
    private Integer width;
    private Integer height;
    private List<Place> places;
    private Date modifiedDate;
}
