package com.tus.microservices.mapper;

import com.tus.microservices.entity.Doctor;
import com.tus.microservices.model.DoctorRecord;
import com.tus.microservices.model.Specialization;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-04T14:06:53+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public Doctor recordDataToEntity(DoctorRecord doctorRecord) {
        if ( doctorRecord == null ) {
            return null;
        }

        Doctor doctor = new Doctor();

        doctor.setName( doctorRecord.name() );
        doctor.setSpecialization( doctorRecord.specialization() );
        doctor.setPhoneNumber( doctorRecord.phoneNumber() );
        doctor.setEmail( doctorRecord.email() );
        doctor.setId( doctorRecord.id() );

        return doctor;
    }

    @Override
    public DoctorRecord entityDataToRecord(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        String name = null;
        Specialization specialization = null;
        String phoneNumber = null;
        String email = null;
        Long id = null;

        name = doctor.getName();
        specialization = doctor.getSpecialization();
        phoneNumber = doctor.getPhoneNumber();
        email = doctor.getEmail();
        id = doctor.getId();

        DoctorRecord doctorRecord = new DoctorRecord( id, name, specialization, phoneNumber, email );

        return doctorRecord;
    }

    @Override
    public List<DoctorRecord> entityListToRecordList(List<Doctor> doctor) {
        if ( doctor == null ) {
            return null;
        }

        List<DoctorRecord> list = new ArrayList<DoctorRecord>( doctor.size() );
        for ( Doctor doctor1 : doctor ) {
            list.add( entityDataToRecord( doctor1 ) );
        }

        return list;
    }
}
