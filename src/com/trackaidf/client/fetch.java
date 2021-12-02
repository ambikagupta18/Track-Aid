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
import com.trackaidf.client.GreetingService;
import com.trackaidf.client.GreetingServiceAsync;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class fetch extends Composite  {

	private static fetchUiBinder uiBinder = GWT.create(fetchUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface fetchUiBinder extends UiBinder<Widget, fetch> {
	}

	public fetch(String fn) {
		initWidget(uiBinder.createAndBindUi(this));
		
		a1.fetch1(fn,new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
			String s1[]=result.split(":");
			for(int i=0;i<s1.length;i++)
					System.out.println(s1[i]);
				for(int i=0;i<s1.length;i++)
				{
					String s2[]=s1[i].split(",");
					MaterialLabel ml=new MaterialLabel();
					System.out.println(s2[0]);
					ml.setText(s2[0]);
					RootPanel.get("rr").add(ml);
					if(s2[1].equals("@")==false)
						{
						MaterialRadioButton mr=new MaterialRadioButton();
						mr.setName(Integer.toString(i));
						mr.setText(s2[1]);
						
					     RootPanel.get("rr").add(mr);
						}
					 if(s2[2].equals("@")==false)
					{
					MaterialRadioButton mr=new MaterialRadioButton(s2[2]);
					
				     RootPanel.get("rr").add(mr);
				     mr.setName(Integer.toString(i));
				     mr.setText(s2[2]);
				     
					}
					 if(s2[3].equals("@")==false)
					{
					MaterialRadioButton mr=new MaterialRadioButton(s2[3]);
					mr.setName(Integer.toString(i));
					
				     RootPanel.get("rr").add(mr);
				     mr.setText(s2[3]);
					}
					if(s2[4].equals("@")==false)
					{
					MaterialRadioButton mr=new MaterialRadioButton(s2[4]);
					mr.setText(s2[4]);
					mr.setName(Integer.toString(i));
					
				     RootPanel.get("rr").add(mr);
					}
					if(s2[5].equals("@")==false)
					{
					MaterialCheckBox mr=new MaterialCheckBox(s2[5]);
					mr.setText(s2[5]);
				     RootPanel.get("rr").add(mr);
					}
					 if(s2[6].equals("@")==false)
					{
					MaterialCheckBox mr=new MaterialCheckBox(s2[6]);
					
				     RootPanel.get("rr").add(mr);
				     mr.setName(Integer.toString(i+1));
				     mr.setText(s2[6]);}
					 if(s2[7].equals("@")==false)
					{
					MaterialCheckBox mr=new MaterialCheckBox(s2[7]);
					mr.setName(Integer.toString(i+2));
				     RootPanel.get("rr").add(mr);
				     mr.setText(s2[7]);}
					if(s2[8].equals("@")==false)
					{
					MaterialCheckBox mr=new MaterialCheckBox(s2[8]);
					
				     RootPanel.get("rr").add(mr);
				     mr.setText(s2[8]);
				     mr.setName(Integer.toString(i+3));
					}
				   if(s2[9].equals("@")==false)
					{
					MaterialTextBox mr=new MaterialTextBox();
					
				     RootPanel.get("rr").add(mr);
				     mr.setName(Integer.toString(i+4));
					}
					 if(s2[10].equals("@")==false)
					{
					
					
				     
					}
				
				}
			}
		});
		MaterialButton b1=new MaterialButton("Skip to Dashboard");
		RootPanel.get("pp").add(b1);
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			;	// TODO Auto-generated method stub
				History.newItem("bb");
				Single.getInstance().koifunction();
				RootPanel.get("pp").clear();
			}
		});
	}
	

}
