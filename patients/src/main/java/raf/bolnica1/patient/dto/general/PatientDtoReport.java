package raf.bolnica1.patient.dto.general;
import lombok.Getter;
import lombok.Setter;
import raf.bolnica1.patient.domain.Anamnesis;
import raf.bolnica1.patient.domain.DiagnosisCode;


import java.sql.Date;
@Getter
@Setter
public class PatientDtoReport {

    private Long id;
    private Date examDate;
    private String lbz;
    private boolean confidential;
    private String objectiveFinding;
    private String advice;
    private DiagnosisCode diagnosisCode;
    private Anamnesis anamnesis;

    }

