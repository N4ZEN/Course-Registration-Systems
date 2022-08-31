/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration.systems;

/**
 *
 * @author Naza Zuhair
 */
public class Course {
    private String ID;
    private String name;
    private String level;
    private String duration;
    
    public Course(String ID, String name, String level, String duration)
    {
        this.ID= ID;
        this.name= name;
        this.level = level;
        this.duration = duration;
    }
    
    public void setID(String ID)
    {
       this.ID =  ID;
    }
    public String getID()
    {
      return this.ID;
    }
    
    public void setName(String Name)
    {
       this.name =  Name;
    }
    public String getName()
    {
       return this.name;
    }
    
    public void setLevel(String level)
    {
       this.level =  level;
    }
    public String getLevel()
    {
       return this.level;
    }
    
    public void setDuration(String Dur)
    {
       this.duration =  Dur;
    }
    public String getDuration()
    {
       return this.duration;
    }
    public void stdfile(){
        
    }
}
