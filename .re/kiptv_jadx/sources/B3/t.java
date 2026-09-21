package B3;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B3.C0089b f666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.l f668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f669d;

    public t(java.lang.String str) {
        B3.AbstractC0088a.c(str);
        this.f667b = str;
        this.f666a = new B3.C0089b("MediaControlChannel", null);
        this.f669d = java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    public final void a(B3.s sVar) {
        this.f669d.add(sVar);
    }

    public final long b() {
        j1.l lVar = this.f668c;
        if (lVar != null) {
            return ((java.util.concurrent.atomic.AtomicLong) lVar.j).getAndIncrement();
        }
        B3.C0089b c0089b = this.f666a;
        android.util.Log.e(c0089b.f617a, c0089b.d("Attempt to generate requestId without a sink", new java.lang.Object[0]));
        return 0L;
    }

    public final void c(long j, java.lang.String str) {
        java.lang.Object[] objArr = {str, null};
        B3.C0089b c0089b = this.f666a;
        c0089b.getClass();
        boolean zEquals = android.os.Build.TYPE.equals(io.sentry.SentryBaseEvent.JsonKeys.USER);
        java.lang.String str2 = c0089b.f617a;
        if (!zEquals && c0089b.f618b && android.util.Log.isLoggable(str2, 2)) {
            android.util.Log.v(str2, c0089b.d("Sending text message: %s to: %s", objArr));
        }
        j1.l lVar = this.f668c;
        if (lVar == null) {
            android.util.Log.e(str2, c0089b.d("Attempt to send text message without a sink", new java.lang.Object[0]));
            return;
        }
        p184w3.C c9 = (p184w3.C) lVar.f23899i;
        if (c9 == null) {
            throw new java.lang.IllegalStateException("Device is not connected");
        }
        java.lang.String str3 = this.f667b;
        B3.AbstractC0088a.c(str3);
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            B3.C0089b c0089b2 = p184w3.C.f29793G;
            android.util.Log.w(c0089b2.f617a, c0089b2.d("Message send failed. Message exceeds maximum size", new java.lang.Object[0]));
            throw new java.lang.IllegalArgumentException("Message exceeds maximum size524288");
        }
        F3.n nVarB = F3.n.b();
        nVarB.f3608d = new p184w3.y(c9, str3, str, 1);
        nVarB.f3607c = 8405;
        c9.c(1, nVarB.a()).b(new C8.a(lVar, j, 3));
    }
}
