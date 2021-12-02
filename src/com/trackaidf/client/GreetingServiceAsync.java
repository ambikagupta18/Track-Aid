package com.trackaidf.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	

	void Check(String s1, String s2, AsyncCallback<String> asyncCallback);

	void Store(String s1, String s2, String s3, String s4, String s5, String s6, String s7,
			AsyncCallback<String> asyncCallback);

	void Check1(String s1, String s2, AsyncCallback<String> asyncCallback);

	void store(String level, int participants, int men, int women, String feedback, int ben, int rating,
			AsyncCallback<String> asyncCallback);

	void Store(String s1, String s2, String s3, String s4, String s5, String s6, AsyncCallback<String> asyncCallback);

	void insert(String en,String ques, String r1, String r2, String r3, String r4, String c1, String c2, String c3, String c4,
			String txt, String file, AsyncCallback<String> asyncCallback);

	void fetch(AsyncCallback<String> asyncCallback);

	
	void fetch1(String fn,AsyncCallback<String> asyncCallback);

	void addb(String en,String ques1, String ans1, AsyncCallback<String> asyncCallback);

	void create(String s2, AsyncCallback<String> asyncCallback);

	void addvn(String fn, String vn, AsyncCallback<String> asyncCallback);

	void getreport(String en, AsyncCallback<String> asyncCallback);

	void tcheck(String s1, String s2, AsyncCallback<String> asyncCallback);

	

}
