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

import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class vfetch extends Composite  {

	private static vfetchUiBinder uiBinder = GWT.create(vfetchUiBinder.class);
	public final GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface vfetchUiBinder extends UiBinder<Widget, vfetch> {
	}

	public vfetch(String fn,String vn) {
		initWidget(uiBinder.createAndBindUi(this));
		MaterialTextBox flag=new MaterialTextBox();
		flag.setText("0");
		
		a1.fetch1(fn,new AsyncCallback<String>() 
		{

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
					MaterialTextBox mr=new MaterialTextBox();
					
					MaterialTextBox txt=new MaterialTextBox();
					MaterialTextBox ques=new MaterialTextBox();
					MaterialTextBox ans=new MaterialTextBox();
					MaterialRadioButton mr1=new MaterialRadioButton();
					MaterialRadioButton mr2=new MaterialRadioButton();
					MaterialRadioButton mr3=new MaterialRadioButton();
					MaterialRadioButton mr4=new MaterialRadioButton();
					MaterialCheckBox mr5=new MaterialCheckBox();
					MaterialCheckBox mr6=new MaterialCheckBox();
					MaterialCheckBox mr7=new MaterialCheckBox();
					MaterialCheckBox mr8=new MaterialCheckBox();
					
					String s2[]=s1[i].split(",");
					MaterialLabel ml=new MaterialLabel();
					System.out.println(s2[0]);
					ml.setText(s2[0]);
					ques.setText(s2[0]);
					RootPanel.get("rr").add(ml);
					if(s2[1].equals("@")==false)
						{
						
						mr1.setName(Integer.toString(i));
						mr1.setText(s2[1]);
						
					     RootPanel.get("rr").add(mr1);
					     txt.setText("radio");
					     
						}
					 if(s2[2].equals("@")==false)
					{
					
					
				     RootPanel.get("rr").add(mr2);
				     mr2.setName(Integer.toString(i));
				     mr2.setText(s2[2]);
				     txt.setText("radio");
				     
					}
					 if(s2[3].equals("@")==false)
					{
					
					mr3.setName(Integer.toString(i));
					
				     RootPanel.get("rr").add(mr3);
				     mr3.setText(s2[3]);
				     txt.setText("radio");
					}
					if(s2[4].equals("@")==false)
					{
					
					mr4.setText(s2[4]);
					mr4.setName(Integer.toString(i));
					
				     RootPanel.get("rr").add(mr4);
				     txt.setText("radio");
					}
					if(s2[5].equals("@")==false)
					{
					
					mr5.setText(s2[5]);
				     RootPanel.get("rr").add(mr5);
				     txt.setText("check");
					}
					 if(s2[6].equals("@")==false)
					{
					
					
				     RootPanel.get("rr").add(mr6);
				     mr6.setName(Integer.toString(i+1));
				     mr6.setText(s2[6]);
				     txt.setText("check");}
					 if(s2[7].equals("@")==false)
					{
					
					mr7.setName(Integer.toString(i+2));
				     RootPanel.get("rr").add(mr7);
				     mr7.setText(s2[7]);
				     txt.setText("check");}
					if(s2[8].equals("@")==false)
					{
					
					
				     RootPanel.get("rr").add(mr8);
				     mr8.setText(s2[8]);
				     mr8.setName(Integer.toString(i+3));
				     txt.setText("check");
				    
					}
				   if(s2[9].equals("@")==false)
		{
					
					
				     RootPanel.get("rr").add(mr);
				     
				     
				     txt.setText("text");
				    
					}
					 if(s2[10].equals("@")==false)
					{
					
					
				     
					}
					 MaterialLink l=new MaterialLink();
					RootPanel.get("rr").add(l);
					 l.setIconType(IconType.GET_APP);
					 MaterialRow r=new MaterialRow();
					 RootPanel.get("rr").add(r);
					 l.addClickHandler(new ClickHandler() {
						
						@Override
						public void onClick(ClickEvent event) {
							// TODO Auto-generated method stub
							String ctxt=txt.getText();
							if(ctxt.equals("radio"))
							{
								if(mr1.isChecked())
									ans.setText(mr1.getText());
								if(mr2.isChecked())
									ans.setText(mr2.getText());
								if(mr3.isChecked())
									ans.setText(mr3.getText());
								if(mr4.isChecked())
									ans.setText(mr4.getText());
									
							}
							if(ctxt.equals("check"))
							{
								if(mr5.isChecked())
									ans.setText(mr5.getText());
								if(mr6.isChecked())
									ans.setText(mr6.getText());
								if(mr7.isChecked())
									ans.setText(mr7.getText());
								if(mr8.isChecked())
									ans.setText(mr8.getText());
									
							}
							if(ctxt.equals("text"))
								ans.setText(mr.getText());
							String ques1=ques.getText();
							String ans1=ans.getText();
							        
						a1.addb(fn,ques1,ans1,new AsyncCallback<String>() {

							@Override
							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								
							}

							@Override
							public void onSuccess(String result) {
								// TODO Auto-generated method stub
								MaterialToast.fireToast("added",2000);
							}
						});
							
							
							
						}
					});
				
				}
			}
		});
		MaterialButton b1=new MaterialButton("Skip to Dashboard");
		RootPanel.get("pp").add(b1);
		a1.addvn(fn,vn,new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				
			}
		});
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("bb");
				Single.getInstance().koifunction();
				RootPanel.get("pp").clear();
			}
		});
	}


}
