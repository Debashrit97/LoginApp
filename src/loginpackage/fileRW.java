package loginpackage;
import java.io.*;
import java.util.*;
public class fileRW {
String str;
List<user> userList;
user user;
fileRW(){
	this.str=readFile();
	System.out.println(str);
	this.userList=getList();
}
void setUser(user user) {
	this.user=user;
}
List<user> getList() {
	List<user> list=new ArrayList<>();
	String[] userArray=this.str.split("##");
	
	for(int i=0; i<userArray.length; i++) {
		String userData[]=userArray[i].split(":");
		System.out.println(userData.length);
		if(userData.length==2) {
		user user=new user(userData[0],userData[1]);
		list.add(user);}
	}
	return list;
}
boolean isValid(user user) {
	for(user listuser:userList) {
		if(listuser.email.equals(user.email) && listuser.password.equals(user.password))
			return true;
		
	}

	return false;
}
void add(user user) {
	userList.add(user);
	updateFile();
}
void updateFile() {
	try {
	 FileWriter writer = new FileWriter("user.db"); 
     for(user user:userList) {
    	 writer.write(user.email+":"+user.password+"##");
     }
     // Writes the content to the file
      
     writer.flush();
     writer.close();
	}
	catch(Exception e) {}
}
String readFile() {
	String str="";
	try {
		 FileReader fr=new FileReader("user.db");    
         int i;    
         while((i=fr.read())!=-1) {    
         str+=""+(char)i;
         }
         fr.close();    
	
	}
	catch(Exception e) {}
return str;
}
}
