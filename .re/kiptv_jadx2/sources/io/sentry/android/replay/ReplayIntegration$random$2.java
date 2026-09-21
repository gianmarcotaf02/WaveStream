package io.sentry.android.replay;

import androidx.media3.container.NalUnitUtil;
import io.sentry.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/sentry/util/Random;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayIntegration$random$2 extends o implements Function0 {
    public static final ReplayIntegration$random$2 INSTANCE = new ReplayIntegration$random$2();

    public ReplayIntegration$random$2() {
        super(0);
    }

    @Override
    public final Random invoke() {
        return new Random();
    }
}
