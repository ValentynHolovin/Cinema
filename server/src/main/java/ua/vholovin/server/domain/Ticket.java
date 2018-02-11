package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Integer ticketID;
    private Seance seance;
    private Place place;
    private User user;
    private Date modifiedDate;
}
