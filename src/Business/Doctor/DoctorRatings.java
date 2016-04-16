/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Doctor;

import Business.Patient.Patient;

/**
 *
 * @author rekhajindal
 */
public class DoctorRatings {
    
    private String review;
    private Float rating;
    private Patient patient;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String toString()
    {
        return String.valueOf(rating);
    }
    
}
