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

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class dynamic extends Composite  {

	private static dynamicUiBinder uiBinder = GWT.create(dynamicUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface dynamicUiBinder extends UiBinder<Widget, dynamic> {
	}

	public dynamic(String fn) {
		initWidget(uiBinder.createAndBindUi(this));
		
		ft.setText(fn);
		MaterialTextBox buf=new MaterialTextBox();
		buf.setText("0");
		MaterialTextBox buf2=new MaterialTextBox();
		buf2.setText("0");
		MaterialTextBox bufr1=new MaterialTextBox();
		bufr1.setText("@");
		MaterialTextBox bufr2=new MaterialTextBox();
		bufr2.setText("@");
		MaterialTextBox bufr3=new MaterialTextBox();
		bufr3.setText("@");
		MaterialTextBox bufr4=new MaterialTextBox();
		bufr4.setText("@");
		MaterialTextBox bufc1=new MaterialTextBox();
		bufc1.setText("@");
		MaterialTextBox bufc2=new MaterialTextBox();
		MaterialTextBox bufc3=new MaterialTextBox();
		
		bufc2.setText("@");
		bufc3.setText("@");
		MaterialTextBox bufc4=new MaterialTextBox();
		bufc4.setText("@");
		MaterialTextBox buftxt=new MaterialTextBox();
		buftxt.setText("@");
		MaterialTextBox buffile=new MaterialTextBox();
		buffile.setText("@");

		MaterialTextBox bufques=new MaterialTextBox();
		bufques.setText("@");
		
		
		ml5.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("rr").clear();
				RootPanel.get("rr").add(new dynamic(fn));
			}
		});
		ml1.addClickHandler(new ClickHandler() {
		    @Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				buftxt.setText("1");
				ml2.setEnabled(false);
				ml3.setEnabled(false);
				ml4.setEnabled(false);
				ml6.setEnabled(false);
				MaterialTextBox mta=new MaterialTextBox();
				mta.setEnabled(false);
				mta.setLength(50);
				RootPanel.get("rr").add(mta);
			
			}
		});
       
		ml2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				 if(Integer.parseInt(buf.getText())>=4)							
						{MaterialToast.fireToast("Only four multiple choices allowed",1000);	}
						
				ml1.setEnabled(false);
				ml3.setEnabled(false);
				ml4.setEnabled(false);
				ml6.setEnabled(false);
				
				MaterialTextBox mtb=new MaterialTextBox();
				mtb.setIconType(IconType.PANORAMA_FISH_EYE);
				mtb.setPlaceholder("Option");
				RootPanel.get("rr").add(mtb);
				MaterialButton ri=new MaterialButton();
				ri.setIconType(IconType.DONE);
				RootPanel.get("rr").add(ri);
			    ri.addClickHandler(new ClickHandler() {
				@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						String st=mtb.getText();
					    
						if(Integer.parseInt(buf.getText())==0)
						bufr1.setText(st);
						else if(Integer.parseInt(buf.getText())==1)
						bufr2.setText(st);	
						else if(Integer.parseInt(buf.getText())==2)
						bufr3.setText(st); 
						else if(Integer.parseInt(buf.getText())==3)
						bufr4.setText(st);
						else if(Integer.parseInt(buf.getText())>=4)							
						MaterialToast.fireToast("Only four multiple choices allowed",1000);		
						int k=Integer.parseInt(buf.getText());
						
                                  k++;
						buf.setText(Integer.toString(k));
					}
				});
			    
			   
			}	});
				
		sf.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("pp");
				Single.getInstance().koifunction();
			}
		});
		
            ml3.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				ml1.setEnabled(false);
				ml2.setEnabled(false);
				ml4.setEnabled(false);
				ml6.setEnabled(false);
				MaterialRadioButton mrb=new MaterialRadioButton();
				MaterialTextBox mtb=new MaterialTextBox();
				mtb.setIconType(IconType.CROP_DIN);
				mtb.setPlaceholder("Option");
				RootPanel.get("rr").add(mtb);
				MaterialButton ri=new MaterialButton();
				ri.setIconType(IconType.DONE);
				RootPanel.get("rr").add(ri);
				ri.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						String st=mtb.getText();
						int k=Integer.parseInt(buf2.getText());
						if(k==0)
						bufc1.setText(st);						
						else if(k==1)
							bufc2.setText(st);	
						else if(k==2)
							bufc3.setText(st);
						else if(k==3)
							bufc4.setText(st);
						k++;
						buf2.setText(Integer.toString(k));
					}
				});
		}});
		ml4.addClickHandler(new ClickHandler() {		
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				MaterialLabel l=new MaterialLabel("The volunteers will have the option of uploading photographs for validating and tracking the event", Color.BLACK);
				RootPanel.get("rr").add(l);
				buffile.setText("1");
			}
		});
		b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if(event.isShiftKeyDown())
					System.out.println("yes!");
				// TODO Auto-generated method stub
				bufques.setText(t.getText());
				String ques=bufques.getText();
				String r1=bufr1.getText();
				String r2=bufr2.getText();
				String r3=bufr3.getText();
				String r4=bufr4.getText();
				String c1=bufc1.getText();
				String c2=bufc2.getText();
				String c3=bufc3.getText();
				String c4=bufc4.getText();
				String txt=buftxt.getText();
				String file=buffile.getText();
				String en=ft.getText();
				a1.insert(en,ques,r1,r2,r3,r4,c1,c2,c3,c4,txt,file,new AsyncCallback<String>() {

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
				
			}
		});
	
	
	}

	@UiField
	MaterialLink ml1;
	@UiField
	MaterialLink ml2;
	@UiField
	MaterialLink ml3;
	@UiField
	MaterialLink ml4;
	@UiField
	MaterialLink ml5;
    @UiField
    MaterialButton b;
	@UiField
	MaterialLink ml6;
	@UiField
	MaterialTextBox t;
	@UiField
	MaterialTextBox ft;
	@UiField
	MaterialButton sf;

}
