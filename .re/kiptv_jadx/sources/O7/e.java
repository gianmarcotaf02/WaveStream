package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O7.e f8038a;

    static {
        O7.e eVar = new O7.e();
        if (!p000a.a.h("  ") && !p000a.a.h("") && !p000a.a.h("")) {
            p000a.a.h("");
        }
        f8038a = eVar;
    }

    public final void a(java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        B2.a.x(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BytesHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
