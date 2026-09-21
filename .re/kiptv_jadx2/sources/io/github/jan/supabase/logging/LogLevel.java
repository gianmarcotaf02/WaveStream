package io.github.jan.supabase.logging;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import p126o6.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/github/jan/supabase/logging/LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum LogLevel {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    NONE;

    private static final a $ENTRIES = q0.t(values());

    public static a getEntries() {
        return $ENTRIES;
    }
}
