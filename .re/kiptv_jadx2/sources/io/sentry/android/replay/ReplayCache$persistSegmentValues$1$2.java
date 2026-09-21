package io.sentry.android.replay;

import androidx.media3.container.NalUnitUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayCache$persistSegmentValues$1$2 extends o implements j {
    public static final ReplayCache$persistSegmentValues$1$2 INSTANCE = new ReplayCache$persistSegmentValues$1$2();

    public ReplayCache$persistSegmentValues$1$2() {
        super(1);
    }

    @Override
    public final CharSequence invoke(Map.Entry<String, String> entry) {
        m.e(entry, "<name for destructuring parameter 0>");
        return entry.getKey() + '=' + entry.getValue();
    }
}
