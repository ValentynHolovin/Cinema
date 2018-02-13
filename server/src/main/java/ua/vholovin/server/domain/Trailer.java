package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.net.URL;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trailer implements Serializable {
    private Integer trailerID;
    private Integer movieID;
    private URL trailerURL;
    private Date modifiedDate;
}
