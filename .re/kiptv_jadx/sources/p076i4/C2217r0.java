package p076i4;

/* JADX INFO: renamed from: i4.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2217r0 extends p076i4.j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22932i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.Iterator f22933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f22934l;

    public C2217r0() {
        this.f22931h = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.lang.Object next;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.f22931h != 4);
        int iC = Z.AbstractC1149h0.c(this.f22931h);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f22931h = 4;
            switch (this.j) {
                case 0:
                    do {
                        java.util.Iterator it = this.f22933k;
                        if (!it.hasNext()) {
                            this.f22931h = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((p068h4.l) this.f22934l).apply(next));
                    break;
                default:
                    do {
                        java.util.Iterator it2 = this.f22933k;
                        if (!it2.hasNext()) {
                            this.f22931h = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((p076i4.b1) this.f22934l).f22870i.contains(next));
                    break;
            }
            this.f22932i = next;
            if (this.f22931h != 3) {
                this.f22931h = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f22931h = 2;
        java.lang.Object obj = this.f22932i;
        this.f22932i = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2217r0(java.util.Iterator it, p068h4.l lVar) {
        this();
        this.j = 0;
        this.f22933k = it;
        this.f22934l = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2217r0(p076i4.b1 b1Var) {
        this();
        this.j = 1;
        this.f22934l = b1Var;
        this.f22933k = b1Var.f22869h.iterator();
    }
}
