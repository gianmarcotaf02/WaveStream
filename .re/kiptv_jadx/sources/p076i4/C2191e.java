package p076i4;

/* JADX INFO: renamed from: i4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2191e implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22885h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Iterator f22886i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f22887k;

    public C2191e(p076i4.AbstractC2207m abstractC2207m) {
        this.f22887k = abstractC2207m;
        java.util.Collection collection = abstractC2207m.f22918i;
        this.j = collection;
        this.f22886i = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        p076i4.AbstractC2207m abstractC2207m = (p076i4.AbstractC2207m) this.f22887k;
        abstractC2207m.e();
        if (abstractC2207m.f22918i != ((java.util.Collection) this.j)) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22885h) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f22886i.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f22885h) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) this.f22886i.next();
                this.j = (java.util.Collection) entry.getValue();
                return ((p076i4.C2193f) this.f22887k).a(entry);
            case 1:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) this.f22886i.next();
                this.j = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f22886i.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22885h) {
            case 0:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(((java.util.Collection) this.j) != null, "no calls to next() since the last call to remove()");
                this.f22886i.remove();
                p076i4.C2193f c2193f = (p076i4.C2193f) this.f22887k;
                c2193f.f22893k.f22930m -= ((java.util.Collection) this.j).size();
                ((java.util.Collection) this.j).clear();
                this.j = null;
                break;
            case 1:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(((java.util.Map.Entry) this.j) != null, "no calls to next() since the last call to remove()");
                java.util.Collection collection = (java.util.Collection) ((java.util.Map.Entry) this.j).getValue();
                this.f22886i.remove();
                p076i4.C2195g c2195g = (p076i4.C2195g) this.f22887k;
                c2195g.f22898i.f22930m -= collection.size();
                collection.clear();
                this.j = null;
                break;
            default:
                this.f22886i.remove();
                p076i4.AbstractC2207m abstractC2207m = (p076i4.AbstractC2207m) this.f22887k;
                abstractC2207m.f22920l.f22930m--;
                abstractC2207m.f();
                break;
        }
    }

    public C2191e(p076i4.C2211o c2211o, java.util.ListIterator listIterator) {
        this.f22887k = c2211o;
        this.j = c2211o.f22918i;
        this.f22886i = listIterator;
    }

    public C2191e(p076i4.C2195g c2195g, java.util.Iterator it) {
        this.f22886i = it;
        this.f22887k = c2195g;
    }

    public C2191e(p076i4.C2193f c2193f) {
        this.f22887k = c2193f;
        this.f22886i = c2193f.j.entrySet().iterator();
    }
}
