package p076i4;

/* JADX INFO: renamed from: i4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2211o extends p076i4.AbstractC2207m implements java.util.List {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2215q f22926m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2211o(p076i4.AbstractC2215q abstractC2215q, java.lang.Object obj, java.util.List list, p076i4.C2211o c2211o) {
        super(abstractC2215q, obj, list, c2211o);
        this.f22926m = abstractC2215q;
    }

    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        e();
        boolean zIsEmpty = this.f22918i.isEmpty();
        ((java.util.List) this.f22918i).add(i3, obj);
        this.f22926m.f22930m++;
        if (zIsEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((java.util.List) this.f22918i).addAll(i3, collection);
        if (zAddAll) {
            this.f22926m.f22930m += this.f22918i.size() - size;
            if (size == 0) {
                d();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        e();
        return ((java.util.List) this.f22918i).get(i3);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        e();
        return ((java.util.List) this.f22918i).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        e();
        return ((java.util.List) this.f22918i).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        e();
        return new p076i4.C2209n(this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        e();
        java.lang.Object objRemove = ((java.util.List) this.f22918i).remove(i3);
        this.f22926m.f22930m--;
        f();
        return objRemove;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        e();
        return ((java.util.List) this.f22918i).set(i3, obj);
    }

    @Override // java.util.List
    public final java.util.List subList(int i3, int i9) {
        e();
        java.util.List listSubList = ((java.util.List) this.f22918i).subList(i3, i9);
        p076i4.C2211o c2211o = this.j;
        if (c2211o == null) {
            c2211o = this;
        }
        p076i4.AbstractC2215q abstractC2215q = this.f22926m;
        abstractC2215q.getClass();
        boolean z6 = listSubList instanceof java.util.RandomAccess;
        java.lang.Object obj = this.f22917h;
        return z6 ? new p076i4.C2201j(abstractC2215q, obj, listSubList, c2211o) : new p076i4.C2211o(abstractC2215q, obj, listSubList, c2211o);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        e();
        return new p076i4.C2209n(this, i3);
    }
}
