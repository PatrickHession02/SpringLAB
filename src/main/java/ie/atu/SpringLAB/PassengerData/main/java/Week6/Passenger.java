package ie.atu.SpringLAB.PassengerData.main.java.Week6;
/*
Name: Patrick Hession
ID Number: G00394619
Date: 27/10/22
Project: Passenger
AIM: Create a class that can be populated with other data from team and test it
 */


public class Passenger {
    //variables
    String Title;
    String Name;
    int Age;
    long Phone;
    long ID;


    public Passenger(String Title, String Name, int Age, long ID, long Phone)   //constructor
    {

        setTitle(Title);
        setName(Name);
        setAge(Age);
        setID(ID);
        setPhone(Phone);

    }

    public String getTitle() {
        return Title;
    }

    public void  setTitle(String myTitle) {
        if ("Mr".equalsIgnoreCase(myTitle) || "Ms".equalsIgnoreCase(myTitle) || "Mrs".equalsIgnoreCase(myTitle)) {
            this.Title = myTitle;
        } else {
            throw new IllegalArgumentException("Entered invalid title.");
        }
    }

    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        if (Name.length() > 3) {
            this.Name = Name;
        } else {
            throw new IllegalArgumentException("Entered invalid Name");
        }
    }

    public long getID() {
        return ID;
    }


    public void setID(long ID) {
        if (String.valueOf(ID).length() >= 10) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Invalid ID entered");
        }
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long Phone) {
        if (String.valueOf(Phone).length() >= 7) {
            this.Phone = Phone;
        } else {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }

    public int getAge() {
        return Age;
    }


    public void setAge(int Age) {
        if (Age >= 16) {
            this.Age = Age;
        } else {
            throw new IllegalArgumentException("Applicant is too young to fly");
        }
    }

}
