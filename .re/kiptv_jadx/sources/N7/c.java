package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N7.m f7435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.j f7436c;

    public c(N7.m sequence, p194x6.j jVar, int i3) {
        this.f7434a = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.m.e(sequence, "sequence");
                this.f7435b = sequence;
                this.f7436c = jVar;
                break;
            default:
                this.f7435b = sequence;
                this.f7436c = jVar;
                break;
        }
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        switch (this.f7434a) {
            case 0:
                return new N7.b(this.f7435b.iterator(), this.f7436c);
            default:
                return new N7.h(this);
        }
    }
}
