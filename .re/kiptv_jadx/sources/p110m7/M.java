package p110m7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public class M {
    public static final p110m7.M j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p110m7.M f25453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p110m7.J f25454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p110m7.K f25455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p110m7.M f25456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p110m7.M[] f25457o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.N f25458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25459i;

    /* JADX INFO: Fake field, exist only in values array */
    p110m7.M EF10;

    /* JADX INFO: Fake field, exist only in values array */
    p110m7.M EF11;

    /* JADX INFO: Fake field, exist only in values array */
    p110m7.M EF12;

    static {
        p110m7.M m8 = new p110m7.M("DOUBLE", 0, p110m7.N.DOUBLE, 1);
        p110m7.M m9 = new p110m7.M("FLOAT", 1, p110m7.N.FLOAT, 5);
        p110m7.N n3 = p110m7.N.LONG;
        p110m7.M m10 = new p110m7.M("INT64", 2, n3, 0);
        p110m7.M m11 = new p110m7.M("UINT64", 3, n3, 0);
        p110m7.N n9 = p110m7.N.INT;
        p110m7.M m12 = new p110m7.M("INT32", 4, n9, 0);
        j = m12;
        p110m7.M m13 = new p110m7.M("FIXED64", 5, n3, 1);
        p110m7.M m14 = new p110m7.M("FIXED32", 6, n9, 5);
        p110m7.M m15 = new p110m7.M("BOOL", 7, p110m7.N.BOOLEAN, 0);
        f25453k = m15;
        p110m7.I i3 = new p110m7.I("STRING", 8, p110m7.N.STRING, 2);
        p110m7.N n10 = p110m7.N.MESSAGE;
        p110m7.J j9 = new p110m7.J("GROUP", 9, n10, 3);
        f25454l = j9;
        p110m7.K k9 = new p110m7.K("MESSAGE", 10, n10, 2);
        f25455m = k9;
        p110m7.L l2 = new p110m7.L("BYTES", 11, p110m7.N.BYTE_STRING, 2);
        p110m7.M m16 = new p110m7.M("UINT32", 12, n9, 0);
        p110m7.M m17 = new p110m7.M("ENUM", 13, p110m7.N.ENUM, 0);
        f25456n = m17;
        f25457o = new p110m7.M[]{m8, m9, m10, m11, m12, m13, m14, m15, i3, j9, k9, l2, m16, m17, new p110m7.M("SFIXED32", 14, n9, 5), new p110m7.M("SFIXED64", 15, n3, 1), new p110m7.M("SINT32", 16, n9, 0), new p110m7.M("SINT64", 17, n3, 0)};
    }

    public M(java.lang.String str, int i3, p110m7.N n3, int i9) {
        super(str, i3);
        this.f25458h = n3;
        this.f25459i = i9;
    }

    public static p110m7.M valueOf(java.lang.String str) {
        return (p110m7.M) java.lang.Enum.valueOf(p110m7.M.class, str);
    }

    public static p110m7.M[] values() {
        return (p110m7.M[]) f25457o.clone();
    }

    public boolean a() {
        return !(this instanceof p110m7.I);
    }
}
