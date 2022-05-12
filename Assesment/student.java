class  student{
private String fname,lname,major;
int year;
public String getfname(){
return fname;
}
public void setfname(String fname){
this.fname=fname;
}


public String getlname(){
return fname;
}
public void setlname(String lname){
this.lname=lname;
}


public String getmajor(){
return major;
}
public void setmajor(String major){
this.major=major;
}


public int getYear(){
return year;
}
public void setYear(){
this.year=year;
}





public static void main(String[] args){
student s1=new student();
s1.setfname("Payal");
s1.setlname("Rudrawar");
s1.setmajor("UG");
s1.setYear("22");
system.out.println(s1.getfname());
system.out.println(s1.getlname());
system.out.println(s1.getmajor());
system.out.println(s1.getYear());
}



}
