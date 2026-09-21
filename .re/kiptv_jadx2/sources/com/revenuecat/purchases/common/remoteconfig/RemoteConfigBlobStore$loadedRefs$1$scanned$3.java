package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigBlobStore$loadedRefs$1$scanned$3 extends o implements j {
    public static final RemoteConfigBlobStore$loadedRefs$1$scanned$3 INSTANCE = new RemoteConfigBlobStore$loadedRefs$1$scanned$3();

    public RemoteConfigBlobStore$loadedRefs$1$scanned$3() {
        super(1);
    }

    @Override
    public final String invoke(File file) {
        return file.getName();
    }
}
