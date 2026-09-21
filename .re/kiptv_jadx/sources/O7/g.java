package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O7.g f8041d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O7.e f8043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O7.f f8044c;

    static {
        O7.e eVar = O7.e.f8038a;
        O7.f fVar = O7.f.f8039b;
        f8041d = new O7.g(false, eVar, fVar);
        new O7.g(true, eVar, fVar);
    }

    public g(boolean z6, O7.e bytes, O7.f number) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        kotlin.jvm.internal.m.e(number, "number");
        this.f8042a = z6;
        this.f8043b = bytes;
        this.f8044c = number;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbV = p121o0.p.v("HexFormat(\n    upperCase = ");
        sbV.append(this.f8042a);
        sbV.append(",\n    bytes = BytesHexFormat(\n");
        this.f8043b.a("        ", sbV);
        sbV.append('\n');
        sbV.append("    ),");
        sbV.append('\n');
        sbV.append("    number = NumberHexFormat(");
        sbV.append('\n');
        this.f8044c.a("        ", sbV);
        sbV.append('\n');
        sbV.append("    )");
        sbV.append('\n');
        sbV.append(")");
        return sbV.toString();
    }
}
