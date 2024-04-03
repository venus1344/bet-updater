package org.rdxi.betupdater.booker.Leagues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leagues")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class League {
    @Id
    private ObjectId id;
    private String key;
    private String group;
    private String title;
    private String description;
    private Boolean isActive;
    private Boolean hasOutrights;
    public League(String key, String group, String title, String description, Boolean isActive, Boolean hasOutrights) {
        this.key = key;
        this.group = group;
        this.title = title;
        this.description = description;
        this.isActive = isActive;
        this.hasOutrights = hasOutrights;
    }


}
