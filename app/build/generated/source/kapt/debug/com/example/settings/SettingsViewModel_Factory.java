// Generated by Dagger (https://dagger.dev).
package com.example.settings;

import com.example.usage.UserDataRepository;
import com.example.usage.UserManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<UserManager> userManagerProvider;

  public SettingsViewModel_Factory(Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<UserManager> userManagerProvider) {
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.userManagerProvider = userManagerProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(userDataRepositoryProvider.get(), userManagerProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<UserManager> userManagerProvider) {
    return new SettingsViewModel_Factory(userDataRepositoryProvider, userManagerProvider);
  }

  public static SettingsViewModel newInstance(UserDataRepository userDataRepository,
      UserManager userManager) {
    return new SettingsViewModel(userDataRepository, userManager);
  }
}
