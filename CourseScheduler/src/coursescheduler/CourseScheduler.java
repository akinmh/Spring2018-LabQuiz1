/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akin
 */
public class CourseScheduler {
    
    public static void readCourseData(ArrayList<Course> courses, String filename) {
        try {
            Scanner scan = new Scanner(new File(filename));
            
            while (scan.hasNext()) {
                Course c = new Course();
                String[] firstLine = scan.nextLine().split(",");
                c.setName(firstLine[0].trim());
                c.setSemester(firstLine[1].trim());
                
                Instructor teacher = new Instructor();
                String[] secondline = scan.nextLine().split("\\*");
                teacher.setFirstName(secondline[0].trim());
                teacher.setLastName(secondline[1].trim());
                teacher.setOfficeBuilding(secondline[2].trim());
                teacher.setRoomNumber(Integer.parseInt(secondline[3].trim()));
                
                Textbook book = new Textbook();
                book.setTitle(scan.nextLine().trim());
                book.setPublisher(scan.nextLine().trim());
                book.setEdition(Integer.parseInt(scan.nextLine().trim()));
                
                c.setInstructor(teacher);
                c.setTextbook(book);
                
                courses.add(c);
            }
            
            //courses.add(c);
            
        } catch (FileNotFoundException ex) {
            System.err.println("invalid file");
            System.exit(-1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor one = new Instructor();
        Instructor two = new Instructor("Akin", "MasonHogans", "Blair", 128);
        
        Textbook notBook = new Textbook();
        Textbook book = new Textbook("Trees", "Penguin Publishing", 3);
        
        //System.out.println(one.toString());
        //System.out.println(two.toString());
        
        //System.out.println(notBook.toString());
        //System.out.println(book.toString());
        
        Course cr = new Course("COMP167", "Spring 2019", two, book);
        //System.out.println(cr.toString());
        
        ArrayList<Course> courses = new ArrayList<Course>();
        readCourseData(courses, "coursedata.txt");
        
        for (int i = 0; i < courses.size(); i++) {
            Course c = courses.get(i);
            System.out.println(c.toString());
        }
    }
    
}
