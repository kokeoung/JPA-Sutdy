package hellojpa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("MOVIE")
public class Movie extends Item{

    private String director;
    private String actor;
}
