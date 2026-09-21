package com.revenuecat.purchases.paywalls;

import androidx.media3.container.NalUnitUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontLoader$cacheDirectory$2 extends o implements Function0 {
    final FontLoader this$0;

    public FontLoader$cacheDirectory$2(FontLoader fontLoader) {
        super(0);
        this.this$0 = fontLoader;
    }

    @Override
    public final File invoke() {
        File file = this.this$0.providedCacheDir;
        if (file != null) {
            return file;
        }
        File cacheDir = this.this$0.context.getCacheDir();
        if (cacheDir != null) {
            return new File(cacheDir, "rc_paywall_fonts");
        }
        return null;
    }
}
