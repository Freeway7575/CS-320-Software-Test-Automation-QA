///////////////////////////////////////////////////////////////////////////////
//                   ASSIGNMENT INFORMATION
// File:             Appointment.java
// Course ID:        CS-320-T4208
// Course Name:		 Software Test Automation & QA
// Author:           Eric Farkas
// Assignment:		 Project One
///////////////////////////////////////////////////////////////////////////////

import java.util.Date;

public class Appointment {
	
	final private byte APPT_ID_LENGTH;
	final private byte APPT_DESC_LENGTH;
	final private String DEFAULT;
	private String appointmentId;
	private Date appointmentDate;
	private String description;
	
	{
		APPT_ID_LENGTH = 10;
		APPT_DESC_LENGTH = 50;
		DEFAULT = "DEFAULT";
	}
	
	Appointment() {
		Date today = new Date();
		appointmentId = DEFAULT;
		appointmentDate = today;
		description = DEFAULT;
	}
	
	Appointment(String id) {
		Date today = new Date();
		updateAppointmentId(id);
		appointmentDate = today;
		description = DEFAULT;
	}
	
	Appointment(String id, Date date) {
		updateAppointmentId(id);
		updateDate(date);
		description = DEFAULT;
	}
	
	Appointment(String id, Date date, String description) {
		updateAppointmentId(id);
		updateDate(date);
		updateDescription(description);
	}
	
	public void updateAppointmentId(String id) {
		if (id == null) {
			throw new IllegalArgumentException("Appointment ID should not be empty.");
		}
		else if (id.length() > APPT_ID_LENGTH) {
			throw new IllegalArgumentException("Appointment ID cannot exceed " + APPT_ID_LENGTH + " characters.");
		}
		else {
			this.appointmentId = id;
		}
	}
	
	public String getAppointmentId() {
		return appointmentId;
	}
	
	public void updateDate(Date date) {
		if (date == null) {
			throw new IllegalArgumentException("Appointment date should not be empty.");
		}
		else if (date.before(new Date())) {
			throw new IllegalArgumentException("Appointment date should not be in the past.");
		}
		else {
			this.appointmentDate = date;
		}
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public void updateDescription(String description) {
		if (description == null) {
			throw new IllegalArgumentException("Appointment description should not be empty.");
		}
		else if (description.length() > APPT_DESC_LENGTH) {
			throw new IllegalArgumentException("Appointment description cannot exceed " + APPT_DESC_LENGTH + " characters.");
		}
		else {
			this.description = description;
		}
	}
	
	public String getDescription() {
		return description;
	}
}