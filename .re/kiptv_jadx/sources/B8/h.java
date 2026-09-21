package B8;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p059g4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f861i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f862k;

    public /* synthetic */ h(char c9, int i3) {
        this.f860h = i3;
    }

    public void a(int i3, F.InterfaceC0353s interfaceC0353s) {
        if (i3 < 0) {
            A.b.a("size should be >=0");
        }
        if (i3 == 0) {
            return;
        }
        F.C0344i c0344i = new F.C0344i(this.f861i, i3, interfaceC0353s);
        this.f861i += i3;
        ((p038e0.e) this.j).c(c0344i);
    }

    public void b() {
        p103m.P0 p2;
        android.widget.ImageView imageView = (android.widget.ImageView) this.j;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            p103m.AbstractC2569i0.a(drawable);
        }
        if (drawable == null || (p2 = (p103m.P0) this.f862k) == null) {
            return;
        }
        p103m.r.d(drawable, p2, imageView.getDrawableState());
    }

    public F.C0344i c(int i3) {
        if (i3 < 0 || i3 >= this.f861i) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index ", ", size ");
            sbT.append(this.f861i);
            A.b.e(sbT.toString());
        }
        F.C0344i c0344i = (F.C0344i) this.f862k;
        if (c0344i != null) {
            int i9 = c0344i.f3461a;
            if (i3 < c0344i.f3462b + i9 && i9 <= i3) {
                return c0344i;
            }
        }
        p038e0.e eVar = (p038e0.e) this.j;
        F.C0344i c0344i2 = (F.C0344i) eVar.f21324h[F.AbstractC0349n.e(i3, eVar)];
        this.f862k = c0344i2;
        return c0344i2;
    }

    public int d(java.lang.Object obj) {
        p136q.C c9 = (p136q.C) this.j;
        int iD = c9.d(obj);
        if (iD >= 0) {
            return c9.f26299c[iD];
        }
        return -1;
    }

    public java.lang.String e() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        int i3 = this.f861i + 1;
        for (int i9 = 0; i9 < i3; i9++) {
            java.lang.Object obj = ((java.lang.Object[]) this.j)[i9];
            if (obj instanceof kotlinx.serialization.descriptors.SerialDescriptor) {
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
                if (!kotlin.jvm.internal.m.a(serialDescriptor.c(), p135p8.j.g)) {
                    int i10 = ((int[]) this.f862k)[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i10));
                    }
                } else if (((int[]) this.f862k)[i9] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f862k)[i9]);
                    sb.append("]");
                }
            } else if (obj != t8.y.f28646a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void f(int i3, int i9, int i10, int i11, int i12, int i13, boolean z6, boolean z9, boolean z10, int i14) {
        long[] jArr = (long[]) this.j;
        int i15 = this.f861i;
        int i16 = i15 + 3;
        this.f861i = i16;
        int length = jArr.length;
        if (length <= i16) {
            int iMax = java.lang.Math.max(length * 2, i16);
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.j = jArrCopyOf;
            long[] jArrCopyOf2 = java.util.Arrays.copyOf((long[]) this.f862k, iMax);
            kotlin.jvm.internal.m.d(jArrCopyOf2, "copyOf(...)");
            this.f862k = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.j;
        jArr2[i15] = (((long) i9) << 32) | (((long) i10) & 4294967295L);
        jArr2[i15 + 1] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        int i17 = i13 & 33554431;
        jArr2[i15 + 2] = ((z10 ? 1L : 0L) << 63) | ((z9 ? 1L : 0L) << 62) | ((z6 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) java.lang.Math.min(0, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED)) << 50) | (((long) i17) << 25) | ((long) (i3 & 33554431));
        if (i13 < 0) {
            return;
        }
        for (int i18 = i14 != -1 ? i14 : i15 - 3; i18 >= 0; i18 -= 3) {
            int i19 = i18 + 2;
            long j = jArr2[i19];
            if ((((int) j) & 33554431) == i17) {
                jArr2[i19] = (j & Z0.a.f12600a) | (((long) java.lang.Math.min((i15 - i18) / 3, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED)) << 50);
                return;
            }
        }
    }

    public void h(android.util.AttributeSet attributeSet, int i3) {
        int resourceId;
        android.widget.ImageView imageView = (android.widget.ImageView) this.j;
        android.content.Context context = imageView.getContext();
        int[] iArr = h.a.f22410f;
        j1.l lVarS = j1.l.s(context, attributeSet, iArr, i3);
        D1.U.i(imageView, imageView.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lVarS.j, i3);
        try {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            android.content.res.TypedArray typedArray = (android.content.res.TypedArray) lVarS.j;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.google.common.util.concurrent.AbstractC1903s.y(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                p103m.AbstractC2569i0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(lVarS.k(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(p103m.AbstractC2569i0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            lVarS.u();
        }
    }

    public void i(int i3, boolean z6) {
        int i9 = i3 & 33554431;
        long[] jArr = (long[]) this.j;
        int i10 = this.f861i;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            long j = jArr[i12];
            if ((((int) j) & 33554431) == i9) {
                long j9 = z6 ? 1L : 0L;
                jArr[i12] = (j9 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j9);
                return;
            }
        }
    }

    public void j(int i3, int i9, long j) {
        int i10;
        char c9;
        char c10;
        long[] jArr = (long[]) this.j;
        long[] jArr2 = (long[]) this.f862k;
        jArr2[0] = j;
        int i11 = 1;
        while (i11 > 0) {
            i11--;
            long j9 = jArr2[i11];
            int i12 = 33554431;
            int i13 = ((int) j9) & 33554431;
            char c11 = 25;
            int i14 = ((int) (j9 >> 25)) & 33554431;
            char c12 = '2';
            int i15 = ((int) (j9 >> 50)) & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED;
            int i16 = i15 == 1023 ? this.f861i : (i15 * 3) + i14;
            if (i14 < 0) {
                return;
            }
            while (i14 < jArr.length - 2 && i14 < i16) {
                int i17 = i14 + 2;
                long j10 = jArr[i17];
                if ((((int) (j10 >> c11)) & i12) == i13) {
                    long j11 = jArr[i14];
                    int i18 = i14 + 1;
                    i10 = i12;
                    c9 = c11;
                    long j12 = jArr[i18];
                    c10 = c12;
                    jArr[i14] = (((long) (((int) j11) + i9)) & 4294967295L) | (((long) (((int) (j11 >> 32)) + i3)) << 32);
                    jArr[i18] = (((long) (((int) j12) + i9)) & 4294967295L) | (((long) (((int) (j12 >> 32)) + i3)) << 32);
                    jArr[i17] = (((j10 >> 63) & 1) << 60) | j10;
                    if ((((int) (j10 >> c10)) & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED) > 0) {
                        jArr2[i11] = (Z0.a.f12601b & j10) | (((long) ((i14 + 3) & i10)) << c9);
                        i11++;
                    }
                } else {
                    i10 = i12;
                    c9 = c11;
                    c10 = c12;
                }
                i14 += 3;
                i12 = i10;
                c11 = c9;
                c12 = c10;
            }
        }
    }

    public void k(int i3, p194x6.o oVar) {
        int i9 = i3 & 33554431;
        long[] jArr = (long[]) this.j;
        int i10 = this.f861i;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & 33554431) == i9) {
                long j = jArr[i11];
                long j9 = jArr[i11 + 1];
                oVar.invoke(java.lang.Integer.valueOf((int) (j >> 32)), java.lang.Integer.valueOf((int) j), java.lang.Integer.valueOf((int) (j9 >> 32)), java.lang.Integer.valueOf((int) j9));
                return;
            }
        }
    }

    public void l(F3.p pVar) {
        java.util.Map map = (java.util.Map) this.j;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        map.put("ConnectionlessLifecycleHelper", pVar);
        if (this.f861i > 0) {
            new Z3.d(android.os.Looper.getMainLooper(), 1).post(new com.google.common.util.concurrent.C(this, pVar));
        }
    }

    public void m(android.os.Bundle bundle) {
        this.f861i = 1;
        this.f862k = bundle;
        for (java.util.Map.Entry entry : ((java.util.Map) this.j).entrySet()) {
            ((F3.p) entry.getValue()).b(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x000c A[SYNTHETIC] */
    public void n(int i3, int i9, android.content.Intent intent) {
        for (F3.p pVar : ((java.util.Map) this.j).values()) {
            F3.I i10 = (F3.I) pVar.j.get();
            F3.C0366f c0366f = pVar.f3617n;
            java.util.concurrent.atomic.AtomicReference atomicReference = pVar.j;
            if (i3 != 1) {
                if (i3 == 2) {
                    int iB = pVar.f3615l.b(pVar.a(), D3.f.f2107a);
                    if (iB == 0) {
                        atomicReference.set(null);
                        Z3.d dVar = c0366f.f3596u;
                        dVar.sendMessage(dVar.obtainMessage(3));
                    } else if (i10 == null || (i10.f3568b.f2097i == 18 && iB == 18)) {
                    }
                }
                if (i10 != null) {
                    atomicReference.set(null);
                    c0366f.h(i10.f3568b, i10.f3567a);
                }
            } else if (i9 == -1) {
                atomicReference.set(null);
                Z3.d dVar2 = c0366f.f3596u;
                dVar2.sendMessage(dVar2.obtainMessage(3));
            } else if (i9 == 0) {
                if (i10 != null) {
                    D3.b bVar = new D3.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i10.f3568b.toString());
                    atomicReference.set(null);
                    c0366f.h(bVar, i10.f3567a);
                }
            } else if (i10 != null) {
                atomicReference.set(null);
                c0366f.h(i10.f3568b, i10.f3567a);
            }
        }
    }

    public void o(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.Map) this.j).entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            F3.I i3 = (F3.I) ((F3.p) entry.getValue()).j.get();
            if (i3 != null) {
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", i3.f3567a);
                D3.b bVar = i3.f3568b;
                bundle2.putInt("failed_status", bVar.f2097i);
                bundle2.putParcelable("failed_resolution", bVar.j);
            }
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        com.google.android.gms.internal.cast.W w6 = (com.google.android.gms.internal.cast.W) this.j;
        w6.getClass();
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.google.android.gms.internal.cast.K0 k0P = com.google.android.gms.internal.cast.L0.p((com.google.android.gms.internal.cast.L0) this.f862k);
            k0P.c();
            com.google.android.gms.internal.cast.L0 l2 = (com.google.android.gms.internal.cast.L0) k0P.f18766i;
            java.lang.String str = w6.f18835d;
            com.google.android.gms.internal.cast.L0.z(l2, str);
            k0P.c();
            com.google.android.gms.internal.cast.L0.t((com.google.android.gms.internal.cast.L0) k0P.f18766i, str);
            java.lang.Long l9 = w6.f18836e;
            if (l9 != null) {
                int iLongValue = (int) l9.longValue();
                k0P.c();
                com.google.android.gms.internal.cast.L0.w((com.google.android.gms.internal.cast.L0) k0P.f18766i, iLongValue);
            }
            com.google.android.gms.internal.cast.L0 l10 = (com.google.android.gms.internal.cast.L0) k0P.a();
            int i3 = w6.f18839i;
            int i9 = i3 - 1;
            p013b3.a aVar = null;
            if (i3 == 0) {
                throw null;
            }
            int i10 = this.f861i;
            if (i9 == 0) {
                aVar = new p013b3.a(java.lang.Integer.valueOf(i10 - 1), l10, p013b3.c.f17870i);
            } else if (i9 == 1) {
                aVar = new p013b3.a(java.lang.Integer.valueOf(i10 - 1), l10, p013b3.c.f17869h);
            }
            com.google.android.gms.internal.cast.W.j.b("analytics event: %s", aVar);
            H3.q.g(aVar);
            E2.d dVar = w6.g;
            if (dVar != null) {
                dVar.w(aVar);
            }
        }
    }

    public java.lang.String toString() {
        switch (this.f860h) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (((w8.t) this.j) == w8.t.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f861i);
                sb.append(' ');
                sb.append((java.lang.String) this.f862k);
                java.lang.String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 13:
                return e();
            default:
                return super.toString();
        }
    }

    public h(int i3) {
        this.f860h = 8;
        this.f861i = i3;
    }

    public /* synthetic */ h(com.google.android.gms.internal.cast.W w6, com.google.android.gms.internal.cast.L0 l2, int i3) {
        this.f860h = 9;
        this.j = w6;
        this.f862k = l2;
        this.f861i = i3;
    }

    public h(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String string;
        this.f860h = 5;
        if (strArr.length == 0) {
            string = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            for (java.lang.String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.j = string;
        this.f862k = str;
        int length = str.length();
        java.lang.Object[] objArr = {str, 23};
        if (length <= 23) {
            int i3 = 2;
            while (i3 <= 7 && !android.util.Log.isLoggable((java.lang.String) this.f862k, i3)) {
                i3++;
            }
            this.f861i = i3;
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public h(w8.t tVar, int i3, java.lang.String str) {
        this.f860h = 0;
        this.j = tVar;
        this.f861i = i3;
        this.f862k = str;
    }

    public h(java.util.ArrayList arrayList, int i3, android.view.MotionEvent motionEvent) {
        this.f860h = 4;
        this.j = arrayList;
        this.f861i = i3;
        this.f862k = motionEvent;
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalArgumentException("changes cannot be empty");
        }
    }

    public h(android.widget.ImageView imageView) {
        this.f860h = 11;
        this.f861i = 0;
        this.j = imageView;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    public h(D6.g gVar, F.AbstractC0349n abstractC0349n) {
        java.lang.Object c0342g;
        this.f860h = 2;
        B8.h hVarK = abstractC0349n.k();
        int i3 = gVar.f2458h;
        if (i3 < 0) {
            A.b.c("negative nearestRange.first");
        }
        int iMin = java.lang.Math.min(gVar.f2459i, hVarK.f861i - 1);
        if (iMin < i3) {
            p136q.C c9 = p136q.M.f26347a;
            kotlin.jvm.internal.m.c(c9, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.j = c9;
            this.f862k = new java.lang.Object[0];
            this.f861i = 0;
            return;
        }
        int i9 = (iMin - i3) + 1;
        this.f862k = new java.lang.Object[i9];
        this.f861i = i3;
        p136q.C c10 = new p136q.C(i9);
        if (i3 < 0 || i3 >= hVarK.f861i) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index ", ", size ");
            sbT.append(hVarK.f861i);
            A.b.e(sbT.toString());
        }
        if (iMin < 0 || iMin >= hVarK.f861i) {
            java.lang.StringBuilder sbT2 = p121o0.p.t(iMin, "Index ", ", size ");
            sbT2.append(hVarK.f861i);
            A.b.e(sbT2.toString());
        }
        if (iMin < i3) {
            A.b.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i3 + ')');
        }
        p038e0.e eVar = (p038e0.e) hVarK.j;
        int iE = F.AbstractC0349n.e(i3, eVar);
        int i10 = ((F.C0344i) eVar.f21324h[iE]).f3461a;
        while (i10 <= iMin) {
            F.C0344i c0344i = (F.C0344i) eVar.f21324h[iE];
            p194x6.j key = c0344i.f3463c.getKey();
            int i11 = c0344i.f3461a;
            int iMax = java.lang.Math.max(i3, i11);
            int iMin2 = java.lang.Math.min(iMin, (c0344i.f3462b + i11) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        c0342g = key.invoke(java.lang.Integer.valueOf(iMax - i11));
                        c0342g = c0342g == null ? new F.C0342g(iMax) : c0342g;
                    }
                    c10.g(iMax, c0342g);
                    ((java.lang.Object[]) this.f862k)[iMax - this.f861i] = c0342g;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i10 += c0344i.f3462b;
            iE++;
        }
        this.j = c10;
    }

    public h(int i3, byte b9) {
        this.f860h = i3;
        switch (i3) {
            case 3:
                this.j = java.util.Collections.synchronizedMap(new p136q.C2661e(0));
                this.f861i = 0;
                break;
            default:
                this.j = new p038e0.e(new F.C0344i[16]);
                break;
        }
    }

    public h(R0.V0 v6) {
        this.f860h = 6;
        this.j = v6;
    }
}
