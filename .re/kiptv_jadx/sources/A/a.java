package A;

/* JADX INFO: loaded from: classes.dex */
public class a implements F3.l, D1.InterfaceC0217d, N6.InterfaceC0705t, N2.g, p096l0.d, S8.a, p046f.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f9i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f8h = i3;
        this.f9i = obj;
    }

    public E1.f B(int i3) {
        return null;
    }

    public long C() {
        int i3 = p188x0.C3098s.f31128h;
        long j = ((android.os.Parcel) this.f9i).readLong();
        long j9 = 63 & j;
        return j9 < 16 ? j : (j & (-64)) | (j9 + 1);
    }

    public long D() {
        long j;
        android.os.Parcel parcel = (android.os.Parcel) this.f9i;
        byte b9 = parcel.readByte();
        if (b9 == 1) {
            j = 4294967296L;
        } else {
            j = b9 == 2 ? 8589934592L : 0L;
        }
        return p113n1.q.a(j, 0L) ? p113n1.p.f25570c : com.google.common.util.concurrent.D.C(j, parcel.readFloat());
    }

    public E1.f E(int i3) {
        return null;
    }

    public void F() {
        android.view.View view = (android.view.View) this.f9i;
        if (view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void G() {
        ((Y1.q) this.f9i).f11339u.M();
    }

    public boolean H(int i3, int i9, android.os.Bundle bundle) {
        return false;
    }

    public K0.C0661i I(S.p pVar, androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        long jG;
        boolean z6;
        long j;
        java.util.ArrayList arrayList = (java.util.ArrayList) pVar.f9153i;
        p136q.r rVar = new p136q.r(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            K0.z zVar = (K0.z) arrayList.get(i3);
            long j9 = zVar.f6754a;
            p136q.r rVar2 = (p136q.r) this.f9i;
            K0.y yVar = (K0.y) rVar2.b(j9);
            if (yVar == null) {
                long j10 = zVar.f6755b;
                jG = zVar.f6757d;
                j = j10;
                z6 = false;
            } else {
                jG = androidComposeView.G(yVar.f6752b);
                long j11 = yVar.f6751a;
                z6 = yVar.f6753c;
                j = j11;
            }
            long j12 = jG;
            java.util.ArrayList arrayList2 = zVar.f6761i;
            long j13 = zVar.j;
            long j14 = zVar.f6762k;
            int i9 = i3;
            long j15 = zVar.f6754a;
            java.util.ArrayList arrayList3 = arrayList;
            int i10 = size;
            rVar.d(j15, new K0.x(j15, zVar.f6755b, zVar.f6757d, zVar.f6758e, zVar.f6759f, j, j12, z6, zVar.g, arrayList2, j13, j14));
            long j16 = zVar.f6754a;
            boolean z9 = zVar.f6758e;
            if (z9) {
                rVar2.d(j16, new K0.y(zVar.f6755b, zVar.f6756c, z9));
            } else {
                rVar2.e(j16);
            }
            i3 = i9 + 1;
            arrayList = arrayList3;
            size = i10;
        }
        return new K0.C0661i(rVar, pVar);
    }

    public void J(java.lang.String str, java.lang.String str2) {
        p136q.C2661e c2661e = android.support.v4.media.MediaMetadataCompat.j;
        if (c2661e.containsKey(str) && ((java.lang.Integer) c2661e.get(str)).intValue() != 1) {
            throw new java.lang.IllegalArgumentException(Y6.f.h("The ", str, " key cannot be used to put a String"));
        }
        ((android.os.Bundle) this.f9i).putCharSequence(str, str2);
    }

    @Override // F3.l
    public void K(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f8h) {
            case 2:
                B3.w wVar = new B3.w(0, (p059g4.d) obj2);
                B3.k kVar = (B3.k) ((B3.y) obj).p();
                android.os.Parcel parcelY = kVar.Y();
                com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, wVar);
                parcelY.writeStringArray((java.lang.String[]) this.f9i);
                kVar.b0(parcelY, 5);
                break;
            case 22:
                X3.b bVar = new X3.b(1, (p059g4.d) obj2);
                X3.m mVar = (X3.m) ((X3.d) obj).p();
                p148r3.e eVar = (p148r3.e) this.f9i;
                android.os.Parcel parcelM = mVar.m();
                int i3 = X3.h.f10852a;
                parcelM.writeStrongBinder(bVar);
                X3.h.c(parcelM, eVar);
                mVar.J(parcelM, 1);
                break;
            default:
                Y3.f fVar = new Y3.f(0, (p059g4.d) obj2);
                Y3.e eVar2 = (Y3.e) ((Y3.d) obj).p();
                android.os.Parcel parcelM2 = eVar2.m();
                int i9 = Y3.c.f11525a;
                parcelM2.writeStrongBinder(fVar);
                Y3.c.b(parcelM2, (p173u3.f) this.f9i);
                eVar2.J(parcelM2, 10);
                break;
        }
    }

    public java.util.ArrayList L(int i3) {
        boolean z6 = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        E.w wVar = (E.w) this.f9i;
        p121o0.f fVarE = p121o0.o.e();
        java.util.ArrayList arrayList2 = null;
        p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
        p121o0.f fVarH = p121o0.o.h(fVarE);
        try {
            E.p pVar = wVar.f2715b ? wVar.f2716c : (E.p) wVar.f2718e.getValue();
            if (pVar != null) {
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                yVar.f24555h = 1;
                java.util.List list = (java.util.List) pVar.f2673k.invoke(java.lang.Integer.valueOf(i3));
                int size = list.size();
                int i9 = 0;
                while (i9 < size) {
                    p070h6.k kVar = (p070h6.k) list.get(i9);
                    F.N n3 = wVar.f2726o;
                    int iIntValue = ((java.lang.Number) kVar.f22539h).intValue();
                    boolean z9 = z6;
                    long j = ((p113n1.a) kVar.f22540i).f25547a;
                    p079i7.f fVar = E.w.f2713w;
                    arrayList = arrayList;
                    arrayList.add(n3.a(iIntValue, j, false, new C5.C0166z(arrayList2, yVar, list, i3, pVar)));
                    i9++;
                    z6 = z9;
                }
            }
            return arrayList;
        } finally {
            p121o0.o.k(fVarE, fVarH, jVarE);
        }
    }

    public void M() {
        android.view.View viewFindViewById;
        android.view.View view = (android.view.View) this.f9i;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(android.R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new D1.RunnableC0239y(0, viewFindViewById));
    }

    @Override // N2.g
    public N2.b a(N2.a aVar) {
        return null;
    }

    @Override // N6.InterfaceC0705t
    /* JADX INFO: renamed from: build, reason: collision with other method in class */
    public N6.InterfaceC0706u mo0build() {
        return (E7.c) this.f9i;
    }

    @Override // N2.g
    public long c() {
        return 0L;
    }

    @Override // N2.g, S8.a
    public void clear() {
        switch (this.f8h) {
            case 15:
                break;
            default:
                R8.a aVar = (R8.a) this.f9i;
                java.util.Map map = (java.util.Map) aVar.get();
                if (map != null) {
                    map.clear();
                    aVar.remove();
                }
                break;
        }
    }

    @Override // p046f.b
    public void d(java.lang.Object obj) {
        p046f.a aVar = (p046f.a) obj;
        Y1.D d4 = (Y1.D) this.f9i;
        Y1.A a2 = (Y1.A) d4.f11156C.pollFirst();
        if (a2 == null) {
            android.util.Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        A7.m mVar = d4.f11168c;
        java.lang.String str = a2.f11150h;
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029nX = mVar.x(str);
        if (abstractComponentCallbacksC1029nX == null) {
            B2.a.v("Activity result delivered for unknown Fragment ", str, "FragmentManager");
        } else {
            abstractComponentCallbacksC1029nX.t(a2.f11151i, aVar.f21606h, aVar.f21607i);
        }
    }

    @Override // N2.g
    public boolean e(N2.a aVar) {
        return false;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t f(int i3) {
        com.google.android.gms.internal.play_billing.M0.s(i3, "kind");
        return this;
    }

    @Override // D1.InterfaceC0217d
    public void i(android.net.Uri uri) {
        ((android.view.ContentInfo.Builder) this.f9i).setLinkUri(uri);
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t j(p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t l(O6.h additionalAnnotations) {
        kotlin.jvm.internal.m.e(additionalAnnotations, "additionalAnnotations");
        return this;
    }

    @Override // N2.g
    public void o(N2.a aVar, E2.l lVar, java.util.Map map, long j) {
        ((Y2.L) this.f9i).k(aVar, lVar, map, j);
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t p(N6.C0701o visibility) {
        kotlin.jvm.internal.m.e(visibility, "visibility");
        return this;
    }

    @Override // S8.a
    public void r(java.util.Map map) {
        ((R8.a) this.f9i).set(map != null ? new java.util.HashMap(map) : null);
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t s(C7.AbstractC0191x type) {
        kotlin.jvm.internal.m.e(type, "type");
        return this;
    }

    @Override // D1.InterfaceC0217d
    public void setExtras(android.os.Bundle bundle) {
        ((android.view.ContentInfo.Builder) this.f9i).setExtras(bundle);
    }

    @Override // D1.InterfaceC0217d
    public void setFlags(int i3) {
        ((android.view.ContentInfo.Builder) this.f9i).setFlags(i3);
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t t(N6.InterfaceC0691e owner) {
        kotlin.jvm.internal.m.e(owner, "owner");
        return this;
    }

    @Override // S8.a
    public java.util.Map w() {
        java.util.Map map = (java.util.Map) ((R8.a) this.f9i).get();
        if (map != null) {
            return new java.util.HashMap(map);
        }
        return null;
    }

    public /* synthetic */ a(int i3, boolean z6) {
        this.f8h = i3;
    }

    @Override // D1.InterfaceC0217d
    public D1.C0222g build() {
        return new D1.C0222g(new p166t3.i(((android.view.ContentInfo.Builder) this.f9i).build()));
    }

    public /* synthetic */ a(E3.f fVar, java.lang.Object obj, int i3) {
        this.f8h = i3;
        this.f9i = obj;
    }

    public a(F3.C0371k c0371k, F3.C0368h c0368h) {
        this.f8h = 10;
        this.f9i = c0371k;
    }

    public a(int i3) {
        this.f8h = i3;
        switch (i3) {
            case 7:
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    this.f9i = new E1.h(this);
                } else {
                    this.f9i = new E1.g(this);
                }
                break;
            case 13:
                this.f9i = new p136q.r((java.lang.Object) null);
                break;
            case 14:
                this.f9i = new java.util.HashSet();
                break;
            case 16:
                this.f9i = new java.util.concurrent.atomic.AtomicInteger(0);
                break;
            case 17:
                p096l0.c cVar = new p096l0.c();
                this.f9i = cVar;
                if (!cVar.f24710i) {
                    if (cVar.j) {
                        m0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.j = true;
                    break;
                }
                break;
            case 18:
                new java.lang.ThreadLocal();
                this.f9i = new R8.a();
                break;
            case 21:
                this.f9i = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                break;
            case 24:
                this.f9i = new android.graphics.Region();
                break;
            case 29:
                this.f9i = new android.os.Bundle();
                break;
            default:
                this.f9i = new java.util.LinkedHashSet();
                break;
        }
    }

    private final void A() {
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t g() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t m() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t n() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t q() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t u() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t v() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t y() {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t b(java.util.List list) {
        return this;
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t h(Q6.u uVar) {
        return this;
    }

    @Override // N2.g
    public void k(long j) {
    }

    @Override // N6.InterfaceC0705t
    public N6.InterfaceC0705t x(N6.EnumC0711z enumC0711z) {
        return this;
    }

    public a(android.widget.EditText editText) {
        this.f8h = 20;
        this.f9i = new S2.a(editText);
    }

    public a(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
        this.f8h = 9;
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            this.f9i = new F1.h(uri, clipDescription, uri2);
        } else {
            this.f9i = new android.support.v4.media.session.q(uri, clipDescription, uri2, 6);
        }
    }

    public a(java.lang.String str) {
        this.f8h = 0;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        this.f9i = parcelObtain;
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public a(android.content.ClipData clipData, int i3) {
        this.f8h = 4;
        this.f9i = D1.AbstractC0215c.h(clipData, i3);
    }

    public a(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        this.f8h = 29;
        android.os.Bundle bundle = new android.os.Bundle(mediaMetadataCompat.f15558h);
        this.f9i = bundle;
        android.support.v4.media.session.q.p(bundle);
    }

    public void z(int i3, E1.f fVar, java.lang.String str, android.os.Bundle bundle) {
    }
}
