package cl.gpsmain.datasource.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "account")
public class Account {

    @JsonProperty("businessName")
    @Getter
    @Setter
    private String businessName;

    @JsonProperty("businessId")
    @Getter
    @Setter
    private UUID businessId;

    @JsonProperty("profile")
    @Getter
    @Setter
    private Profile profile;

    @JsonProperty("activity")
    @Getter
    @Setter
    private List<Activity> activity;

    @JsonProperty("GPSAssigned")
    @Getter
    @Setter
    private List<GPS> gPSAssigned;

    @JsonProperty("names")
    @Getter
    @Setter
    private String names;

    @JsonProperty("surnames")
    @Getter
    @Setter
    private String surnames;

    @JsonProperty("mail")
    @Getter
    @Setter
    private String mail;

    @JsonProperty("password")
    @Getter
    @Setter
    private String password;

    private static class Profile {

        @JsonProperty("profileName")
        @Getter
        @Setter
        private String profileName;

        @JsonProperty("permission")
        @Getter
        @Setter
        private String permission;

        @JsonProperty("key")
        @Getter
        @Setter
        private UUID key;
    }
}

