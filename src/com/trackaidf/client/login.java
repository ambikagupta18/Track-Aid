package com.trackaidf.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.rpc.AsyncCallback;
import gwt.material.design.client.ui.MaterialToast;


import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class login extends Composite{

	private static loginUiBinder uiBinder = GWT.create(loginUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);


	interface loginUiBinder extends UiBinder<Widget, login> {
	}
	

	@UiField
	MaterialButton b1;
	
	@UiField
	MaterialButton b2;

     @UiField
     MaterialTextBox t1;
     
     @UiField
     MaterialTextBox t2;
     

	public login() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
			
				// TODO Auto-generated method stub
				Single.getInstance().koifunction();
				
			}
		});
		
		
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String s1=t1.getText();
				String s2=t2.getText();
				
				a1.Check(s1, s2,new AsyncCallback<String>(){
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						
						if( result.equals("Done"))
						{
							MaterialToast.fireToast(result,3000);
							Window.alert("valid");
							History.newItem("bb");
							Single.getInstance().koifunction();
							
							
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
			}});
           b2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("gg");
				Single.getInstance().koifunction();
			}
		});
	
	
	}
		
		}
	




		