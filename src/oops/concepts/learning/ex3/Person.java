package oops.concepts.learning.ex3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/* Ex - 3 Assignment
1. Create Person objects and compute their age
 */
public class Person {
    protected String name;
    protected Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //to compute age
    public int getAge(){
        Calendar today = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime(birthDate);

        int yearDiff = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if(today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH))
            yearDiff = yearDiff - 1;
        else if((today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)) && (today.get(Calendar.DATE) < birthday.get(Calendar.DATE)))
            yearDiff = yearDiff - 1;
        return yearDiff;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setBirthDate(int year, int month, int date){
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date);
        this.birthDate = cal.getTime();
    }

    public void formatBirthDate(Date birthDate){
        Calendar birthday = new GregorianCalendar();
        birthday.setTime(birthDate);
        System.out.println("Birthdate in yyyy/mmm/dd format: "+birthday.get(Calendar.YEAR)+"/"+birthday.get(Calendar.MONTH)
                +"/"+birthday.get(Calendar.DATE));
    }
}
