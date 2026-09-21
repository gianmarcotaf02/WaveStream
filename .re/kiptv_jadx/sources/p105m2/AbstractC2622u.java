package p105m2;

/* JADX INFO: renamed from: m2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2622u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.content.Context f25363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p008a8.c f25364i;
    public final android.support.v4.media.session.i j = new android.support.v4.media.session.i(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p105m2.C2604b f25365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p105m2.C2618p f25366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p007a7.z f25368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25369o;

    public AbstractC2622u(android.content.Context context, p008a8.c cVar) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context must not be null");
        }
        this.f25363h = context;
        if (cVar != null) {
            this.f25364i = cVar;
        } else {
            this.f25364i = new p008a8.c(14, new android.content.ComponentName(context, getClass()));
        }
    }

    public p105m2.AbstractC2620s c(java.lang.String str) {
        if (str != null) {
            return null;
        }
        throw new java.lang.IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract p105m2.AbstractC2621t d(java.lang.String str);

    public p105m2.AbstractC2621t e(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new java.lang.IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(p105m2.C2618p c2618p);

    public final void g(p007a7.z zVar) {
        p105m2.C.b();
        if (this.f25368n != zVar) {
            this.f25368n = zVar;
            if (this.f25369o) {
                return;
            }
            this.f25369o = true;
            this.j.sendEmptyMessage(1);
        }
    }

    public final void h(p105m2.C2618p c2618p) {
        p105m2.C.b();
        if (java.util.Objects.equals(this.f25366l, c2618p)) {
            return;
        }
        this.f25366l = c2618p;
        if (this.f25367m) {
            return;
        }
        this.f25367m = true;
        this.j.sendEmptyMessage(2);
    }
}
