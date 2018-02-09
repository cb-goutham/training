package exer7;
import org.json.simple.JSONArray;
import org.json.simple.*;
import org.json.simple.JSONObject.*;
import org.json.simple.parser.*;
import java.util.*;
import java.io.*;
public class ParseJson
{
	public static void main(String[] args) throws IOException,ParseException{
		JSONParser parser = new JSONParser();
		try
		{
			Object obj = parser.parse(new FileReader("./exer7/students-teachers.json"));
			JSONObject jsonObject = (JSONObject) obj;
			
			//Getting Student
			JSONObject Student = (JSONObject)jsonObject.get("Student");

			String studName = (String)Student.get("Name");
			String doj = (String)Student.get("Date Of Joining");
			String id = (String)Student.get("ID");
			String std = (String)Student.get("Std");
			JSONArray marks = (JSONArray) Student.get("Marks");
			Iterator it = marks.iterator();
			Map<String,Long> Subjects = new HashMap<String,Long>();
			while(it.hasNext())
			{
				Object sub = it.next();
				JSONObject subObj = (JSONObject) sub;
				long mark = (long)subObj.get("Mark");
				String subject =(String)subObj.get("Subject");
				Subjects.put(subject,mark);

			}

			System.out.println("\nSTUDENT DETAILS\n");

			Student s = new Student(id,studName,doj,std,Subjects);
			s.displayStudent();
			
			//Getting Teacher

			JSONObject Teacher = (JSONObject)jsonObject.get("Teacher");
			String teacherName = (String)Teacher.get("Name");
			String tDoj = (String)Teacher.get("Date Of Joining");
			long salary = (long)Teacher.get("Salary");
			String tId =(String)Teacher.get("ID");
			JSONArray classesTakenCare = (JSONArray) Teacher.get("Classes Taking Care Of");
			List<String> classes = new ArrayList<>();
			
			for(int i=0;i<classesTakenCare.size();i++)
				classes.add((String)classesTakenCare.get(i));


			System.out.println("\nTEACHER DETAILS\n");

			Teacher t = new Teacher(tId,teacherName,tDoj,salary,classes);
			t.displayTeacher();	
		}

		catch(IOException e)
		{
			System.err.println(e);
		}
		
	}
}