package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O7.f f8039b = new O7.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8040a = true;

    public f() {
        if (p000a.a.h("")) {
            return;
        }
        p000a.a.h("");
    }

    public final void a(java.lang.String str, java.lang.StringBuilder sb) {
        B2.a.x(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
