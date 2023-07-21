package com.officialtemplateproposalview;

import android.graphics.Color;

import androidx.annotation.Nullable;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = OfficialTemplateProposalViewViewManager.NAME)
public class OfficialTemplateProposalViewViewManager extends OfficialTemplateProposalViewViewManagerSpec<OfficialTemplateProposalViewView> {

  public static final String NAME = "OfficialTemplateProposalViewView";

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public OfficialTemplateProposalViewView createViewInstance(ThemedReactContext context) {
    return new OfficialTemplateProposalViewView(context);
  }

  @Override
  @ReactProp(name = "color")
  public void setColor(OfficialTemplateProposalViewView view, @Nullable String color) {
    view.setBackgroundColor(Color.parseColor(color));
  }
}
