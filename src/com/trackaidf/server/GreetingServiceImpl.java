package com.trackaidf.server;

import com.trackaidf.client.GreetingService;
import com.trackaidf.shared.FieldVerifier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fourspaces.couchdb.Database;
import com.fourspaces.couchdb.Document;
import com.fourspaces.couchdb.Session;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {
	Connection con=null;
	Statement st=null;

	@Override
	public String Check(String uname, String password) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="Not";
		init();
		try
		{
			rs=st.executeQuery("select * from lo where uname='"+uname+"'and password='"+password+"'");
			
			if(rs.next())
			{
				s1="Done";
				
			}
			
		}
		catch (SQLException e) {
		System.out.println("not");
		}
		return s1;
			

	}


public void init() {
	try {
	
		Class.forName("com.mysql.jdbc.Driver");
		
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	try
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trackaid","root","");
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	try
	{
		st=con.createStatement();
		}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
}

public String store(String uname,String password)
{
	return null;
}


@Override
public String Store(String name, String phn, String email, String event, String level, String efrom, String etill)
		throws IllegalArgumentException {
	// TODO Auto-generated method stub
	String s1="No";
	int k=0;
	init();
	try {
		k=st.executeUpdate("insert into reg values('"+ name +"','"+ phn +"','"+ email +"','"+ event +"','"+ level +"','"+ etill +"','"+efrom +"')");
		
	}
	catch(SQLException e)
	{
		s1=e.getMessage();
	}
	if(k!=0)
		s1="yes";
	
	
	return s1;



}


@Override
public String Check1(String phn, String password) throws IllegalArgumentException {
	// TODO Auto-generated method stub

	ResultSet rs=null;
    String s1="Not";
	init();
	try
	{
	
		rs=st.executeQuery("select * from reg where phn='"+ phn +"'and efrom='"+password+"'");
		
		
		if(rs.next())
		{
			s1="Done";
			
		}
		
	}
	catch (SQLException e) {
	
	}
	System.out.println(s1);
	return s1;
		
	}


@Override
public String store(String level, int participants, int men, int women, String feedback, int benificiary, int rating)
		throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	int k=0;
	String s1="Not";
	init();
	try {
		k=st.executeUpdate("insert into feedback values('"+ level +"',"+ participants +","+ men +","+ women +",'"+ feedback +"',"+ benificiary +","+ rating +")");
		if (k==1)
		{
			s1="Done";
		}
	} catch (SQLException e) {
		System.out.println("not");
	}
	return s1;
	
}


@Override
public String Store(String level, String ename, String aevent, String efrom, String etill, String cgn)
		throws IllegalArgumentException {
	// TODO Auto-generated method stub
	String s1="No";
	int k=0;
	init();
	try {
		k=st.executeUpdate("insert into form values('"+ level +"','"+ ename +"','"+ aevent +"','"+ efrom +"','"+ etill +"','"+ cgn +"')");
		
	}
	catch(SQLException e)
	{
		s1=e.getMessage();
	}
	if(k!=0)
		s1="yes";	
	return s1;
}


@Override
public String insert(String en,String ques, String r1, String r2, String r3, String r4, String c1, String c2, String c3,
		String c4, String txt, String file) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	String s1="No";
	int k=0;
	init();
	try {
		k=st.executeUpdate("insert into dynamic values('"+ en +"','"+ ques +"','"+r1+"','"+r2+"','"+r3+"','"+ r4 +"','"+ c1 +"','"+c2 +"','"+c3+"','"+c4+"','"+txt+"','"+file+"')");
		
	}
	catch(SQLException e)
	{
		s1=e.getMessage();
	}
	if(k!=0)
		s1="yes";
	
	return s1;
}


@Override
public String fetch() throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	String s1="";
	init();
	
	try
	{
		rs=st.executeQuery("select * from form");
		
		while(rs.next())
		{
			s1=s1+ rs.getString(1)+ ","  + rs.getString(2) + "," 
		         + rs.getString(3) + "," + rs.getString(4) + ","
				 +  rs.getString(5) + ","  + rs.getString(6) + "@";
		}
	}
	catch (SQLException e) {
		e.printStackTrace();		
	}
	System.out.println(s1);
	return s1;
}





@Override
public String fetch1(String fn) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	String s1="";
	init();
	try
	{
		rs=st.executeQuery("select * from dynamic where ename='"+fn+"'");
		
		while(rs.next())
		{
			s1=s1+rs.getString("ques")+","+rs.getString("r1")+","+rs.getString("r2")+","+rs.getString("r3")+","+rs.getString("r4")+","+rs.getString("c1")+","+rs.getString("c2")+","+rs.getString("c3")+","+rs.getString("c4")+","+rs.getString("txt")+","+rs.getString("file")+":";
			
		//System.out.println(s1);
			}
		
	}
	catch (SQLException e) {
	System.out.println("not");
	}
	System.out.println(s1);
	String s12[]=s1.split(":");
	for(int i=0;i<s12.length;i++)
		System.out.println(s12[i]);
	return s1;
}


@Override
public String addb(String en,String ques1, String ans1)throws IllegalArgumentException {
	// TODO Auto-generated method stub
	Session couchDb=new Session("localhost", 5984);
	Database mydb=couchDb.getDatabase("trackaid");
//	Document mydoc=new Document();
	//Document mydoc=new Document();
			System.out.println(en);
		Document mydoc=mydb.getDocument(en);
	
	
	
		
	
	mydoc.put(ques1, ans1);
	
	mydb.saveDocument(mydoc);
	
	
	return "data iNSERT";
}


@Override
public String create(String fn) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	Session couchDb=new Session("localhost", 5984);
	Database mydb=couchDb.getDatabase("trackaid");
	Document mydoc=new Document();
	//Document mydoc=new Document();
	mydoc.setId(fn);
	mydb.saveDocument(mydoc);
		return "success";	
	

}


@Override
public String addvn(String fn, String vn) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	Session couchDb=new Session("localhost", 5984);
	Database mydb=couchDb.getDatabase("trackaid");
//	Document mydoc=new Document();
	//Document mydoc=new Document();
			System.out.println(vn);
		Document mydoc=mydb.getDocument(fn);
	
	
	
		
	
	mydoc.put("volunteer no", vn);
	
	mydb.saveDocument(mydoc);
	
	
	return null;
}


@Override
public String getreport(String fn) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	Session couchDb=new Session("localhost", 5984);
	Database mydb=couchDb.getDatabase("trackaid");
//	Document mydoc=new Document();
	//Document mydoc=new Document();
			
		Document mydoc=mydb.getDocument(fn);
		String s=mydoc.toString();
		s=s.substring(1,s.length()-2);
		System.out.println(s);
	return s;
}


@Override
public String tcheck(String username, String password) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	String s1="Not";
	init();
	try
	{
		rs=st.executeQuery("select * from testi where username='"+username+"'and password='"+password+"'");
		
		if(rs.next())
		{
			s1="Done";
			
		}
		
	}
	catch (SQLException e) {
	System.out.println("not");
	}
	return s1;

}
}