package com.example.settings;

import java.lang.System;

/**
 * SettingsViewModel is the ViewModel that [SettingsActivity] uses to handle complex logic.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/settings/SettingsViewModel;", "", "userDataRepository", "Lcom/example/usage/UserDataRepository;", "userManager", "Lcom/example/usage/UserManager;", "(Lcom/example/usage/UserDataRepository;Lcom/example/usage/UserManager;)V", "logout", "", "refreshNotifications", "app_debug"})
public final class SettingsViewModel {
    private final com.example.usage.UserDataRepository userDataRepository = null;
    private final com.example.usage.UserManager userManager = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.usage.UserDataRepository userDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.usage.UserManager userManager) {
        super();
    }
    
    public final void refreshNotifications() {
    }
    
    public final void logout() {
    }
}