package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Poster {
    private Integer posterID;
    private Integer movieID;
    private byte[] posterData;
    private String posterName;
    private Date modifiedDate;
}
