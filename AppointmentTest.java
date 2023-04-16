///////////////////////////////////////////////////////////////////////////////
//                   ASSIGNMENT INFORMATION
// File:             AppointmentTest.java
// Course ID:        CS-320-T4208
// Course Name:		 Software Test Automation & QA
// Author:           Eric Farkas
// Assignment:		 Project One
///////////////////////////////////////////////////////////////////////////////

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	
	private String id, description;
	private String tooLongId, tooLongDescription;
	private Date date, pastDate;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		id = "0123456789";
		description = "Valid appointment object description.";
		date = new Date(2024, Calendar.JANUARY, 1);
		tooLongId = "00112233445566778899";
		tooLongDescription = "Invalid appointment object description - Invalid appointment object description";
		pastDate = new Date(0);
	}
	
	@Test
	void testUpdateAppointmentId() {
		Appointment appt = new Appointment();
		assertThrows(IllegalArgumentException.class,
				() -> appt.updateAppointmentId(null));
		assertThrows(IllegalArgumentException.class,
				() -> appt.updateAppointmentId(tooLongId));
		appt.updateAppointmentId(id);
		assertEquals(id, appt.getAppointmentId());
	}
	
	@Test
	void testGetAppointmentId() {
		Appointment appt = new Appointment(id);
		assertNotNull(appt.getAppointmentId());
		assertEquals(appt.getAppointmentId().length(), 10);
		assertEquals(id, appt.getAppointmentId());
	}
	
	@Test
	void testUpdateDate() {
		Appointment appt = new Appointment();
		assertThrows(IllegalArgumentException.class,
				() -> appt.updateDate(null));
		assertThrows(IllegalArgumentException.class,
				() -> appt.updateDate(pastDate));
		appt.updateDate(date);
		assertEquals(date, appt.getAppointmentDate());
	}
	
	@Test
	void testGetAppointmentDate() {
		Appointment appt = new Appointment(id, date);
		assertNotNull(appt.getAppointmentDate());
		assertEquals(date, appt.getAppointmentDate());
	}
	
	@Test
	void testUpdateDescription() {
		Appointment appt = new Appointment();
		assertThrows(IllegalArgumentException.class,
				() -> appt.updateDescription(null));
		assertThrows(IllegalArgumentException.class,
				() -> appt.updateDescription(tooLongDescription));
		appt.updateDescription(description);
		assertEquals(description, appt.getDescription());
	}
	
	@Test
	void testGetDescription() {
		Appointment appt = new Appointment(id, date, description);
		assertNotNull(appt.getDescription());
		assertTrue(appt.getDescription().length() <= 50);
		assertEquals(description, appt.getDescription());
	}
}