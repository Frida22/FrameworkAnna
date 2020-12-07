package models.api;

import lombok.*;

import java.util.UUID;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DriverInfoDTO {
    private UUID id;
    private String homebaseId;
    private Boolean enabledDriverApp;
    private String warehouseId;
    private String bundleTemplateId;
    private String bundleAssignmentId;
    private Boolean replenished;
}
