package ua.vholovin.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie", uniqueConstraints = {@UniqueConstraint(columnNames = {"Title"})})
public class Movie implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MovieID")
    private Integer movieID;

    @Column(name = "Title", nullable = false, unique = true, length = 60)
    private String title;

    @Column(name = "Description", nullable = false, unique = true)
    @Type(type = "text")
    @Lob
    private String description;

    @Column(name = "Age", nullable = false, length = 2, columnDefinition = "TINYINT(2)")
    @Type(type = "byte")
    private Integer age;

    @Column(name = "Duration", nullable = false, length = 3, columnDefinition = "SMALLINT(3)")
    @Type(type = "short")
    private Integer duration;

    @Column(name = "ReleaseDate", nullable = false)
    private Date releaseDate;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "EndDate")
    private Date endDate;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movie_has_actor", joinColumns = {@JoinColumn(name = "MovieID")}, inverseJoinColumns = {@JoinColumn(name = "ActorID")})
    private Set<Actor> actors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movie_has_director", joinColumns = {@JoinColumn(name = "MovieID")}, inverseJoinColumns = {@JoinColumn(name = "DirectorID")})
    private Set<Director> directors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movie_has_genre", joinColumns = {@JoinColumn(name = "MovieID")}, inverseJoinColumns = {@JoinColumn(name = "GenreID")})
    private Set<Genre> genres;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movie_has_country", joinColumns = {@JoinColumn(name = "MovieID")}, inverseJoinColumns = {@JoinColumn(name = "CountryID")})
    private Set<Country> countries;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Poster> posters;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Trailer> trailers;

    @Column(name = "CreatedDate", nullable = false)
    @CreationTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "ModifiedDate", nullable = false)
    @UpdateTimestamp
    @ColumnDefault(value = "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedDate;
}
