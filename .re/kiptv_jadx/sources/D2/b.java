package D2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends D2.e {
    @Override // D2.e
    public final void a(D2.i iVar, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(iVar);
        sb2.append(':');
        sb.append(sb2.toString());
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        if (str2.length() > 0) {
            sb.append("(" + str2 + ')');
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        }
        sb.append(str);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        java.lang.System.out.println((java.lang.Object) string);
        if (th != null) {
            th.printStackTrace();
        }
    }
}
