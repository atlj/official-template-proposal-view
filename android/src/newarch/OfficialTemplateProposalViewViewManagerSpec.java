package com.officialtemplateproposalview;

import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.OfficialTemplateProposalViewViewManagerDelegate;
import com.facebook.react.viewmanagers.OfficialTemplateProposalViewViewManagerInterface;
import com.facebook.soloader.SoLoader;

public abstract class OfficialTemplateProposalViewViewManagerSpec<T extends View> extends SimpleViewManager<T> implements OfficialTemplateProposalViewViewManagerInterface<T> {
  static {
    if (BuildConfig.CODEGEN_MODULE_REGISTRATION != null) {
      SoLoader.loadLibrary(BuildConfig.CODEGEN_MODULE_REGISTRATION);
    }
  }

  private final ViewManagerDelegate<T> mDelegate;

  public OfficialTemplateProposalViewViewManagerSpec() {
    mDelegate = new OfficialTemplateProposalViewViewManagerDelegate(this);
  }

  @Nullable
  @Override
  protected ViewManagerDelegate<T> getDelegate() {
    return mDelegate;
  }
}
