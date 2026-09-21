package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends S7.AbstractC0906w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z7.l f13055i = new Z7.l();

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        Z7.e.j.f13046i.e(runnable, true, false);
    }

    @Override // S7.AbstractC0906w
    public final void W(p100l6.h hVar, java.lang.Runnable runnable) {
        Z7.e.j.f13046i.e(runnable, true, true);
    }

    @Override // S7.AbstractC0906w
    public final S7.AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return i3 >= Z7.k.f13052d ? this : super.Y(i3);
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }
}
