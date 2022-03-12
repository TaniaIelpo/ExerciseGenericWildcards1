package it.develhope.genericwilcards;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represent the test
 *
 * @author Tania Ielpo
 */

public class Tester {

    public static void main(String[] args) {
        List<Double> individualMarksListLisa= new ArrayList<>();

        //this expressions create random double numbers in the range 18/30
        //and add them at individualMarksLisa List
        individualMarksListLisa.add(Math.random()* (30-18)+18);
        individualMarksListLisa.add(Math.random()* (30-18)+18);

        //System.out.println(Arrays.toString(individualMarksLisa.toArray()));

        List<Integer> projectMarksListJeremy=new ArrayList<>();

        //this expressions create random int numbers in the range 18/30
        //and add them at projectMarksListJeremy
        projectMarksListJeremy.add((int)(Math.random()*(30-18)+18));
        projectMarksListJeremy.add((int)(Math.random()*(30-18)+18));

        //System.out.println(Arrays.toString(projectMarksListJeremy.toArray()));

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg=Student.getAverageMark(projectMarksListJeremy);
        List<Student> listOfStudent=new ArrayList<>(2);
        listOfStudent.add(new Student("Lisa","Stuart", lisaAvg));
        listOfStudent.add(new Student("Jeremy","Green", jeremyAvg));
        System.out.println(listOfStudent.get(0).toString());
        System.out.println(listOfStudent.get(1).toString());


    }
}
