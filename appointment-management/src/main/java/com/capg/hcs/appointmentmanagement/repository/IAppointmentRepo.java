package com.capg.hcs.appointmentmanagement.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.hcs.appointmentmanagement.model.AppointmentManagement;

/*******************************************************************************************************************************
-Author                   :     Mohammad Ikram
-Created/Modified Date    :     
-Description              :     

*******************************************************************************************************************************/

public interface IAppointmentRepo extends JpaRepository<AppointmentManagement, BigInteger> {

}
