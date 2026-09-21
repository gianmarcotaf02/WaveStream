package com.revenuecat.purchases.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultFileCache$cacheDir$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.storage.DefaultFileCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFileCache$cacheDir$2(com.revenuecat.purchases.storage.DefaultFileCache defaultFileCache) {
        super(0);
        this.this$0 = defaultFileCache;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.io.File invoke() {
        java.io.File file = new java.io.File(this.this$0.context.getCacheDir(), this.this$0.subDir);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
