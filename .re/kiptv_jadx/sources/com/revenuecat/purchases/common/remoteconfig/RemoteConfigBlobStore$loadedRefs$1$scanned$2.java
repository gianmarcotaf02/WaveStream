package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigBlobStore$loadedRefs$1$scanned$2 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobStore$loadedRefs$1$scanned$2 INSTANCE = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobStore$loadedRefs$1$scanned$2();

    public RemoteConfigBlobStore$loadedRefs$1$scanned$2() {
        super(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p194x6.j
    public final java.lang.Boolean invoke(java.io.File file) {
        boolean z6;
        if (file.isFile()) {
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigUtils remoteConfigUtils = com.revenuecat.purchases.common.remoteconfig.RemoteConfigUtils.INSTANCE;
            java.lang.String name = file.getName();
            kotlin.jvm.internal.m.d(name, "it.name");
            if (remoteConfigUtils.isValidRef(name)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        return java.lang.Boolean.valueOf(z6);
    }
}
