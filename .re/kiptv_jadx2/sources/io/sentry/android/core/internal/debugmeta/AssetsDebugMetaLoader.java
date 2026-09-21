package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public final class AssetsDebugMetaLoader implements IDebugMetaLoader {
    private final Context context;
    private final ILogger logger;

    public AssetsDebugMetaLoader(Context context, ILogger iLogger) {
        this.context = ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
    }

    @Override
    public List<Properties> loadDebugMeta() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.context.getAssets().open(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e6) {
            this.logger.log(SentryLevel.INFO, e6, "%s file was not found.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        } catch (IOException e9) {
            this.logger.log(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e9);
            return null;
        } catch (RuntimeException e10) {
            this.logger.log(SentryLevel.ERROR, e10, "%s file is malformed.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        }
    }
}
