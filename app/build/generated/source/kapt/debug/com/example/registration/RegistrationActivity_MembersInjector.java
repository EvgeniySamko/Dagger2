// Generated by Dagger (https://dagger.dev).
package com.example.registration;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegistrationActivity_MembersInjector implements MembersInjector<RegistrationActivity> {
  private final Provider<RegistrationViewModel> registrationViewModelProvider;

  public RegistrationActivity_MembersInjector(
      Provider<RegistrationViewModel> registrationViewModelProvider) {
    this.registrationViewModelProvider = registrationViewModelProvider;
  }

  public static MembersInjector<RegistrationActivity> create(
      Provider<RegistrationViewModel> registrationViewModelProvider) {
    return new RegistrationActivity_MembersInjector(registrationViewModelProvider);
  }

  @Override
  public void injectMembers(RegistrationActivity instance) {
    injectRegistrationViewModel(instance, registrationViewModelProvider.get());
  }

  @InjectedFieldSignature("com.example.registration.RegistrationActivity.registrationViewModel")
  public static void injectRegistrationViewModel(RegistrationActivity instance,
      RegistrationViewModel registrationViewModel) {
    instance.registrationViewModel = registrationViewModel;
  }
}
