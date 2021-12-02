package com.trackaidf.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class reg extends Composite {

	private static regUiBinder uiBinder = GWT.create(regUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface regUiBinder extends UiBinder<Widget, reg> {
	}
	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialTextBox t5;
	@UiField
	MaterialTextBox t6;
	@UiField
	MaterialTextBox t7;
	@UiField
	MaterialButton b1;

	public reg() {
		initWidget(uiBinder.createAndBindUi(this));
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				String s4=t4.getText();
				String s5=t5.getText();
				String s6=t6.getText();
				String s7=t7.getText();
				a1.Store(s1,s2,s3,s4,s5,s6,s7, new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
						
					}

					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("Data inserted" + result,1000);
						
						
					}
					
				});
				
				
			}
		});
		
		
		
      
	}

	
	
}
