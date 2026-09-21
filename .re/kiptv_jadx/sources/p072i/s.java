package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class s extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f22665b;

    public /* synthetic */ s(int i3, java.lang.Object obj) {
        this.f22664a = i3;
        this.f22665b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        switch (this.f22664a) {
            case 0:
                ((R0.AbstractC0815c) this.f22665b).n();
                break;
            default:
                ((p105m2.a0) this.f22665b).g();
                break;
        }
    }
}
