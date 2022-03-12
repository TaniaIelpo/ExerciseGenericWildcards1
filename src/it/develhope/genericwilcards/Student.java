package it.develhope.genericwilcards;

import java.util.List;

/**
 * This class represent a student
 *
 * @author Tania Ielpo
 */

public class Student {

    public String studentName;
    public String studentSurname;
    public double marksAverage;//double in the range 18-30

    public Student(String name, String surname, double average){
        this.studentName=name;
        this.studentSurname=surname;
        this.marksAverage=average;

    }

    /**
     * This method calculates the avarage of the votes in a list
     * @param listOfMarks List of votes
     * @return a double that contains the average
     */

    public static double getAverageMark(List<? extends Number> listOfMarks){
        double first = listOfMarks.get(0).doubleValue();
        double second = listOfMarks.get(1).doubleValue();
        //return (first+second)/2;
        return (first+second)/ listOfMarks.size();
    }

    @Override
    public String toString() {
        return "Student: " +
                "NAME= " + studentName +
                ", SURNAME= " + studentSurname +
                ", AVERAGE= " + marksAverage;
    }
}
