// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.registration.enterdetails;


import com.example.registration.RegistrationViewModel;
import com.example.registration.enterdetails.EnterDetailsFragment;
import com.example.registration.enterdetails.EnterDetailsViewModel;

import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;

@DaggerGenerated
@SuppressWarnings({
        "unchecked",
        "rawtypes"
})
public final class EnterDetailsFragment_MembersInjector implements MembersInjector<EnterDetailsFragment> {
    private final Provider<RegistrationViewModel> registrationViewModelProvider;

    private final Provider<EnterDetailsViewModel> enterDetailsViewModelProvider;

    public EnterDetailsFragment_MembersInjector(
            Provider<RegistrationViewModel> registrationViewModelProvider,
            Provider<EnterDetailsViewModel> enterDetailsViewModelProvider) {
        this.registrationViewModelProvider = registrationViewModelProvider;
        this.enterDetailsViewModelProvider = enterDetailsViewModelProvider;
    }

    public static MembersInjector<EnterDetailsFragment> create(
            Provider<RegistrationViewModel> registrationViewModelProvider,
            Provider<EnterDetailsViewModel> enterDetailsViewModelProvider) {
        return new EnterDetailsFragment_MembersInjector(registrationViewModelProvider, enterDetailsViewModelProvider);
    }

    @InjectedFieldSignature("com.example.android.dagger.registration.enterdetails.EnterDetailsFragment.registrationViewModel")
    public static void injectRegistrationViewModel(EnterDetailsFragment instance,
                                                   RegistrationViewModel registrationViewModel) {
        instance.registrationViewModel = registrationViewModel;
    }

    @InjectedFieldSignature("com.example.android.dagger.registration.enterdetails.EnterDetailsFragment.enterDetailsViewModel")
    public static void injectEnterDetailsViewModel(EnterDetailsFragment instance,
                                                   EnterDetailsViewModel enterDetailsViewModel) {
        instance.enterDetailsViewModel = enterDetailsViewModel;
    }

    @Override
    public void injectMembers(EnterDetailsFragment instance) {
        injectRegistrationViewModel(instance, registrationViewModelProvider.get());
        injectEnterDetailsViewModel(instance, enterDetailsViewModelProvider.get());
    }
}
