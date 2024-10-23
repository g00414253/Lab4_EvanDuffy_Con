package ie.atu.week6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Min(value=1,message = "Must be greater or equal to one")
    private int id;

    @NotBlank(message = "You must enter a name")
    private String name;

    @Min(value=1,message = "Must be greater or equal to one")
    private double price;

}
