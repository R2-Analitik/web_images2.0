package com.worm.web_images20.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageShowDTO {
    private String uuid;
    private String pathAndName;
    private String imageName;
    private List<String> comments;


    public String getRandComment(){
        return comments.get((int) (Math.random() * comments.size()));
    }
}
