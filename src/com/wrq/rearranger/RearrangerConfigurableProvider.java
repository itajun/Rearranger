package com.wrq.rearranger;


import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

public class RearrangerConfigurableProvider extends ConfigurableProvider
{
    @Nullable
    @Override
    public Configurable createConfigurable()
    {
        final Application application = ApplicationManager.getApplication();
        return application.getComponent(Rearranger.class);
    }
}
