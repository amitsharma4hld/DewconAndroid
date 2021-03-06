// Generated by Dagger (https://dagger.dev).
package com.construction.application.di;

import android.content.Context;
import com.construction.application.data.db.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvideAppDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(appContextProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(Provider<Context> appContextProvider) {
    return new AppModule_ProvideAppDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideAppDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppDatabase(appContext));
  }
}
