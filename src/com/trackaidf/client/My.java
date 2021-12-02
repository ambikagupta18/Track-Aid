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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialCardAction;
import gwt.material.design.client.ui.MaterialCardImage;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavBrand;

public class My extends Composite {

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

	interface MyUiBinder extends UiBinder<Widget, My> {
		
		
	}
	public My()
	{
		initWidget(uiBinder.createAndBindUi(this));
History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
			
				// TODO Auto-generated method stub
				Single.getInstance().koifunction();
				
			}
		});
		
		
	ml1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("cc");
				Single.getInstance().koifunction();
			}
		});
	ml2.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			History.newItem("vv");
			Single.getInstance().koifunction();
			//RootPanel.get("rr").clear();
			//RootPanel.get("rr").add(new Admindisplay());
		}
	});
	ml3.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			History.newItem("ee");
			Single.getInstance().koifunction();
			
		}
	});
	ml4.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			History.newItem("ff");
			Single.getInstance().koifunction();
		}
	});
		
	}
	
	
	
	@UiField
	MaterialHeader header;
	@UiField
	MaterialNavBar navBar;
	@UiField
	MaterialNavBrand nb;
	
	@UiField
	MaterialCard mc1;

	@UiField
	MaterialCardImage mci1;
	
	@UiField                                  
	MaterialImage mi1;
	
	@UiField
	MaterialCardAction mca1;	
	
	@UiField
	MaterialLink ml1;
	
	@UiField
	MaterialLink ml2;
	
	@UiField
	MaterialLink ml3;
	
	@UiField
	MaterialLink ml4;

	

}
