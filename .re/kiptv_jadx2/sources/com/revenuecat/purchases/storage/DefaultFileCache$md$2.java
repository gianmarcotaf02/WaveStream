package com.revenuecat.purchases.storage;

import androidx.media3.container.NalUnitUtil;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultFileCache$md$2 extends o implements Function0 {
    public static final DefaultFileCache$md$2 INSTANCE = new DefaultFileCache$md$2();

    public DefaultFileCache$md$2() {
        super(0);
    }

    @Override
    public final MessageDigest invoke() {
        return MessageDigest.getInstance("MD5");
    }
}
