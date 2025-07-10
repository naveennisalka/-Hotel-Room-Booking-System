package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomInfo {
    private String roomId;
    private String Type;
    private double PPN; //price per Night
    private int maxGuestes;
    private boolean availability;
    private String description;
    private int floor;

}



