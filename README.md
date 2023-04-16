# CS-320-Software-Test-Automation-QA
### Project One Scenario
You are a software engineer for Grand Strand Systems, a software engineering company that focuses on developing and testing back-end services. You’ve been given an assignment to develop a mobile application for a customer. The customer will provide you with the requirements. Your job is to code up the application and provide unit tests to verify that it meets the customer’s requirements. You will be delivering the contact, task, and appointment services. The purpose of these services is to add, update, and delete contact, task, and appointment objects within the application.

### Assignment
For this assignment, you will incorporate the code and unit tests that you have developed for the mobile application. First, you developed the contact service and contact object, which you completed in the Module Three milestone. Second, you developed the task service and task object, which you completed in the Module Four milestone. Last, you developed the appointment service and appointment object, which you completed in Module Five milestone. Any feedback received on these assignments should be incorporated prior to submitting the files for this final project.

You have been asked to code up a mobile application for a client and provide unit tests to verify that it meets the customer’s requirements. In order to do so, you must complete the following:

### Contact Class Requirements
The contact object shall have a required unique contact ID String that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.

### Contact Service Requirements
The contact service shall be able to add contacts with unique ID.
The contact service shall be able to delete contacts per contactId.
The contact service shall be able to update contact fields per contactId. The following fields are updatable:
firstName
lastName
PhoneNumber
Address

### Task Requirements
The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.

### Task Service Requirements
The task service shall be able to add tasks with a unique ID.
The task service shall be able to delete tasks per taskId.
The task service shall be able to update task fields per taskId. The following fields are updatable:
name
description

### Appointment Requirements
The appointment object shall have a required unique appointment ID String that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
The appointment object shall have a required appointment Date field. The appointmentDate field cannot be in the past. The appointmentDate field shall not be null. Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.

### Appointment Service Requirements
The appointment service shall be able to add appointments with a unique appointmentId.
The appointment service shall be able to delete appointments per appointmentId.

### Criteria addressed for Project One:
Verify the Contact class meets the requirements through JUnit tests.
Verify the ContactService class meets the requirements through JUnit tests.
Verify the Task class meets the requirements through JUnit tests.
Verify the TaskService class meets the requirements through JUnit tests.
Verify the Appointment class meets the requirements through JUnit tests.
Verify the AppointmentService class meets the requirements through JUnit tests.
Ensure the test coverage for the java files has 80% coverage or higher.

### Project Two Scenario
You are a software engineer for Grand Strand Systems, a software engineering company that focuses on developing and testing back-end services. You recently completed an assignment in which you developed a mobile application for a customer and delivered the contact, task, and appointment services (Project One).

Construct a summary and reflections report to be submitted to your supervisor that summarizes your unit testing approach, your experience writing the JUnit tests, and the overall quality of your JUnit tests. This report will also highlight testing techniques and the mindset you adopted while working on this project.

### Summary
Describe your unit testing approach for each of the three features.
-  To what extent was your approach aligned to the software requirements? Support your claims with specific evidence.
-  Defend the overall quality of your JUnit tests. In other words, how do you know your JUnit tests were effective based on the coverage percentage?
-  Describe your experience writing the JUnit tests.
   -  How did you ensure that your code was technically sound? Cite specific lines of code from your tests to illustrate.
   -  How did you ensure that your code was efficient? Cite specific lines of code from your tests to illustrate.

### Reflection
Testing Techniques
-  What were the software testing techniques that you employed in this project? Describe their characteristics using specific details.
-  What are the other software testing techniques that you did not use for this project? Describe their characteristics using specific details.
   -  For each of the techniques you discussed, explain the practical uses and implications for different software development projects and situations.

### Mindset
-  Assess the mindset that you adopted working on this project. In acting as a software tester, to what extent did you employ caution? Why was it important to            appreciate the complexity and interrelationships of the code you were testing? Provide specific examples to illustrate your claims.
-  Assess the ways you tried to limit bias in your review of the code. On the software developer side, can you imagine that bias would be a concern if you were            responsible for testing your own code? Provide specific examples to illustrate your claims.
-  Finally, evaluate the importance of being disciplined in your commitment to quality as a software engineering professional. Why is it important not to cut corners      when it comes to writing or testing code? How do you plan to avoid technical debt as a practitioner in the field? Provide specific examples to illustrate your          claims.
