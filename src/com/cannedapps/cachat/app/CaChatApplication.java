package com.cannedapps.cachat.app;

import java.util.List;

import android.content.Context;
import android.net.ConnectivityManager;

import com.google.inject.Module;

import roboguice.application.RoboApplication;

public class CaChatApplication extends RoboApplication {
  @Override
  protected void addApplicationModules(List<Module> modules) {
    modules.add(new AppModule());
    super.addApplicationModules(modules);
  }

  public boolean isConnected() {
    ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
    return connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnectedOrConnecting()
        || connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
  }
}
