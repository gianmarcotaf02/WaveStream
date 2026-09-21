package io.sentry.cache;

import java.io.File;
import java.util.Comparator;

public final class b implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        return CacheStrategy.lambda$sortFilesOldestToNewest$1((File) obj, (File) obj2);
    }
}
