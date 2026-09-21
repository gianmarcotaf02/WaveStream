package B;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f497i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f498k;

    public /* synthetic */ T(int i3, int i9, int i10, java.lang.Object obj) {
        this.f496h = i10;
        this.f498k = obj;
        this.f497i = i3;
        this.j = i9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f496h) {
            case 0:
                ((O0.f0) obj).g((O0.g0) this.f498k, this.f497i, this.j, 0.0f);
                break;
            default:
                p011b1.q qVar = (p011b1.q) obj;
                p011b1.C1644a c1644a = qVar.f17837a;
                int iD = qVar.d(this.f497i);
                int iD2 = qVar.d(this.j);
                java.lang.CharSequence charSequence = c1644a.f17795e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    java.lang.StringBuilder sbS = p121o0.p.s(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbS.append(charSequence.length());
                    sbS.append("], or start > end!");
                    p065h1.a.a(sbS.toString());
                }
                android.graphics.Path path = new android.graphics.Path();
                p021c1.i iVar = c1644a.f17794d;
                iVar.f18473f.getSelectionPath(iD, iD2, path);
                int i3 = iVar.f18474h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(qVar.f17842f)) & 4294967295L);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setTranslate(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                ((p188x0.C3088h) this.f498k).f31111a.addPath(path, java.lang.Float.intBitsToFloat((int) 0), java.lang.Float.intBitsToFloat((int) 0));
                break;
        }
        return p070h6.A.f22523a;
    }
}
