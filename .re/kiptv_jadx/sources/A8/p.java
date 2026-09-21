package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(java.lang.String str, int i3, java.lang.Object obj) {
        super(str, true);
        this.f441e = i3;
        this.f442f = obj;
    }

    @Override // z8.a
    public final long a() {
        switch (this.f441e) {
            case 0:
                A8.q qVar = (A8.q) this.f442f;
                long jNanoTime = java.lang.System.nanoTime();
                int i3 = 0;
                long j = Long.MIN_VALUE;
                A8.o oVar = null;
                int i9 = 0;
                for (A8.o connection : qVar.f446d) {
                    kotlin.jvm.internal.m.d(connection, "connection");
                    synchronized (connection) {
                        if (qVar.b(connection, jNanoTime) > 0) {
                            i9++;
                        } else {
                            i3++;
                            long j9 = jNanoTime - connection.f440q;
                            if (j9 > j) {
                                oVar = connection;
                                j = j9;
                            }
                        }
                    }
                }
                long j10 = qVar.f443a;
                if (j < j10 && i3 <= 5) {
                    if (i3 > 0) {
                        return j10 - j;
                    }
                    if (i9 > 0) {
                        return j10;
                    }
                    return -1L;
                }
                kotlin.jvm.internal.m.b(oVar);
                synchronized (oVar) {
                    if (!oVar.f439p.isEmpty()) {
                        return 0L;
                    }
                    if (oVar.f440q + j != jNanoTime) {
                        return 0L;
                    }
                    oVar.j = true;
                    qVar.f446d.remove(oVar);
                    java.net.Socket socket = oVar.f429d;
                    kotlin.jvm.internal.m.b(socket);
                    x8.b.d(socket);
                    if (!qVar.f446d.isEmpty()) {
                        return 0L;
                    }
                    qVar.f444b.a();
                    return 0L;
                }
            case 1:
                D8.n nVar = (D8.n) this.f442f;
                nVar.getClass();
                try {
                    nVar.f2547D.u(2, 0, false);
                    return -1L;
                } catch (java.io.IOException e6) {
                    nVar.b(2, 2, e6);
                    return -1L;
                }
            default:
                ((A7.l) this.f442f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(A8.q qVar, java.lang.String str) {
        super(str, true);
        this.f441e = 0;
        this.f442f = qVar;
    }
}
