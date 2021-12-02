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
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class feedui extends Composite{

	private static feeduiUiBinder uiBinder = GWT.create(feeduiUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);


	interface feeduiUiBinder extends UiBinder<Widget, feedui> {
	}
	 @UiField
	 MaterialButton b1;

	 @UiField
	 MaterialIntegerBox t1;
	 

	 @UiField
	 MaterialIntegerBox t2;
	 

	 @UiField
	 MaterialIntegerBox t3;
	 
	 @UiField
	 MaterialIntegerBox t4;
	 
	 @UiField
	 MaterialIntegerBox t5;
	 
	 @UiField
	 MaterialTextBox s1;
	 
	 @UiField
	 MaterialTextBox s2;

	public feedui() {
		initWidget(uiBinder.createAndBindUi(this));
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				int participants = Integer.parseInt(t1.getText())
						;				int men = Integer.parseInt(t2.getText()) ;
										int women = Integer.parseInt(t3.getText()) ;
										int ben = Integer.parseInt(t4.getText()) ;
										
										String feedback = s1.getText();
										
										String level = s2.getText();
										
										int rating = Integer.parseInt(t5.getText()) ;
										

											a1.store(level,participants,men,women,feedback,ben,rating, new AsyncCallback<String>() {
												
												@Override
												public void onSuccess(String result) {
													// TODO Auto-generated method stub
													MaterialToast.fireToast("succes",3000);
												}
												
												@Override
												public void onFailure(Throwable caught) {
													// TODO Auto-generated method stub
													
												}
											});

									

			}
		});
		
		
		
	}

	
	
}
