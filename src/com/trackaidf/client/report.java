package com.trackaidf.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;

public class report extends Composite  {

	private static reportUiBinder uiBinder = GWT.create(reportUiBinder.class);
	GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface reportUiBinder extends UiBinder<Widget, report> {
	}

	public report(String en) {
		initWidget(uiBinder.createAndBindUi(this));
		a1.getreport(en,new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
			String s1[]=result.split(",");
			MaterialCard mc=new MaterialCard();
			
			for(int i=0;i<s1.length;i++)
			{
				MaterialLabel ml=new MaterialLabel();
				ml.setText(s1[i]);
				mc.add(ml);
				MaterialRow mr=new MaterialRow();
				mc.add(mr);
				RootPanel.get("rr").add(mc);
			}
				
			}
		});
	}

	
}
