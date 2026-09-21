package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements java.io.FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return io.sentry.cache.EnvelopeCache.lambda$allEnvelopeFiles$0(file, str);
    }
}
