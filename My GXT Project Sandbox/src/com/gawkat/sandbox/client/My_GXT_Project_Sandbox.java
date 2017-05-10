package com.gawkat.sandbox.client;

import com.gawkat.sandbox.client.cust_appearance.ComboWithCustomAppearanceExample;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class My_GXT_Project_Sandbox implements EntryPoint {

  @Override
  public void onModuleLoad() {

    new ComboWithCustomAppearanceExample().onModuleLoad();
    
  }

}
