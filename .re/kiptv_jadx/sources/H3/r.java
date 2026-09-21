package H3;

/* JADX INFO: loaded from: classes.dex */
public final class r extends java.lang.Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D3.b f4003h;

    public r(D3.b bVar) {
        H3.q.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f2097i == 0 || bVar.j == null) ? false : true);
        this.f4003h = bVar;
    }
}
