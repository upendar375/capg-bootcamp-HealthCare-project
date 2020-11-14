package com.capg.hcs.appointmentmanagement.service;

import com.capg.hcs.appointmentmanagement.model.AppointmentManagement;

/*******************************************************************************************************************************
-Author                   :     Mohammad Ikram
-Created/Modified Date    :     
-Description              :     

*******************************************************************************************************************************/

public interface IAppointmentService {
	
	AppointmentManagement makeAppointment(AppointmentManagement appointment);
	AppointmentManagement getAppointment(AppointmentManagement appointment);
	public void approveAppointment();
	public void removeAppointment();

}
