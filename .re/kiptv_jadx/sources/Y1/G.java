package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class G extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Y1.F f11197h = new Y1.F(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11201e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f11198b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f11199c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f11200d = new java.util.HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11202f = false;
    public boolean g = false;

    public G(boolean z6) {
        this.f11201e = z6;
    }

    @Override // androidx.lifecycle.e0
    public final void d() {
        if (Y1.D.G(3)) {
            android.util.Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f11202f = true;
    }

    public final void e(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (Y1.D.G(3)) {
            android.util.Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC1029n);
        }
        f(abstractComponentCallbacksC1029n.f11318l);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y1.G.class == obj.getClass()) {
            Y1.G g = (Y1.G) obj;
            if (this.f11198b.equals(g.f11198b) && this.f11199c.equals(g.f11199c) && this.f11200d.equals(g.f11200d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(java.lang.String str) {
        java.util.HashMap map = this.f11199c;
        Y1.G g = (Y1.G) map.get(str);
        if (g != null) {
            g.d();
            map.remove(str);
        }
        java.util.HashMap map2 = this.f11200d;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) map2.get(str);
        if (j0Var != null) {
            j0Var.a();
            map2.remove(str);
        }
    }

    public final void g(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (this.g) {
            if (Y1.D.G(2)) {
                android.util.Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f11198b.remove(abstractComponentCallbacksC1029n.f11318l) == null || !Y1.D.G(2)) {
                return;
            }
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC1029n);
        }
    }

    public final int hashCode() {
        return this.f11200d.hashCode() + ((this.f11199c.hashCode() + (this.f11198b.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator it = this.f11198b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator it2 = this.f11199c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((java.lang.String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator it3 = this.f11200d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((java.lang.String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
