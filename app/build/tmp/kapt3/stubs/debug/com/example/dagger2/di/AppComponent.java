package com.example.dagger2.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/dagger2/di/AppComponent;", "", "loginComponent", "Lcom/example/dagger2/login/LoginComponent$Factory;", "registrationComponent", "Lcom/example/registration/RegistrationComponent$Factory;", "userManager", "Lcom/example/usage/UserManager;", "Factory", "app_debug"})
@dagger.Component(modules = {com.example.dagger2.di.StorageModule.class, com.example.dagger2.di.AppSubcomponents.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.registration.RegistrationComponent.Factory registrationComponent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.dagger2.login.LoginComponent.Factory loginComponent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.usage.UserManager userManager();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dagger2/di/AppComponent$Factory;", "", "create", "Lcom/example/dagger2/di/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.dagger2.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}