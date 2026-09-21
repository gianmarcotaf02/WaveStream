package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return io.sentry.cache.CacheStrategy.lambda$sortFilesOldestToNewest$1((java.io.File) obj, (java.io.File) obj2);
    }
}
