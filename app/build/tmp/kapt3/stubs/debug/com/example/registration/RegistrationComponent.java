package com.example.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/example/registration/RegistrationComponent;", "", "inject", "", "activity", "Lcom/example/registration/RegistrationActivity;", "fragment", "Lcom/example/registration/enterdetails/EnterDetailsFragment;", "Lcom/example/registration/termsandconditions/TermsAndConditionsFragment;", "Factory", "app_debug"})
@dagger.Subcomponent()
@com.example.dagger2.di.ActivityScope()
public abstract interface RegistrationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.registration.RegistrationActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.registration.enterdetails.EnterDetailsFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.registration.termsandconditions.TermsAndConditionsFragment fragment);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/registration/RegistrationComponent$Factory;", "", "create", "Lcom/example/registration/RegistrationComponent;", "app_debug"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.registration.RegistrationComponent create();
    }
}