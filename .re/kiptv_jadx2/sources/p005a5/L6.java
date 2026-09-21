package p005a5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class L6 {
    j("movies", "movie"),
    f13624k("shows", "show");


    public final String f13626h;

    public final String f13627i;

    static {
        q0.t(l6Arr);
    }

    public L6(String str, String str2) {
        super(str, i);
        this.f13626h = str;
        this.f13627i = str2;
    }

    public static L6 valueOf(String str) {
        return (L6) Enum.valueOf(L6.class, str);
    }

    public static L6[] values() {
        return (L6[]) f13625l.clone();
    }
}
