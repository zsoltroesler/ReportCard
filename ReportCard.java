package com.example.android.test;

/**
 * Created by Zsolt on 7/21/2017.
 * ReportCard custom class
 * Grades are between 1-5
 */

public class ReportCard {
    // Student’s name
    private String mStudentName;

    // Grades of subject
    private int mMathGrade;
    private int mBiologyGrade;
    private int mPhysicsGrade;
    private int mChemistryGrade;

    //Construct a new ReportCard object
    public ReportCard(String studentName, int mathGrade, int biologyGrade, int physicsGrade, int chemistryGrade) {
        //Initializes all private variables
        mStudentName = studentName;
        mMathGrade = mathGrade;
        mBiologyGrade = biologyGrade;
        mPhysicsGrade = physicsGrade;
        mChemistryGrade = chemistryGrade;
    }

    // Set student’s name
    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    // Get student’s name
    public String getStudentName() {
        return mStudentName;
    }

    // Set the math grade
    public void setMathGrade(int mathGrade) {
        mMathGrade = mathGrade;
    }

    // Get the math grade
    public int getMathGrade() {
        return mMathGrade;
    }

    // Set the biology grade
    public void setBiologyGrade(int biologyGrade) {
        mBiologyGrade = biologyGrade;
    }

    // Get the biology grade
    public int getBiologyGrade() {
        return mBiologyGrade;
    }

    // Set the physics grade
    public void setPhysicsGrade(int physicsGrade) {
       mPhysicsGrade = physicsGrade;
    }

    // Get the physics grade
    public int getPhysicsGrade() {
        return mPhysicsGrade;
    }

    // Set the chemistry garde
    public void setChemistryGrade(int ChemistryGrade) {
        mChemistryGrade = ChemistryGrade;
    }

    // Get the chemistry grade
    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    // Return a representation of the report card
    @Override
    public String toString() {
        return "Name of the student: " + mStudentName
                + "\nMath: " + mMathGrade
                + "\nBiology: " + mBiologyGrade
                + "\nPhysics: " + mPhysicsGrade
                + "\nChemistry: " + mChemistryGrade;
    }
}