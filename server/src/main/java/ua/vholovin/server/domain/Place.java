package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place implements Serializable {
    private Integer placeID;
    private Integer hallID;
    private Integer lineNumber;
    private Integer placeNumber;
    private Boolean isAccessible;
    private Date modifiedDate;
}
