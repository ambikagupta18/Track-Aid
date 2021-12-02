package com.trackaidf.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Single {
	private static Single a1 = null;
	login l1 = null;
	My aa1 = null;
	reg r1 = null;
	formui fm1 = null;
	feedui fe = null;
	vlogin vl = null;
	dynamic dy = null;
	Display ds = null;
	report r=null;
	fetch f=null;
	vfetch vf;
	rfetch rf;
	
	Admindisplay ads = null;
	String fname=null,vname=null;

	private Single() {

	}

	public static Single getInstance() {
		if (a1 == null)
			a1 = new Single();
		return a1;

	}

	public void koifunction() {

		if (History.getToken().equals("bb")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getMy());
		} else if (History.getToken().equals("cc")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getformui());
		} else if (History.getToken().equals("vv")) {
			
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getadmindisplay());
			
		} else if (History.getToken().equals("ee")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getreg());
		} else if (History.getToken().equals("hh")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getfeedui());
		} else if (History.getToken().equals("gg")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getvlogin());
		} 
		else if (History.getToken().equals("pp")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getfetch());
		} 
		else if (History.getToken().equals("ff")) {
			RootPanel.get("rr").clear();
			RootPanel.get("rr").add(getrfetch());
		} 
		

	}
	public void koifunction(String fn)
	{
		fname=fn;
		 if (History.getToken().equals("dd")) {
				RootPanel.get("rr").clear();
				RootPanel.get("rr").add(getdynamic());
		 }
				 if (History.getToken().equals("mm")) {
						RootPanel.get("rr").clear();
						RootPanel.get("rr").add(getreport());
				
		
		 }
		
	}
	public void koifunction(String vn,int n)
	{
		vname=vn;
		 if (History.getToken().equals("kk")) {
				RootPanel.get("rr").clear();
				RootPanel.get("rr").add(getdisplay());
				
		
		 }
		 
	}
	public void koifunction(String vn,String en)
	{
		vname=vn;
		fname=en;
		 if (History.getToken().equals("kk")) {
				RootPanel.get("rr").clear();
				RootPanel.get("rr").add(getdisplay());
				
		
		 }
		
		 if (History.getToken().equals("jj")) {
				RootPanel.get("rr").clear();
				RootPanel.get("rr").add(getvfetch());
		 }
	}
fetch getfetch()
{
	if(f==null)
		f=new fetch(fname);
	return f;
}
report getreport()
{
	if(r==null)
		r=new report(fname);
	return r;
}
rfetch getrfetch()
{
	if(rf==null)
		rf=new rfetch();
	return rf;
}
vfetch getvfetch()
{
	if(vf==null)
		vf=new vfetch(fname,vname);
	return vf;
}
	dynamic getdynamic() {
		// TODO Auto-generated method stub
		if (dy == null)
			dy = new dynamic(fname);
		return dy;
	}



	Admindisplay getadmindisplay() {
		if (ads == null)
			ads = new Admindisplay();
		return ads;
	}

	vlogin getvlogin() {
		if (vl == null) {
			vl = new vlogin();
		}
		return vl;
	}

	feedui getfeedui() {
		if (fe == null) {
			fe = new feedui();
		}
		return fe;
	}

	formui getformui() {
		if (fm1 == null) {
			fm1 = new formui();
		}
		return fm1;
	}

	Display getdisplay() {
		if (ds == null) {
			ds = new Display(vname);
		}
		return ds;
	}

	reg getreg() {
		if (r1 == null) {
			r1 = new reg();
		}
		return r1;
	}

	login getlogin() {
		if (l1 == null) {
			l1 = new login();
		}
		return l1;
	}

	My getMy() {
		if (aa1 == null) {
			aa1 = new My();
		}
		return aa1;
	}

}
