package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

public final class c implements FilenameFilter {
    @Override
    public final boolean accept(File file, String str) {
        return EnvelopeCache.lambda$allEnvelopeFiles$0(file, str);
    }
}
