package p076i4;

/* JADX INFO: renamed from: i4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2187c implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Iterator f22871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22872i = null;
    public java.util.Collection j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.Iterator f22873k = p076i4.EnumC2223u0.f22942h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2215q f22874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f22875m;

    public C2187c(p076i4.AbstractC2215q abstractC2215q, int i3) {
        this.f22875m = i3;
        this.f22874l = abstractC2215q;
        this.f22871h = abstractC2215q.f22929l.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22871h.hasNext() || this.f22873k.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f22873k.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f22871h.next();
            this.f22872i = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.j = collection;
            this.f22873k = collection.iterator();
        }
        java.lang.Object obj = this.f22872i;
        java.lang.Object next = this.f22873k.next();
        switch (this.f22875m) {
            case 0:
                return next;
            default:
                return new p076i4.X(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22873k.remove();
        java.util.Collection collection = this.j;
        java.util.Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f22871h.remove();
        }
        this.f22874l.f22930m--;
    }
}
