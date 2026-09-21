package p028c8;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends X7.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f18536l;

    public l(long j, p028c8.l lVar, int i3) {
        super(j, lVar, i3);
        this.f18536l = new java.util.concurrent.atomic.AtomicReferenceArray(p028c8.k.f18535f);
    }

    @Override // X7.q
    public final int g() {
        return p028c8.k.f18535f;
    }

    @Override // X7.q
    public final void h(int i3, p100l6.h hVar) {
        this.f18536l.set(i3, p028c8.k.f18534e);
        i();
    }

    public final java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.j + ", hashCode=" + hashCode() + ']';
    }
}
