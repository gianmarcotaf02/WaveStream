package Z;

/* JADX INFO: renamed from: Z.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1164p extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z.C1164p f12471i = new Z.C1164p(1, 0);
    public static final Z.C1164p j = new Z.C1164p(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z.C1164p f12472k = new Z.C1164p(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12473h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1164p(int i3, int i9) {
        super(i3);
        this.f12473h = i9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p070h6.A a2 = p070h6.A.f22523a;
        switch (this.f12473h) {
            case 0:
                Y0.v.c((Y0.x) obj, 0);
                break;
            case 1:
                break;
            default:
                E6.u[] uVarArr = Y0.v.f11144a;
                Y0.w wVar = Y0.t.f11128l;
                E6.u uVar = Y0.v.f11144a[5];
                ((Y0.x) obj).d(wVar, java.lang.Boolean.TRUE);
                break;
        }
        return a2;
    }
}
