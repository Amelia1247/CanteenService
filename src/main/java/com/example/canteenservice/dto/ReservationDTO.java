package com.example.canteenservice.dto;

import com.example.canteenservice.jwt.JwtUtils;
import lombok.Data;

@Data
public class ReservationDTO extends JwtUtils {
    private int id;
    private UserDTO reservedBy;
    private MenuDTO menu;
    private int quantity;
    private boolean isDelivered;

}
