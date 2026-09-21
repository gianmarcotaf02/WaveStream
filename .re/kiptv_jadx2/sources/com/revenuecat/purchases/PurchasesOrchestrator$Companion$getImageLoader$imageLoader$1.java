package com.revenuecat.purchases;

import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import coil.disk.DiskCache;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p160s6.k;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/disk/DiskCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1 extends o implements Function0 {
    final String $cacheFolder;
    final Context $context;
    final long $maxCacheSizeBytes;

    public PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(Context context, String str, long j) {
        super(0);
        this.$context = context;
        this.$cacheFolder = str;
        this.$maxCacheSizeBytes = j;
    }

    @Override
    public final DiskCache invoke() {
        DiskCache.Builder builder = new DiskCache.Builder();
        File cacheDir = this.$context.getCacheDir();
        m.d(cacheDir, "context.cacheDir");
        return builder.directory(k.S(cacheDir, this.$cacheFolder)).maxSizeBytes(this.$maxCacheSizeBytes).build();
    }
}
