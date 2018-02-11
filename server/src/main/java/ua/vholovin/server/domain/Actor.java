package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private Integer actorID;
    private String firstName;
    private String lastName;
    private Date modifiedDate;
}
