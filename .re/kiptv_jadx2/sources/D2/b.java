package D2;

import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.m;

public final class b extends e {
    @Override
    public final void a(i iVar, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iVar);
        sb2.append(':');
        sb.append(sb2.toString());
        sb.append(ServerSentEventKt.SPACE);
        if (str2.length() > 0) {
            sb.append("(" + str2 + ')');
            sb.append(ServerSentEventKt.SPACE);
        }
        sb.append(str);
        String string = sb.toString();
        m.d(string, "toString(...)");
        System.out.println((Object) string);
        if (th != null) {
            th.printStackTrace();
        }
    }
}
