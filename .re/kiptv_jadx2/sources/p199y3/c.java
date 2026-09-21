package p199y3;

import B3.C0089b;
import H3.q;
import Z3.d;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p191x3.B;

public final class c {

    public long f31808b;

    public final g f31809c;

    public ArrayList f31810d;

    public final SparseIntArray f31811e;

    public final p f31812f;
    public final ArrayList g;

    public final ArrayDeque f31813h;

    public final d f31814i;
    public final o j;

    public BasePendingResult f31815k;

    public BasePendingResult f31816l;

    public final Set f31817m = Collections.synchronizedSet(new HashSet());

    public final C0089b f31807a = new C0089b("MediaQueue", null);

    public c(g gVar) {
        this.f31809c = gVar;
        Math.max(20, 1);
        this.f31810d = new ArrayList();
        this.f31811e = new SparseIntArray();
        this.g = new ArrayList();
        this.f31813h = new ArrayDeque(20);
        this.f31814i = new d(Looper.getMainLooper(), 2);
        this.j = new o(this);
        B b9 = new B(1, this);
        gVar.getClass();
        q.d();
        gVar.f31869i.add(b9);
        this.f31812f = new p(this);
        this.f31808b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f31817m) {
            try {
                Iterator it = cVar.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(c cVar) {
        cVar.f31811e.clear();
        for (int i3 = 0; i3 < cVar.f31810d.size(); i3++) {
            cVar.f31811e.put(((Integer) cVar.f31810d.get(i3)).intValue(), i3);
        }
    }

    public final void c() {
        h();
        this.f31810d.clear();
        this.f31811e.clear();
        this.f31812f.evictAll();
        this.g.clear();
        this.f31814i.removeCallbacks(this.j);
        this.f31813h.clear();
        BasePendingResult basePendingResult = this.f31816l;
        if (basePendingResult != null) {
            basePendingResult.j0();
            this.f31816l = null;
        }
        BasePendingResult basePendingResult2 = this.f31815k;
        if (basePendingResult2 != null) {
            basePendingResult2.j0();
            this.f31815k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResultQ;
        q.d();
        if (this.f31808b != 0 && (basePendingResult = this.f31816l) == null) {
            if (basePendingResult != null) {
                basePendingResult.j0();
                this.f31816l = null;
            }
            BasePendingResult basePendingResult2 = this.f31815k;
            if (basePendingResult2 != null) {
                basePendingResult2.j0();
                this.f31815k = null;
            }
            g gVar = this.f31809c;
            gVar.getClass();
            q.d();
            if (gVar.t()) {
                h hVar = new h(gVar);
                g.u(hVar);
                basePendingResultQ = hVar;
            } else {
                basePendingResultQ = g.q();
            }
            this.f31816l = basePendingResultQ;
            basePendingResultQ.o0(new n(this, 0));
        }
    }

    public final long e() {
        p184w3.q qVarD = this.f31809c.d();
        if (qVarD == null) {
            return 0L;
        }
        MediaInfo mediaInfo = qVarD.f29904h;
        int i3 = mediaInfo == null ? -1 : mediaInfo.f18640i;
        int i9 = qVarD.f29907l;
        int i10 = qVarD.f29908m;
        int i11 = qVarD.f29914s;
        if (i9 == 1) {
            if (i10 == 1) {
                if (i11 == 0) {
                    return 0L;
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return 0L;
                }
                if (i11 == 0) {
                    return 0L;
                }
            } else if (i3 != 2) {
                return 0L;
            }
        }
        return qVarD.f29905i;
    }

    public final void f() {
        synchronized (this.f31817m) {
            try {
                Iterator it = this.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f31817m) {
            try {
                Iterator it = this.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f31817m) {
            try {
                Iterator it = this.f31817m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
