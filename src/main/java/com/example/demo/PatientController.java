package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
    /*@GetMapping
	public String getAllPatients()
	{
		return "Patients details are fetched successfully";
	}*/
	
    @PutMapping
    public String UpdatePatient() {
    	return "Patient details updated successfully";
    }
    
    @DeleteMapping
    public String DeletePatient()
    {
    	return "Patient data deleted successfully";
    }
    
    //path parameter
    @GetMapping(path = "/{patientID}")
    public String GetPatientByID(@PathVariable String patientID)
    {
    	return patientID + " is fetched successfully";
    }
	
// query parameter
  @GetMapping
    public String GetPatientByQuery(@RequestParam(value="age") int age, @RequestParam(value="gender") String gender)
    {
    	return "Get Request by query is successfull";
    }
    
}

