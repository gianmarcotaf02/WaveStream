package T1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9697h;

    public /* synthetic */ m(int i3) {
        this.f9697h = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9697h) {
            case 0:
                try {
                    int i3 = p204z1.d.f32142a;
                    android.os.Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (T1.j.d()) {
                        T1.j.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i9 = p204z1.d.f32142a;
                    android.os.Trace.endSection();
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
