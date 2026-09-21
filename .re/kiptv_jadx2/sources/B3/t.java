package B3;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.SentryBaseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public abstract class t {

    public final C0089b f666a;

    public final String f667b;

    public j1.l f668c;

    public final List f669d;

    public t(String str) {
        AbstractC0088a.c(str);
        this.f667b = str;
        this.f666a = new C0089b("MediaControlChannel", null);
        this.f669d = Collections.synchronizedList(new ArrayList());
    }

    public final void a(s sVar) {
        this.f669d.add(sVar);
    }

    public final long b() {
        j1.l lVar = this.f668c;
        if (lVar != null) {
            return ((AtomicLong) lVar.j).getAndIncrement();
        }
        C0089b c0089b = this.f666a;
        Log.e(c0089b.f617a, c0089b.d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void c(long j, String str) {
        Object[] objArr = {str, null};
        C0089b c0089b = this.f666a;
        c0089b.getClass();
        boolean zEquals = Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER);
        String str2 = c0089b.f617a;
        if (!zEquals && c0089b.f618b && Log.isLoggable(str2, 2)) {
            Log.v(str2, c0089b.d("Sending text message: %s to: %s", objArr));
        }
        j1.l lVar = this.f668c;
        if (lVar == null) {
            Log.e(str2, c0089b.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        p184w3.C c9 = (p184w3.C) lVar.f23899i;
        if (c9 == null) {
            throw new IllegalStateException("Device is not connected");
        }
        String str3 = this.f667b;
        AbstractC0088a.c(str3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            C0089b c0089b2 = p184w3.C.f29793G;
            Log.w(c0089b2.f617a, c0089b2.d("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        F3.n nVarB = F3.n.b();
        nVarB.f3608d = new p184w3.y(c9, str3, str, 1);
        nVarB.f3607c = 8405;
        c9.c(1, nVarB.a()).b(new C8.a(lVar, j, 3));
    }
}
