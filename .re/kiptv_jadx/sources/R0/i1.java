package R0;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U7.j f8926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(U7.j jVar, android.os.Handler handler) {
        super(handler);
        this.f8926a = jVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6, android.net.Uri uri) {
        this.f8926a.mo3trySendJP2dKIU(p070h6.A.f22523a);
    }
}
