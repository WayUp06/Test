package DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

public class BookDTO {
    private String name;
    private String author;

}
