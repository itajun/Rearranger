package com.wrq.rearranger;


import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

/**
 * <p>
 * IDEA >=2016 requires configuration panes to be specified in the {@code extensions} tag of the
 * plugin.xml file. To avoid massive changes in the architecture and to keep the plugin compatible
 * with previous versions, the config panel points to this provider, which simply finds the
 * current instance of the plugin and returns it in {@link #createConfigurable()}.
 * </p>
 * <p>
 * Note: Pointing directly to {@link Rearranger} as a {@code Configurable} wouldn't be an option
 * because we'd have two instances of it with different settings.
 * </p>
 */
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
