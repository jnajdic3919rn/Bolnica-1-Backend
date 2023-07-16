package raf.bolnica1.patient.dto.externalInfirmary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalizationCreateDto {
    private Timestamp patientAdmission;
    private String lbp;
    private String note;
    private boolean covid;
}
