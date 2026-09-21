package p076i4;

/* JADX INFO: renamed from: i4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2215q extends p076i4.AbstractC2222u implements java.io.Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient java.util.Map f22929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient int f22930m;

    public AbstractC2215q(java.util.Map map) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(map.isEmpty());
        this.f22929l = map;
    }

    @Override // p076i4.G0
    public final void clear() {
        java.util.Map map = this.f22929l;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        map.clear();
        this.f22930m = 0;
    }

    @Override // p076i4.AbstractC2222u
    public java.util.Map d() {
        return new p076i4.C2193f(this, this.f22929l);
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Collection e() {
        return this instanceof p076i4.Q ? new p076i4.C2220t(0, this) : new p076i4.C2218s(0, this);
    }

    @Override // p076i4.AbstractC2222u
    public java.util.Set f() {
        return new p076i4.C2195g(this, this.f22929l);
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Collection g() {
        return new p076i4.C2218s(1, this);
    }

    @Override // p076i4.G0
    public java.util.Collection get(java.lang.Object obj) {
        java.util.Collection collectionJ = (java.util.Collection) this.f22929l.get(obj);
        if (collectionJ == null) {
            collectionJ = j();
        }
        return k(obj, collectionJ);
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Iterator h() {
        return new p076i4.C2187c(this, 1);
    }

    public abstract java.util.Collection j();

    public abstract java.util.Collection k(java.lang.Object obj, java.util.Collection collection);

    @Override // p076i4.G0
    public boolean put(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = this.f22929l;
        java.util.Collection collection = (java.util.Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f22930m++;
            return true;
        }
        java.util.Collection collectionJ = j();
        if (!collectionJ.add(obj2)) {
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        this.f22930m++;
        map.put(obj, collectionJ);
        return true;
    }

    @Override // p076i4.G0
    public final int size() {
        return this.f22930m;
    }
}
