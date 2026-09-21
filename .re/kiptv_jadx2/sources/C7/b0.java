package C7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class b0 {
    j(0, ""),
    f1576k(1, "in"),
    f1577l(2, "out");


    public final String f1579h;

    public final boolean f1580i;

    static {
        q0.t(b0VarArr);
    }

    public b0(int i3, String str) {
        super(str, i3);
        this.f1579h = str;
        this.f1580i = z;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f1578m.clone();
    }

    @Override
    public final String toString() {
        return this.f1579h;
    }
}
