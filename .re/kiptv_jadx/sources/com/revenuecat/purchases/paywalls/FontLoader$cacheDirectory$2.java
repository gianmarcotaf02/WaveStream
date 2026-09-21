package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontLoader$cacheDirectory$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.paywalls.FontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontLoader$cacheDirectory$2(com.revenuecat.purchases.paywalls.FontLoader fontLoader) {
        super(0);
        this.this$0 = fontLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.io.File invoke() {
        java.io.File file = this.this$0.providedCacheDir;
        if (file != null) {
            return file;
        }
        java.io.File cacheDir = this.this$0.context.getCacheDir();
        if (cacheDir != null) {
            return new java.io.File(cacheDir, "rc_paywall_fonts");
        }
        return null;
    }
}
