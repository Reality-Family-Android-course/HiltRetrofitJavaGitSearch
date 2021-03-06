// Generated by Dagger (https://dagger.dev).
package com.demo.daggerhiltdemo.di;

import com.demo.daggerhiltdemo.network.RetroServiceInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetRetroServiceInterfaceFactory implements Factory<RetroServiceInterface> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_GetRetroServiceInterfaceFactory(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RetroServiceInterface get() {
    return getRetroServiceInterface(module, retrofitProvider.get());
  }

  public static AppModule_GetRetroServiceInterfaceFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_GetRetroServiceInterfaceFactory(module, retrofitProvider);
  }

  public static RetroServiceInterface getRetroServiceInterface(AppModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.getRetroServiceInterface(retrofit));
  }
}
