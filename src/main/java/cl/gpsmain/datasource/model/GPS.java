package cl.gpsmain.datasource.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Document(collection = "gps")
public class GPS {

    @MongoId
    @JsonProperty("_id")
    private ObjectId id;

    @JsonProperty("clientId")
    @Getter
    @Setter
    private UUID clientId;

    @JsonProperty("clientSecretId")
    @Getter
    @Setter
    private UUID clientSecretId;

    @JsonProperty("isActive")
    @Getter
    @Setter
    private boolean isActive;

    @JsonProperty("installed")
    @Getter
    @Setter
    private boolean installed;
}