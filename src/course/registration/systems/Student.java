
package course.registration.systems;

/**
 *
 * @author Naza Zuhair
 */
public class Student{
    
    private String studID;
    private String stdName;
    private String stdlevel;
    private String stdemail;    
    private String stdcontactno;

    
    public Student(String studID, String stdName, String stdlevel, String stdemail, String stdcontactno )
    {
        this.studID= studID;
        this.stdName= stdName;
        this.stdlevel = stdlevel;
        this.stdemail = stdemail;
        this.stdcontactno = stdcontactno;
    }
    
    public void setstudID(String studID)
    {
       this.studID =  studID;
    }
    public String getstudID()
    {
      return this.studID;
    }
    
    public void setstdName(String stdName)
    {
       this.stdName =  stdName;
    }
    public String getstdName()
    {
       return this.stdName;
    }
    
    public void setstdlevel(String stdlevel)
    {
       this.stdlevel =  stdlevel;
    }
    public String getstdlevel()
    {
       return this.stdlevel;
    }
    
    public void setstdemail(String stdemail)
    {
       this.stdemail =  stdemail;
    }
    public String getstdemail()
    {
       return this.stdemail;
    }
    
    public void setstdcontactno(String stno)
    {
       this.stdcontactno =  stno;
    }
    public String getstdcontactno()
    {
       return this.stdcontactno;
    }
   
}
