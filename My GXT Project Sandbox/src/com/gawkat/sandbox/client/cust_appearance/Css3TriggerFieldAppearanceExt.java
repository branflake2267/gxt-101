package com.gawkat.sandbox.client.cust_appearance;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.triton.client.base.field.Css3TriggerFieldAppearance;

public class Css3TriggerFieldAppearanceExt extends Css3TriggerFieldAppearance {

  public interface Css3TriggerFieldStyleExt extends Css3TriggerFieldStyle {
  }
  
  public interface Css3TriggerFieldResourcesExt extends Css3TriggerFieldResources {
    
    @Override
    @Source({"com/sencha/gxt/theme/triton/client/base/field/Css3ValueBaseField.gss", 
      "com/sencha/gxt/theme/triton/client/base/field/Css3TextField.gss", 
      "com/sencha/gxt/theme/triton/client/base/field/Css3TriggerField.gss",
      "Combo.gss"})
    Css3TriggerFieldStyleExt style();
    
  }
  
  public Css3TriggerFieldAppearanceExt() {
    super(GWT.<Css3TriggerFieldResources>create(Css3TriggerFieldResourcesExt.class));
  }
  
}