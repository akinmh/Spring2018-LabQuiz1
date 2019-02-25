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
public class Textbook {
    private String title;
    private String publisher;
    private int edition;
    
    public Textbook() {
        title = "";
        publisher = "";
        edition = 0;
    }
    
    public Textbook(String title, String publisher, int edition) {
        this.title = title;
        this.publisher = publisher;
        this.edition = edition;
    }
    
    public String toString() {
        return getTitle() + System.lineSeparator() + getPublisher() + System.lineSeparator() + getEdition();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the edition
     */
    public int getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(int edition) {
        this.edition = edition;
    }
}
