package com.cannedapps.cachat.app;

import java.util.List;

import com.google.inject.Module;

import roboguice.application.RoboApplication;

public class CaChatApplication extends RoboApplication {
  @Override
  protected void addApplicationModules(List<Module> modules) {
    modules.add(new AppModule());
    super.addApplicationModules(modules);
  }
}
