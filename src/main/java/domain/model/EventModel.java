package domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventModel {
    private Long Id;
    private String name;
    private String date;
    private String location;
    private UserModel userModel;
}
