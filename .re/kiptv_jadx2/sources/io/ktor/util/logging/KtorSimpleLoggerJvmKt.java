package io.ktor.util.logging;

import P8.b;
import P8.d;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "name", "LP8/b;", "Lio/ktor/util/logging/Logger;", "KtorSimpleLogger", "(Ljava/lang/String;)LP8/b;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KtorSimpleLoggerJvmKt {
    public static final b KtorSimpleLogger(String name) {
        m.e(name, "name");
        return d.b().a().a(name);
    }
}
