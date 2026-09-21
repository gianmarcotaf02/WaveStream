package O7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class p {
    IGNORE_CASE(2),
    MULTILINE(8),
    LITERAL(16),
    UNIX_LINES(1),
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    CANON_EQ(128);

    static {
        q0.t(pVarArr);
    }

    public p(int i3) {
        super(str, i);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f8061h.clone();
    }
}
