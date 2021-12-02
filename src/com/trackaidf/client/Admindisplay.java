package com.trackaidf.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialToast;

public class Admindisplay extends Composite {

	private static AdmindisplayUiBinder uiBinder = GWT.create(AdmindisplayUiBinder.class);
	GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface AdmindisplayUiBinder extends UiBinder<Widget, Admindisplay> {
	}

	public Admindisplay() {
		initWidget(uiBinder.createAndBindUi(this));
		a1.fetch(new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				String s1[]=result.split("@");
				
				for(int i=0;i<s1.length;i++)
				{ 
					
					String s2[]=s1[i].split(",");
					MaterialCard mc=new MaterialCard();
		            MaterialLabel ml=new MaterialLabel();
		            ml.setFontSize("1.5em");
		         
		            ml.setText("LEVEL: "+s2[0]);
		            mc.add(ml);
		            MaterialLabel ml2=new MaterialLabel();
		            ml2.setFontSize("1.5em");
		            ml2.setText("EVENT: "+s2[1]);
		            mc.add(ml2);
		            MaterialLabel ml3=new MaterialLabel();
		            ml3.setText("ABOUT: "+s2[2]);
		            ml3.setFontSize("1.5em");
		            mc.add(ml3);
		            MaterialLabel ml4=new MaterialLabel();
		            ml4.setText("FROM: "+s2[3]);
		            ml4.setFontSize("1.5em");
		            mc.add(ml4);
		            MaterialLabel ml5=new MaterialLabel();
		            ml5.setFontSize("1.5em");
		            ml5.setText("TILL: "+s2[4]);
		            mc.add(ml5);
		            MaterialLabel ml6=new MaterialLabel();
		            ml6.setFontSize("1.5em");
		            ml6.setText("CHIEF GUEST: "+s2[5]);
		            mc.add(ml6);
		            MaterialButton mb=new MaterialButton();
					mb.setText("Click for:"+s2[1]);
					mc.add(mb);
					MaterialRow mr=new MaterialRow();
					mc.add(mr);
		           
					RootPanel.get("rr").add(mc);
		            mb.addClickHandler(new ClickHandler() {
						
						@Override
						public void onClick(ClickEvent event) {
							// TODO Auto-generated method stub
							String st=mb.getText();
							String d[]=st.split(":");
							String en=d[1];
							History.newItem("dd");
							Single.getInstance().koifunction(en);
							
									
						}
					});
		            
		            
				
				}
						
					}
		});
	}

	
}
