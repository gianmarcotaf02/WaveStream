package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/disk/DiskCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ java.lang.String $cacheFolder;
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ long $maxCacheSizeBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(android.content.Context context, java.lang.String str, long j) {
        super(0);
        this.$context = context;
        this.$cacheFolder = str;
        this.$maxCacheSizeBytes = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final coil.disk.DiskCache invoke() {
        coil.disk.DiskCache.Builder builder = new coil.disk.DiskCache.Builder();
        java.io.File cacheDir = this.$context.getCacheDir();
        kotlin.jvm.internal.m.d(cacheDir, "context.cacheDir");
        return builder.directory(p160s6.k.S(cacheDir, this.$cacheFolder)).maxSizeBytes(this.$maxCacheSizeBytes).build();
    }
}
