package com.example.horse.dto;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Data
public class HorseInfoDto {

    private int horseId;

    @NotBlank
    @Size (min = 1, max = 10)
    private String horseName;
    @NotBlank

    @NotBlank
    @Pattern(regexp = "^(#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})|red|blue|green|yellow|black|white|purple|orange|pink|brown|gray|cyan)$",
            message = "色は有効な16進数形式または色名である必要があります (例: #FF0000 または red)")
    private String color;

    @NotBlank
    @Size (min = 1)
    private int speed;

    @NotBlank
    @Size (min = 10, max = 100)
    private int stamina;

    @Size (min = 0, max = 10)
    private String emoji;
}
