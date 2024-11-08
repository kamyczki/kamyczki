package com.kamyczki.stone.write.event.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateStoneDto {
    private String name;
    private String description;
    private String zipCode;
}
