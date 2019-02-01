
package ca.sheridancollege.week1.softwarefundamentals;


public class Student {
  private String studentID;
  private String name;
  private String program;
  private String course;

  public Student(String givenID, String givenName)
  {
      studentID = givenID;
      name = givenName;
  }

  public void setStudentID(String givenID)
  {
      studentID=givenID;
  }

  public String getStudentID()
  {
      return studentID;
  }


    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    
    public void setName(String givenName) {
        name = givenName;
    }
    
}
