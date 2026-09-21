package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2536a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class UserAgentKt$UserAgent$2 extends AbstractC2536a implements Function0 {
    public static final UserAgentKt$UserAgent$2 INSTANCE = new UserAgentKt$UserAgent$2();

    public UserAgentKt$UserAgent$2() {
        super(UserAgentConfig.class, "<init>(Ljava/lang/String;)V");
    }

    @Override
    public final UserAgentConfig invoke() {
        return new UserAgentConfig(null, 1, null);
    }
}
