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
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class formui extends Composite {

	private static formuiUiBinder uiBinder = GWT.create(formuiUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface formuiUiBinder extends UiBinder<Widget, formui> {
	}

	public formui() {
		initWidget(uiBinder.createAndBindUi(this));
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String s1=t0.getText();
				String s2=t1.getText();
				String s3=t2.getText();
				String s4=t3.getText();
				String s5=t4.getText();
				String s6=t5.getText();
				
				a1.create(s2,new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
					MaterialToast.fireToast(result);	
					}
				});
				a1.Store(s1,s2,s3,s4,s5,s6, new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
						
					}

					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("Congratulations!Event Created",1000);
						History.newItem("bb");
						Single.getInstance().koifunction();
						
						
					}
					
				});
				
			}
		});

		
	}

	@UiField
	MaterialTextBox t0;
	@UiField
	MaterialButton b1;
	@UiField
	MaterialTextArea t1;
	@UiField
	MaterialTextArea t2;
	@UiField
	MaterialTextArea t3;
	@UiField
	MaterialTextArea t4;
	@UiField
	MaterialTextArea t5;
	

}
