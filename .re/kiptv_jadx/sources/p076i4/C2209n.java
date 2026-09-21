package p076i4;

/* JADX INFO: renamed from: i4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2209n extends p076i4.C2191e implements java.util.ListIterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p076i4.C2211o f22923l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209n(p076i4.C2211o c2211o) {
        super(c2211o);
        this.f22923l = c2211o;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        p076i4.C2211o c2211o = this.f22923l;
        boolean zIsEmpty = c2211o.isEmpty();
        b().add(obj);
        c2211o.f22926m.f22930m++;
        if (zIsEmpty) {
            c2211o.d();
        }
    }

    public final java.util.ListIterator b() {
        a();
        return (java.util.ListIterator) this.f22886i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209n(p076i4.C2211o c2211o, int i3) {
        super(c2211o, ((java.util.List) c2211o.f22918i).listIterator(i3));
        this.f22923l = c2211o;
    }
}
