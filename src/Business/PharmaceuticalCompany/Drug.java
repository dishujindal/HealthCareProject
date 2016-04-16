/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.PharmaceuticalCompany;

import Business.Enterprise.Enterprise;

/**
 *
 * @author rekhajindal
 */
public class Drug {
    
    private int drugID;
    private String drugName;
    private float drugStrength;
    private String manufacturingCompany;
    private Enterprise manufacturingEnterprise;
    private String ingredients;
    private String dosageGuidelines;
    private float price;
    private String drugStatus="yet to Decide";
    private static int count=100;
    private DrugGuidelines drugGuidelines;
    public Drug()
    {
         drugID=count;
        count++;
        drugGuidelines=new DrugGuidelines();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public float getDrugStrength() {
        return drugStrength;
    }

    public void setDrugStrength(float drugStrength) {
        this.drugStrength = drugStrength;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDosageGuidelines() {
        return dosageGuidelines;
    }

    public void setDosageGuidelines(String dosageGuidelines) {
        this.dosageGuidelines = dosageGuidelines;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
    }

    public int getDrugID() {
        return drugID;
    }

    public DrugGuidelines getDrugGuidelines() {
        return drugGuidelines;
    }

    public Enterprise getManufacturingEnterprise() {
        return manufacturingEnterprise;
    }

    public void setManufacturingEnterprise(Enterprise manufacturingEnterprise) {
        this.manufacturingEnterprise = manufacturingEnterprise;
    }

    
    
    public String toString()
    {
        return (String.valueOf(drugID));
    }
    
}
