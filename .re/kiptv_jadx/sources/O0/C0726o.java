package O0;

/* JADX INFO: renamed from: O0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O0.C0725n f7666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.C0725n f7667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0.C0725n f7668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0.C0725n f7669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.io.Serializable f7670f;

    public C0726o(java.lang.String str) {
        this.f7665a = 1;
        this.f7670f = str;
        this.f7666b = new O0.C0725n(1, null);
        this.f7667c = new O0.C0725n(0, null);
        this.f7668d = new O0.C0725n(1, null);
        this.f7669e = new O0.C0725n(0, null);
    }

    public final O0.C0725n a() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7669e;
    }

    public final O0.C0725n b() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7666b;
    }

    public final O0.C0725n c() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7668d;
    }

    public final O0.C0725n d() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7667c;
    }

    public final java.lang.String toString() {
        switch (this.f7665a) {
            case 0:
                return p078i6.m.v0((O0.C0726o[]) this.f7670f, null, "innermostOf(", ")", null, 57);
            default:
                java.lang.String str = (java.lang.String) this.f7670f;
                return str != null ? B2.a.i(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0726o(O0.C0726o[] c0726oArr) {
        this.f7665a = 0;
        this.f7670f = c0726oArr;
        int length = c0726oArr.length;
        O0.C0725n[] c0725nArr = new O0.C0725n[length];
        for (int i3 = 0; i3 < length; i3++) {
            c0725nArr[i3] = ((O0.C0726o[]) this.f7670f)[i3].b();
        }
        this.f7666b = new O0.C0725n(1, new O0.u0(c0725nArr, 0));
        int length2 = ((O0.C0726o[]) this.f7670f).length;
        O0.C0725n[] c0725nArr2 = new O0.C0725n[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            c0725nArr2[i9] = ((O0.C0726o[]) this.f7670f)[i9].d();
        }
        this.f7667c = new O0.C0725n(0, new O0.C0724m(c0725nArr2, 0));
        int length3 = ((O0.C0726o[]) this.f7670f).length;
        O0.C0725n[] c0725nArr3 = new O0.C0725n[length3];
        for (int i10 = 0; i10 < length3; i10++) {
            c0725nArr3[i10] = ((O0.C0726o[]) this.f7670f)[i10].c();
        }
        this.f7668d = new O0.C0725n(1, new O0.u0(c0725nArr3, 1));
        int length4 = ((O0.C0726o[]) this.f7670f).length;
        O0.C0725n[] c0725nArr4 = new O0.C0725n[length4];
        for (int i11 = 0; i11 < length4; i11++) {
            c0725nArr4[i11] = ((O0.C0726o[]) this.f7670f)[i11].a();
        }
        this.f7669e = new O0.C0725n(0, new O0.C0724m(c0725nArr4, 1));
    }
}
