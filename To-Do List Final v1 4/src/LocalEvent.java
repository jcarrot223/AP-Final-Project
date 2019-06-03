/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juskeerat
 */
import java.time.LocalDate;
import java.time.LocalTime;
public class LocalEvent {
    
    private String description;
    private LocalDate date;
    private LocalTime time;
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public LocalEvent(LocalDate date, String description, LocalTime time)
    {
        this.setDate(date);
        this.setDescription(description);
        this.setTime(time);
    }
    public LocalEvent(LocalDate date, String description)
    {
        this.setDate(date);
        this.setDescription(description);
  
    }
    
 
       /**
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "On " + this.getDate() + " you need to " + this.getDescription() + ". Set at: " + this.getTime() + "!";
    }



}
