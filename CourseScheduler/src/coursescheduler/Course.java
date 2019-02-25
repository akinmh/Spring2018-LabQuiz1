/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author akin
 */
public class Course {
    private String name;
    private String semester;
    private Instructor instructor;
    private Textbook textbook;
    
    public Course() {
        name = null;
        semester = null;
        instructor = null;
        textbook = null;
    }
    
    public Course(String name, String semester, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.semester = semester;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    
    public String toString() {
        return getName() + ", " + getSemester() + System.getProperty("line.separator") + getInstructor().toString() + "\n" + getTextbook().toString();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the instructor
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * @param instructor the instructor to set
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * @return the textbook
     */
    public Textbook getTextbook() {
        return textbook;
    }

    /**
     * @param textbook the textbook to set
     */
    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }
}
