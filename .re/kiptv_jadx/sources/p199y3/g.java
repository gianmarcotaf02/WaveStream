package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p184w3.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final B3.C0089b f31861k = new B3.C0089b("RemoteMediaClient", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f31862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z3.d f31863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B3.p f31864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.l f31865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p199y3.c f31866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p184w3.C f31867f;
    public p059g4.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f31868h = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f31869i = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.ConcurrentHashMap j;

    static {
        java.lang.String str = B3.p.f641u;
    }

    public g(B3.p pVar) {
        new java.util.concurrent.ConcurrentHashMap();
        this.j = new java.util.concurrent.ConcurrentHashMap();
        this.f31862a = new java.lang.Object();
        this.f31863b = new Z3.d(android.os.Looper.getMainLooper(), 2);
        j1.l lVar = new j1.l(this);
        this.f31865d = lVar;
        this.f31864c = pVar;
        pVar.f644h = new p191x3.C(this);
        pVar.f668c = lVar;
        this.f31866e = new p199y3.c(this);
    }

    public static F3.m q() {
        F3.m mVar = new F3.m(null, 1);
        mVar.n0(new p199y3.k(new com.google.android.gms.common.api.Status(17, null, null, null), 0));
        return mVar;
    }

    public static final void u(p199y3.l lVar) {
        try {
            lVar.t0();
        } catch (java.lang.IllegalArgumentException e6) {
            throw e6;
        } catch (java.lang.Throwable unused) {
            lVar.n0(new p199y3.k(new com.google.android.gms.common.api.Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long jN;
        synchronized (this.f31862a) {
            H3.q.d();
            jN = this.f31864c.n();
        }
        return jN;
    }

    public final p184w3.o b() {
        H3.q.d();
        p184w3.q qVarD = d();
        if (qVarD == null) {
            return null;
        }
        java.lang.Integer num = (java.lang.Integer) qVarD.f29903E.get(qVarD.f29914s);
        if (num == null) {
            return null;
        }
        return (p184w3.o) qVarD.f29919x.get(num.intValue());
    }

    public final com.google.android.gms.cast.MediaInfo c() {
        com.google.android.gms.cast.MediaInfo mediaInfo;
        synchronized (this.f31862a) {
            H3.q.d();
            p184w3.q qVar = this.f31864c.f643f;
            mediaInfo = qVar == null ? null : qVar.f29904h;
        }
        return mediaInfo;
    }

    public final p184w3.q d() {
        p184w3.q qVar;
        synchronized (this.f31862a) {
            H3.q.d();
            qVar = this.f31864c.f643f;
        }
        return qVar;
    }

    public final int e() {
        int i3;
        synchronized (this.f31862a) {
            H3.q.d();
            p184w3.q qVarD = d();
            i3 = qVarD != null ? qVarD.f29907l : 1;
        }
        return i3;
    }

    public final long f() {
        long j;
        synchronized (this.f31862a) {
            H3.q.d();
            p184w3.q qVar = this.f31864c.f643f;
            com.google.android.gms.cast.MediaInfo mediaInfo = qVar == null ? null : qVar.f29904h;
            j = mediaInfo != null ? mediaInfo.f18642l : 0L;
        }
        return j;
    }

    public final boolean g() {
        H3.q.d();
        if (h()) {
            return true;
        }
        H3.q.d();
        p184w3.q qVarD = d();
        return (qVarD != null && qVarD.f29907l == 5) || l() || k() || j();
    }

    public final boolean h() {
        H3.q.d();
        p184w3.q qVarD = d();
        return qVarD != null && qVarD.f29907l == 4;
    }

    public final boolean i() {
        H3.q.d();
        com.google.android.gms.cast.MediaInfo mediaInfoC = c();
        return mediaInfoC != null && mediaInfoC.f18640i == 2;
    }

    public final boolean j() {
        H3.q.d();
        p184w3.q qVarD = d();
        return (qVarD == null || qVarD.f29914s == 0) ? false : true;
    }

    public final boolean k() {
        int i3;
        H3.q.d();
        p184w3.q qVarD = d();
        if (qVarD != null) {
            if (qVarD.f29907l == 3) {
                return true;
            }
            if (i()) {
                synchronized (this.f31862a) {
                    H3.q.d();
                    p184w3.q qVarD2 = d();
                    i3 = qVarD2 != null ? qVarD2.f29908m : 0;
                }
                if (i3 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l() {
        H3.q.d();
        p184w3.q qVarD = d();
        return qVarD != null && qVarD.f29907l == 2;
    }

    public final boolean m() {
        H3.q.d();
        p184w3.q qVarD = d();
        return qVarD != null && qVarD.y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    public final void n(java.lang.String str) {
        byte b9;
        int i3;
        int iA;
        boolean z6;
        boolean z9;
        p184w3.q qVar;
        int[] iArrM;
        byte b10;
        B3.p pVar = this.f31864c;
        B3.s sVar = pVar.f650o;
        B3.s sVar2 = pVar.f649n;
        B3.C0089b c0089b = pVar.f666a;
        c0089b.b("message received: %s", str);
        java.lang.String str2 = c0089b.f617a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            switch (string) {
                case "LOAD_CANCELLED":
                    b9 = 3;
                    break;
                case "QUEUE_ITEMS":
                    b9 = 8;
                    break;
                case "INVALID_REQUEST":
                    b9 = 4;
                    break;
                case "LOAD_FAILED":
                    b9 = 2;
                    break;
                case "ERROR":
                    b9 = 5;
                    break;
                case "QUEUE_CHANGE":
                    b9 = 7;
                    break;
                case "INVALID_PLAYER_STATE":
                    b9 = 1;
                    break;
                case "MEDIA_STATUS":
                    b9 = 0;
                    break;
                case "QUEUE_ITEM_IDS":
                    b9 = 6;
                    break;
                default:
                    b9 = -1;
                    break;
            }
            B3.s sVar3 = pVar.j;
            byte b11 = b9;
            java.util.List list = pVar.f669d;
            switch (b11) {
                case 0:
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean zC = sVar3.c(jOptLong);
                        if (!sVar2.d() || sVar2.c(jOptLong)) {
                            i3 = (!sVar.d() || sVar.c(jOptLong)) ? 0 : 1;
                        }
                        if (zC || (qVar = pVar.f643f) == null) {
                            p184w3.q qVar2 = new p184w3.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                            qVar2.a(jSONObject2, 0);
                            pVar.f643f = qVar2;
                            pVar.f642e = android.os.SystemClock.elapsedRealtime();
                            iA = 127;
                        } else {
                            iA = qVar.a(jSONObject2, i3);
                        }
                        if ((iA & 1) != 0) {
                            pVar.f642e = android.os.SystemClock.elapsedRealtime();
                            pVar.f645i = -1;
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if ((iA & 2) != 0) {
                            pVar.f642e = android.os.SystemClock.elapsedRealtime();
                            z9 = true;
                        } else {
                            z9 = z6;
                        }
                        if ((iA & 128) != 0) {
                            pVar.f642e = android.os.SystemClock.elapsedRealtime();
                        }
                        if ((iA & 4) != 0) {
                            pVar.i();
                        }
                        if ((iA & 8) != 0) {
                            pVar.k();
                        }
                        if ((iA & 16) != 0) {
                            pVar.j();
                        }
                        if ((iA & 32) != 0) {
                            pVar.f642e = android.os.SystemClock.elapsedRealtime();
                            p191x3.C c9 = pVar.f644h;
                            if (c9 != null) {
                                c9.d();
                            }
                        }
                        if ((iA & 64) != 0) {
                            pVar.f642e = android.os.SystemClock.elapsedRealtime();
                        } else if (z9) {
                        }
                        pVar.l();
                    } else {
                        pVar.f643f = null;
                        pVar.l();
                        pVar.i();
                        pVar.k();
                        pVar.j();
                    }
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((B3.s) it.next()).b(jOptLong, 0, null);
                    }
                    break;
                case 1:
                    android.util.Log.w(str2, c0089b.d("received unexpected error: Invalid Player State.", new java.lang.Object[0]));
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((B3.s) it2.next()).b(jOptLong, 2100, B3.p.f(jSONObject));
                    }
                    break;
                case 2:
                    sVar3.b(jOptLong, 2100, B3.p.f(jSONObject));
                    break;
                case 3:
                    sVar3.b(jOptLong, 2101, B3.p.f(jSONObject));
                    break;
                case 4:
                    android.util.Log.w(str2, c0089b.d("received unexpected error: Invalid Request.", new java.lang.Object[0]));
                    java.util.Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((B3.s) it3.next()).b(jOptLong, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, B3.p.f(jSONObject));
                    }
                    break;
                case 5:
                    java.util.Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((B3.s) it4.next()).b(jOptLong, 2100, B3.p.f(jSONObject));
                    }
                    if (pVar.f644h != null) {
                        com.google.android.gms.cast.MediaError.a(jSONObject);
                        java.util.Iterator it5 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                        while (it5.hasNext()) {
                            ((p191x3.B) it5.next()).getClass();
                        }
                    }
                    break;
                case 6:
                    pVar.f653r.b(jOptLong, 0, null);
                    pVar.h(jSONObject, "QUEUE_ITEM_IDS");
                    if (pVar.f644h != null && (iArrM = B3.p.m(jSONObject.getJSONArray("itemIds"))) != null) {
                        java.util.Iterator it6 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                        while (it6.hasNext()) {
                            ((p191x3.B) it6.next()).g(iArrM);
                        }
                        break;
                    }
                    break;
                case 7:
                    pVar.f655t.b(jOptLong, 0, null);
                    pVar.h(jSONObject, "QUEUE_CHANGE");
                    if (pVar.f644h != null) {
                        java.lang.String string2 = jSONObject.getString("changeType");
                        int[] iArrM2 = B3.p.m(jSONObject.getJSONArray("itemIds"));
                        int iOptInt = jSONObject.optInt("insertBefore", 0);
                        if (iArrM2 != null) {
                            switch (string2) {
                                case "INSERT":
                                    b10 = 0;
                                    break;
                                case "REMOVE":
                                    b10 = 2;
                                    break;
                                case "UPDATE":
                                    b10 = 3;
                                    break;
                                case "ITEMS_CHANGE":
                                    b10 = 1;
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0) {
                                java.util.Iterator it7 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                                while (it7.hasNext()) {
                                    ((p191x3.B) it7.next()).i(iArrM2, iOptInt);
                                }
                                break;
                            } else if (b10 == 1) {
                                java.util.Iterator it8 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                                while (it8.hasNext()) {
                                    ((p191x3.B) it8.next()).q(iArrM2);
                                }
                                break;
                            } else if (b10 == 2) {
                                java.util.Iterator it9 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                                while (it9.hasNext()) {
                                    ((p191x3.B) it9.next()).m(iArrM2);
                                }
                                break;
                            } else if (b10 == 3) {
                                int[] iArrM3 = B3.p.m(jSONObject.getJSONArray("itemIds"));
                                H3.q.h(iArrM3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                if (jSONArrayOptJSONArray != null) {
                                    java.util.ArrayList arrayListD = B3.AbstractC0088a.d(iArrM3);
                                    int iOptInt2 = jSONObject.optInt("insertBefore", 0);
                                    int[] iArrM4 = B3.p.m(jSONArrayOptJSONArray);
                                    H3.q.g(iArrM4);
                                    java.util.ArrayList arrayListD2 = B3.AbstractC0088a.d(iArrM4);
                                    java.util.Iterator it10 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                                    while (it10.hasNext()) {
                                        ((p191x3.B) it10.next()).o(arrayListD, arrayListD2, iOptInt2);
                                    }
                                } else {
                                    java.util.Iterator it11 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                                    while (it11.hasNext()) {
                                        ((p191x3.B) it11.next()).g(iArrM3);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 8:
                    pVar.f654s.b(jOptLong, 0, null);
                    pVar.h(jSONObject, "QUEUE_ITEMS");
                    if (pVar.f644h != null) {
                        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        p184w3.o[] oVarArr = new p184w3.o[jSONArray2.length()];
                        for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                            oVarArr[i9] = new p020c0.C1704s0(jSONArray2.getJSONObject(i9)).u();
                        }
                        java.util.Iterator it12 = ((p199y3.g) pVar.f644h.f31153h).f31869i.iterator();
                        while (it12.hasNext()) {
                            ((p191x3.B) it12.next()).k(oVarArr);
                        }
                    }
                    break;
            }
        } catch (org.json.JSONException e6) {
            android.util.Log.w(str2, c0089b.d("Message is malformed (%s); ignoring: %s", e6.getMessage(), str));
        }
    }

    public final void o() {
        H3.q.d();
        int iE = e();
        if (iE == 4 || iE == 2) {
            H3.q.d();
            if (t()) {
                u(new p199y3.h(this, 3));
                return;
            } else {
                q();
                return;
            }
        }
        H3.q.d();
        if (t()) {
            u(new p199y3.h(this, 4));
        } else {
            q();
        }
    }

    public final int p() {
        p184w3.o oVarB;
        if (c() != null && g()) {
            if (h()) {
                return 6;
            }
            if (l()) {
                return 3;
            }
            if (k()) {
                return 2;
            }
            if (j() && (oVarB = b()) != null && oVarB.f29890h != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void r() {
        p184w3.C c9 = this.f31867f;
        if (c9 == null) {
            return;
        }
        H3.q.d();
        java.lang.String str = this.f31864c.f667b;
        B3.AbstractC0088a.c(str);
        synchronized (c9.f29796C) {
            c9.f29796C.put(str, this);
        }
        F3.n nVarB = F3.n.b();
        nVarB.f3608d = new p184w3.z(c9, str, this);
        nVarB.f3607c = 8413;
        c9.c(1, nVarB.a());
        H3.q.d();
        if (t()) {
            u(new p199y3.h(this, 5));
        } else {
            q();
        }
    }

    public final void s(p184w3.C c9) {
        p184w3.f fVar;
        p184w3.C c10 = this.f31867f;
        if (c10 == c9) {
            return;
        }
        if (c10 != null) {
            B3.p pVar = this.f31864c;
            synchronized (pVar.f669d) {
                try {
                    java.util.Iterator it = pVar.f669d.iterator();
                    while (it.hasNext()) {
                        ((B3.s) it.next()).f(androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            pVar.g();
            this.f31866e.c();
            H3.q.d();
            java.lang.String str = this.f31864c.f667b;
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (c10.f29796C) {
                fVar = (p184w3.f) c10.f29796C.remove(str);
            }
            F3.n nVarB = F3.n.b();
            nVarB.f3608d = new j1.l(c10, fVar, str, 14);
            nVarB.f3607c = 8414;
            c10.c(1, nVarB.a());
            this.f31865d.f23899i = null;
            this.f31863b.removeCallbacksAndMessages(null);
        }
        this.f31867f = c9;
        if (c9 != null) {
            this.f31865d.f23899i = c9;
        }
    }

    public final boolean t() {
        return this.f31867f != null;
    }
}
