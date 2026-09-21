package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigBlobStore$loadedRefs$1$scanned$2 extends o implements j {
    public static final RemoteConfigBlobStore$loadedRefs$1$scanned$2 INSTANCE = new RemoteConfigBlobStore$loadedRefs$1$scanned$2();

    public RemoteConfigBlobStore$loadedRefs$1$scanned$2() {
        super(1);
    }

    @Override
    public final Boolean invoke(File file) {
        boolean z6;
        if (file.isFile()) {
            RemoteConfigUtils remoteConfigUtils = RemoteConfigUtils.INSTANCE;
            String name = file.getName();
            m.d(name, "it.name");
            if (remoteConfigUtils.isValidRef(name)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        return Boolean.valueOf(z6);
    }
}
