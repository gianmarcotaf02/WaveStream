package p043e5;

import com.google.crypto.tink.shaded.protobuf.q0;
import p126o6.b;

public final class d {
    NEW("whatsNew.section.new"),
    IMPROVEMENT("whatsNew.section.improvement"),
    BUGFIX("whatsNew.section.bugfix");


    public static final b f21428m;

    public final String f21429h;

    static {
        f21428m = q0.t(dVarArr);
    }

    public d(String str) {
        super(str, i);
        this.f21429h = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f21427l.clone();
    }
}
