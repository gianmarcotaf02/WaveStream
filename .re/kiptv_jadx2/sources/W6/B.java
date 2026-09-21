package W6;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class B {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    public final String f10611h;

    static {
        q0.t(bArr);
    }

    public B(String str) {
        super(str, i);
        this.f10611h = str;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f10610l.clone();
    }
}
