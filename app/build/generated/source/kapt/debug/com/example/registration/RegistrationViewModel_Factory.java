// Generated by Dagger (https://dagger.dev).
package com.example.registration;

import com.example.usage.UserManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("com.example.dagger2.di.ActivityScope")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegistrationViewModel_Factory implements Factory<RegistrationViewModel> {
  private final Provider<UserManager> userManagerProvider;

  public RegistrationViewModel_Factory(Provider<UserManager> userManagerProvider) {
    this.userManagerProvider = userManagerProvider;
  }

  @Override
  public RegistrationViewModel get() {
    return newInstance(userManagerProvider.get());
  }

  public static RegistrationViewModel_Factory create(Provider<UserManager> userManagerProvider) {
    return new RegistrationViewModel_Factory(userManagerProvider);
  }

  public static RegistrationViewModel newInstance(UserManager userManager) {
    return new RegistrationViewModel(userManager);
  }
}
