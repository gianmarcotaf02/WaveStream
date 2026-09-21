package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1.E0 f2055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p182w1.b[] f2056b;

    public s0() {
        this(new D1.E0((D1.E0) null));
    }

    public final void a() {
        p182w1.b[] bVarArr = this.f2056b;
        if (bVarArr != null) {
            p182w1.b bVarG = bVarArr[0];
            p182w1.b bVarG2 = bVarArr[1];
            D1.E0 e6 = this.f2055a;
            if (bVarG2 == null) {
                bVarG2 = e6.f1967a.g(2);
            }
            if (bVarG == null) {
                bVarG = e6.f1967a.g(1);
            }
            g(p182w1.b.a(bVarG, bVarG2));
            p182w1.b bVar = this.f2056b[E8.l.B(16)];
            if (bVar != null) {
                f(bVar);
            }
            p182w1.b bVar2 = this.f2056b[E8.l.B(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            p182w1.b bVar3 = this.f2056b[E8.l.B(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract D1.E0 b();

    public void c(int i3, p182w1.b bVar) {
        if (this.f2056b == null) {
            this.f2056b = new p182w1.b[10];
        }
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i3 & i9) != 0) {
                this.f2056b[E8.l.B(i9)] = bVar;
            }
        }
    }

    public abstract void e(p182w1.b bVar);

    public abstract void g(p182w1.b bVar);

    public s0(D1.E0 e6) {
        this.f2055a = e6;
    }

    public void d(p182w1.b bVar) {
    }

    public void f(p182w1.b bVar) {
    }

    public void h(p182w1.b bVar) {
    }
}
