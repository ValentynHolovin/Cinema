package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place {
    private Integer placeID;
    private Integer hallID;
    private Integer lineNumber;
    private Integer placeNumber;
    private Boolean isAccessible;
    private Date modifiedDate;
}
