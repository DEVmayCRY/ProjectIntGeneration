// Generated by Dagger (https://dagger.dev).
package com.example.aplicationtestinglayout.di;

import android.content.Context;
import com.example.aplicationtestinglayout.data.TarefaDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideDaoFactory implements Factory<TarefaDao> {
  private final Provider<Context> contextProvider;

  public ServiceModule_ProvideDaoFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public TarefaDao get() {
    return provideDao(contextProvider.get());
  }

  public static ServiceModule_ProvideDaoFactory create(Provider<Context> contextProvider) {
    return new ServiceModule_ProvideDaoFactory(contextProvider);
  }

  public static TarefaDao provideDao(Context context) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideDao(context));
  }
}