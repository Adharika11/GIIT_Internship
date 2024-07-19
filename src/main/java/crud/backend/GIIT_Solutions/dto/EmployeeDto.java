package crud.backend.GIIT_Solutions.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    //this class transfers data between client and server.
    public class EmployeeDto {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
    }


