package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConfigTopic$Companion$sha256Hex$1 extends o implements j {
    public static final ConfigTopic$Companion$sha256Hex$1 INSTANCE = new ConfigTopic$Companion$sha256Hex$1();

    public ConfigTopic$Companion$sha256Hex$1() {
        super(1);
    }

    public final CharSequence invoke(byte b9) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b9 & 255)}, 1));
    }

    @Override
    public Object invoke(Object obj) {
        return invoke(((Number) obj).byteValue());
    }
}
