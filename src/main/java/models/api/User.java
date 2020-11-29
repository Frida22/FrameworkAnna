package models.api;

import lombok.*;

import java.util.UUID;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private UUID id;
    private String name;
    private String job;
    private String createdAt;
}
//    private String email;
//    private String first_name;
//    private String last_name;
//    private String avatar;
