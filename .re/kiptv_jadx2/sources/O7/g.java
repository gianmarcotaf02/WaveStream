package O7;

public final class g {

    public static final g f8041d;

    public final boolean f8042a;

    public final e f8043b;

    public final f f8044c;

    static {
        e eVar = e.f8038a;
        f fVar = f.f8039b;
        f8041d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z6, e bytes, f number) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        kotlin.jvm.internal.m.e(number, "number");
        this.f8042a = z6;
        this.f8043b = bytes;
        this.f8044c = number;
    }

    public final String toString() {
        StringBuilder sbV = p121o0.p.v("HexFormat(\n    upperCase = ");
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
