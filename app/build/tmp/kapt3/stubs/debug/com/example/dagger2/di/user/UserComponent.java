package com.example.dagger2.di.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/dagger2/di/user/UserComponent;", "", "inject", "", "activity", "Lcom/example/dagger2/MainActivity;", "Lcom/example/settings/SettingsActivity;", "Factory", "app_debug"})
@dagger.Subcomponent()
@LoggedUserScope()
public abstract interface UserComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.dagger2.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.settings.SettingsActivity activity);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/dagger2/di/user/UserComponent$Factory;", "", "create", "Lcom/example/dagger2/di/user/UserComponent;", "app_debug"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.dagger2.di.user.UserComponent create();
    }
}