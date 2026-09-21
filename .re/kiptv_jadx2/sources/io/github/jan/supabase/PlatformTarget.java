package io.github.jan.supabase;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import p126o6.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/PlatformTarget;", "", "<init>", "(Ljava/lang/String;I)V", "JVM", "ANDROID", "JS", "WASM_JS", "IOS", "WINDOWS", "MACOS", "TVOS", "WATCHOS", "LINUX", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum PlatformTarget {
    JVM,
    ANDROID,
    JS,
    WASM_JS,
    IOS,
    WINDOWS,
    MACOS,
    TVOS,
    WATCHOS,
    LINUX;

    private static final a $ENTRIES = q0.t(values());

    public static a getEntries() {
        return $ENTRIES;
    }
}
