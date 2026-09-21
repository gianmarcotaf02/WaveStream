package C5;

public final class G0 {

    public static final G0 f950h;

    public static final G0 f951i;
    public static final G0 j;

    public static final G0 f952k;

    public static final G0 f953l;

    public static final G0 f954m;

    public static final G0[] f955n;

    static {
        G0 g9 = new G0("None", 0);
        f950h = g9;
        G0 g10 = new G0("Audio", 1);
        f951i = g10;
        G0 g11 = new G0("Subtitles", 2);
        j = g11;
        G0 g12 = new G0("Speed", 3);
        f952k = g12;
        G0 g13 = new G0("Quality", 4);
        f953l = g13;
        G0 g14 = new G0("Engine", 5);
        f954m = g14;
        G0[] g0Arr = {g9, g10, g11, g12, g13, g14};
        f955n = g0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(g0Arr);
    }

    public static G0 valueOf(String str) {
        return (G0) Enum.valueOf(G0.class, str);
    }

    public static G0[] values() {
        return (G0[]) f955n.clone();
    }
}
