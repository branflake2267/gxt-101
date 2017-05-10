package com.gawkat.sandbox.client.cust_appearance;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell;
import com.sencha.gxt.cell.core.client.form.TriggerFieldCell.TriggerFieldAppearance;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.form.ComboBox;

public class ComboWithCustomAppearanceExample implements EntryPoint {
  
  @Override
  public void onModuleLoad() {
    VerticalLayoutContainer vlc = new VerticalLayoutContainer();
    vlc.add(createCombo(), new VerticalLayoutData(-1, -1));

    Viewport vp = new Viewport();
    vp.add(vlc, new MarginData(50));

    RootPanel.get()
        .add(vp);
  }

  private ComboBox<Company> createCombo() {
    ListStore<Company> store = new ListStore<Company>(new ModelKeyProvider<Company>() {
      @Override
      public String getKey(Company item) {
        return item.getId()
            .toString();
      }
    });
    store.add(new Company("0", "Company 11"));
    store.add(new Company("1", "Company 22"));
    store.add(new Company("2", "Company 33"));
    store.add(new Company("3", "Company 44"));

    LabelProvider<Company> labelProvider = new LabelProvider<Company>() {
      @Override
      public String getLabel(Company item) {
        if (item.getName() == null) {
          return "";
        }
        return item.getName();
      }
    };

    TriggerFieldAppearance appearance = new Css3TriggerFieldAppearanceExt();
    
    ComboBoxCell<Company> cell = new ComboBoxCell<Company>(store, labelProvider, appearance);
    ComboBox<Company> combo = new ComboBox<Company>(cell);

    return combo;
  }

  public class Company {
    private String id;
    private String name;

    public Company(String id, String name) {
      this.id = id;
      this.name = name;
    }

    public String getId() {
      return id;
    }

    public String getName() {
      return name;
    }
  }

}
