
package course.registration.systems;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;

/**
 *
 * @author Naza Zuhair
 */

public class Admin {
    private String sID;
    private String Name;
    private String email;
    private String contactno;
    private String adress;

    
    public Admin(String sID, String Name, String email, String contactno, String adress)
    {
        this.sID= sID;
        this.Name= Name;
        this.email = email;
        this.contactno = contactno;
        this.adress = adress;
    }
    
    public void setsID(String sID)
    {
       this.sID =  sID;
    }
    public String getID()
    {
      return this.sID;
    }
    
    public void setName(String Name)
    {
       this.Name =  Name;
    }
    public String getName()
    {
       return this.Name;
    }
    
    public void setemail(String email)
    {
       this.email =  email;
    }
    public String getemail()
    {
       return this.email;
    }
    
    public void setcontactno(String no)
    {
       this.contactno =  no;
    }
    public String getcontactno()
    {
       return this.contactno;
    }
    public void setadress(String adress)
    {
       this.adress =  adress;
    }
    public String getadress()
    {
       return this.adress;
    }
/*    
    public static ArrayList<String> ele = new ArrayList<>();
    
//@Override
    public void admdetails(){
        String filepath = "C:/Users/Naza Zuhair/Documents/NetBeansProjects/Course Registration Systems/Students.txt.txt";
        File file = new File (filepath);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String> lines = new ArrayList<>();
            String line; 
            while ((line = reader.readLine()) != null){
                String[] y = new String[7];
                y = line.split(",");
                
                if ((y[3].equals("A30"))){
                    lines.add(line);
                    line = reader.readLine();
                    
                }
            }
            reader.close();
            System.out.println(lines);
            
        }
        catch(Exception e){
            
        }
    }
    @Override
    public void usr_verification() {
         //To change body of generated methods, choose Tools | Templates.
        
    }

   
   */    
} 
    

