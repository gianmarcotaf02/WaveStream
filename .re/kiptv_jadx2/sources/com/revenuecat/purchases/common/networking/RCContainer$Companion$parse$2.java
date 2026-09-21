package com.revenuecat.purchases.common.networking;

import androidx.media3.container.NalUnitUtil;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RCContainer$Companion$parse$2 extends o implements Function0 {
    final ByteBuffer $source;

    public RCContainer$Companion$parse$2(ByteBuffer byteBuffer) {
        super(0);
        this.$source = byteBuffer;
    }

    @Override
    public final String invoke() {
        return "Truncated element header: need 32 bytes, got " + this.$source.remaining() + '.';
    }
}
