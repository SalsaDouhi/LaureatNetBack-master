package com.eheiste.laureatnet.dto.viewmodel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePassDTO {
        private String oldPassword;
        private String newPassword;

}
