// Generated by Dagger (https://dagger.dev).
package com.demo.daggerhiltdemo.viewmodel;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static MainActivityViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(MainActivityViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final MainActivityViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MainActivityViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
