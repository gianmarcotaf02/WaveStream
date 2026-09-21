package p110m7;

public class M {
    public static final M j;

    public static final M f25453k;

    public static final J f25454l;

    public static final K f25455m;

    public static final M f25456n;

    public static final M[] f25457o;

    public final N f25458h;

    public final int f25459i;

    M EF10;

    M EF11;

    M EF12;

    static {
        M m8 = new M("DOUBLE", 0, N.DOUBLE, 1);
        M m9 = new M("FLOAT", 1, N.FLOAT, 5);
        N n3 = N.LONG;
        M m10 = new M("INT64", 2, n3, 0);
        M m11 = new M("UINT64", 3, n3, 0);
        N n9 = N.INT;
        M m12 = new M("INT32", 4, n9, 0);
        j = m12;
        M m13 = new M("FIXED64", 5, n3, 1);
        M m14 = new M("FIXED32", 6, n9, 5);
        M m15 = new M("BOOL", 7, N.BOOLEAN, 0);
        f25453k = m15;
        I i3 = new I("STRING", 8, N.STRING, 2);
        N n10 = N.MESSAGE;
        J j9 = new J("GROUP", 9, n10, 3);
        f25454l = j9;
        K k9 = new K("MESSAGE", 10, n10, 2);
        f25455m = k9;
        L l2 = new L("BYTES", 11, N.BYTE_STRING, 2);
        M m16 = new M("UINT32", 12, n9, 0);
        M m17 = new M("ENUM", 13, N.ENUM, 0);
        f25456n = m17;
        f25457o = new M[]{m8, m9, m10, m11, m12, m13, m14, m15, i3, j9, k9, l2, m16, m17, new M("SFIXED32", 14, n9, 5), new M("SFIXED64", 15, n3, 1), new M("SINT32", 16, n9, 0), new M("SINT64", 17, n3, 0)};
    }

    public M(String str, int i3, N n3, int i9) {
        super(str, i3);
        this.f25458h = n3;
        this.f25459i = i9;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f25457o.clone();
    }

    public boolean a() {
        return !(this instanceof I);
    }
}
