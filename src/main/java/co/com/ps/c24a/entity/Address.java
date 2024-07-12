package co.com.ps.c24a.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Data

public class Address {

   @Id
   private Long id;
   private Long personId;
   private String city;


}

