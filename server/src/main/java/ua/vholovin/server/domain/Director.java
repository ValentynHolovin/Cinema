package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Director {
    private Integer directorID;
    private String firstName;
    private String lastName;
    private Date modifiedDate;
}
