package p076i4;

import Z.AbstractC1149h0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p068h4.l;

public final class C2217r0 extends j1 {

    public int f22931h;

    public Object f22932i;
    public final int j;

    public final Iterator f22933k;

    public final Object f22934l;

    public C2217r0() {
        this.f22931h = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        AbstractC1864o0.Y(this.f22931h != 4);
        int iC = AbstractC1149h0.c(this.f22931h);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f22931h = 4;
            switch (this.j) {
                case 0:
                    do {
                        Iterator it = this.f22933k;
                        if (!it.hasNext()) {
                            this.f22931h = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((l) this.f22934l).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f22933k;
                        if (!it2.hasNext()) {
                            this.f22931h = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((b1) this.f22934l).f22870i.contains(next));
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

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22931h = 2;
        Object obj = this.f22932i;
        this.f22932i = null;
        return obj;
    }

    public C2217r0(Iterator it, l lVar) {
        this();
        this.j = 0;
        this.f22933k = it;
        this.f22934l = lVar;
    }

    public C2217r0(b1 b1Var) {
        this();
        this.j = 1;
        this.f22934l = b1Var;
        this.f22933k = b1Var.f22869h.iterator();
    }
}
