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
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class vlogin extends Composite {

	private static vloginUiBinder uiBinder = GWT.create(vloginUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface vloginUiBinder extends UiBinder<Widget, vlogin> {
	}
	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialButton b1;
	

	public vlogin() {
		initWidget(uiBinder.createAndBindUi(this));
  b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String s1=t1.getText();
				String s2=t2.getText();
				
				a1.Check1(s1, s2,new AsyncCallback<String>(){
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						
						if( result.equals("Done"))
						{
							MaterialToast.fireToast(result,3000);
						
							History.newItem("kk");
							Single.getInstance().koifunction(s1,1);
							
							
							
						}
						else
						{
							MaterialToast.fireToast("Chl nikal le",3000);
							Window.alert("Not a Valid user");
						}
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("kaliya",3000);;
			}
		});
			}
			});

		
	}

	

}
