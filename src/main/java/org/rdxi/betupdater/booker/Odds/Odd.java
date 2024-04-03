package org.rdxi.betupdater.booker.Odds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "odds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Odd {
    @Id
    private ObjectId id;
    private String defender;
    private String offender;
    private Double points;
    public Odd(String defender, String offender, Double points) {
        this.defender = defender;
        this.offender = offender;
        this.points = points;
    }


}
