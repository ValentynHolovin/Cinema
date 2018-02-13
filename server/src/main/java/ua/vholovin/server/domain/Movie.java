package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie implements Serializable {
    private Integer movieID;
    private String title;
    private String description;
    private Integer age;
    private Integer duration;
    private Date releaseDate;
    private Date startDate;
    private Date endDate;
    private List<Actor> actors;
    private List<Director> directors;
    private List<Genre> genres;
    private List<Country> countries;
    private List<Poster> posters;
    private List<Trailer> trailers;
    private Date modifiedDate;
}
