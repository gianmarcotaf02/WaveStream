package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p146r1.G f26785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f26788f;

    public /* synthetic */ x(int i3) {
        this(true, (i3 & 2) != 0, (i3 & 4) != 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p146r1.x)) {
            return false;
        }
        p146r1.x xVar = (p146r1.x) obj;
        return this.f26783a == xVar.f26783a && this.f26784b == xVar.f26784b && this.f26785c == xVar.f26785c && this.f26786d == xVar.f26786d && this.f26787e == xVar.f26787e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f26787e) + p121o0.p.f((this.f26785c.hashCode() + p121o0.p.f(java.lang.Boolean.hashCode(this.f26783a) * 31, 31, this.f26784b)) * 31, 31, this.f26786d);
    }

    public x(boolean z6, boolean z9, boolean z10) {
        p146r1.G g = p146r1.G.f26720h;
        this.f26783a = z6;
        this.f26784b = z9;
        this.f26785c = g;
        this.f26786d = z10;
        this.f26787e = true;
        this.f26788f = "";
    }
}
