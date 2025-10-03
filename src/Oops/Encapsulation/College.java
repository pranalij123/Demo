package Oops.Encapsulation;

public class College {
	Teacher obj;
	public void addTeacher(String name, int conNo, String email, double sal, String date, String subject) {
		if(obj==null) {
			obj=new Teacher(name,conNo,email,sal,date,subject);
			System.out.println("Techer added successfully");
		}
		else {
			System.out.println("Teacher's details are already filled");
		}
		
	}
	public void removeTeacher() {
		 if(obj!=null){
	            obj=null;
	            System.out.println("Teacher removed successfully");
	        }
	        else{
	            System.out.println("Teacher is not added previusly");
	        }
		
	}
	public void updateDetail(String name, long l, String email, double sal, String date, String subject) {
		  if(obj!=null){
		         obj.setName(name);
		         obj.setConNo(l);
		         obj.setEmail(email); 
		         obj.setSal(sal);
		         obj.setJoinningDate(date);
		         obj.setSubject(subject);  
		         System.out.println("details updated");
		        }
		        else{
		            System.out.println("Teacher is not added");
		        }
		
	}
	public void display() {
		System.out.println("Name :"+ obj.getName()+" , "+" conNo: "+ obj.getConNo()+" , "+" Email: "+obj.getEmail()+" , "+" salary: "+obj.getSal()+" , "+" Joinning Date:"+obj.getJoinningDate()+" , Suject"+obj.getSubject());
			
		
	}
	

}
