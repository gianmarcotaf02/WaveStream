package q2;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p147r2.b, p163t.I0, F3.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26622h;

    public /* synthetic */ i(int i3) {
        this.f26622h = i3;
    }

    public static p188x0.D c(java.util.List list, float f9, float f10, int i3) {
        return new p188x0.D(list, null, (((long) java.lang.Float.floatToRawIntBits((i3 & 2) != 0 ? 0.0f : f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits((i3 & 4) != 0 ? Float.POSITIVE_INFINITY : f10)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static p188x0.D f(p070h6.k[] kVarArr) {
        return g((p070h6.k[]) java.util.Arrays.copyOf(kVarArr, kVarArr.length), (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static p188x0.D g(p070h6.k[] kVarArr, long j, long j9) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kVarArr.length);
        for (p070h6.k kVar : kVarArr) {
            arrayList.add(new p188x0.C3098s(((p188x0.C3098s) kVar.f22540i).f31129a));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kVarArr.length);
        for (p070h6.k kVar2 : kVarArr) {
            arrayList2.add(java.lang.Float.valueOf(((java.lang.Number) kVar2.f22539h).floatValue()));
        }
        return new p188x0.D(arrayList, arrayList2, j, j9);
    }

    public static p188x0.D j(int i3, java.util.List list) {
        return new p188x0.D(list, null, (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits((i3 & 4) != 0 ? Float.POSITIVE_INFINITY : 40.0f)) & 4294967295L));
    }

    public static p188x0.D k(p070h6.k[] kVarArr) {
        return g((p070h6.k[]) java.util.Arrays.copyOf(kVarArr, kVarArr.length), (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    @Override // p163t.I0
    public int A() {
        return 0;
    }

    @Override // p163t.I0
    public int G() {
        return 0;
    }

    @Override // F3.l
    public void K(java.lang.Object obj, java.lang.Object obj2) {
        B3.D d4 = (B3.D) obj;
        p059g4.d dVar = (p059g4.d) obj2;
        switch (this.f26622h) {
            case 11:
                B3.C0089b c0089b = p184w3.C.f29793G;
                ((B3.h) d4.p()).f0();
                dVar.b(null);
                break;
            default:
                B3.C0089b c0089b2 = p184w3.C.f29793G;
                B3.h hVar = (B3.h) d4.p();
                hVar.b0(hVar.Y(), 19);
                dVar.b(java.lang.Boolean.TRUE);
                break;
        }
    }

    @Override // p147r2.b
    public void d(int i3, java.io.Serializable serializable) {
        java.lang.String str;
        switch (this.f26622h) {
            case 2:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 == 6 || i3 == 7 || i3 == 8) {
                    android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) serializable);
                } else {
                    android.util.Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // p163t.G0
    public p163t.r e(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return j < ((long) 0) * 1000000 ? rVar : rVar2;
    }

    @Override // p147r2.b
    public void l() {
        switch (this.f26622h) {
            case 2:
                break;
            default:
                android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public i(B7.m mVar) {
        this.f26622h = 7;
        java.lang.String str = B7.m.f841d;
        new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2);
    }

    private final void h() {
    }

    private final void i(int i3, java.io.Serializable serializable) {
    }

    @Override // p163t.G0
    public p163t.r u(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return rVar3;
    }
}
