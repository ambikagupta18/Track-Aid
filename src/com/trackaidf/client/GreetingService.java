package com.trackaidf.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String Check(String uname,String password)throws IllegalArgumentException;
	String Store(String name,String phn, String email,String event,String level,String efrom,String etill) throws IllegalArgumentException;
String Check1(String uname,String password)throws IllegalArgumentException;
String store(String level,int participants,int men, int women,String feedback,int benificiary,int rating) throws IllegalArgumentException;
String Store(String level,String ename, String aevent,String efrom,String etill,String cgn) throws IllegalArgumentException;
String insert(String en,String ques, String r1, String r2, String r3, String r4, String c1, String c2, String c3, String c4,
			String txt, String file)throws IllegalArgumentException;
String fetch()throws IllegalArgumentException;

String fetch1(String fn)throws IllegalArgumentException;
String create(String fn)throws IllegalArgumentException;
String addb(String en,String ques1,String ans1)throws IllegalArgumentException;
String addvn(String fn,String vn)throws IllegalArgumentException;
String getreport(String fn)throws IllegalArgumentException;
String tcheck(String s1,String s2)throws IllegalArgumentException;


}
