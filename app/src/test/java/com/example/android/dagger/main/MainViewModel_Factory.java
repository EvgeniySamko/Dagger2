// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.main;


import com.example.dagger2.MainViewModel;
import com.example.usage.UserDataRepository;

import javax.inject.Provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
        "unchecked",
        "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
    private final Provider<UserDataRepository> userDataRepositoryProvider;

    public MainViewModel_Factory(Provider<UserDataRepository> userDataRepositoryProvider) {
        this.userDataRepositoryProvider = userDataRepositoryProvider;
    }

    public static MainViewModel_Factory create(
            Provider<UserDataRepository> userDataRepositoryProvider) {
        return new MainViewModel_Factory(userDataRepositoryProvider);
    }

    public static MainViewModel newInstance(UserDataRepository userDataRepository) {
        return new MainViewModel(userDataRepository);
    }

    @Override
    public MainViewModel get() {
        return newInstance(userDataRepositoryProvider.get());
    }
}
