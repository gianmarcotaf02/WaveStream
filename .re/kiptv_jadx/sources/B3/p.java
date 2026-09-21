package B3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends B3.t {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final java.lang.String f641u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p184w3.q f643f;
    public java.lang.Long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p191x3.C f644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f645i;
    public final B3.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B3.s f646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B3.s f647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B3.s f648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final B3.s f649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B3.s f650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B3.s f651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B3.s f652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B3.s f653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B3.s f654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B3.s f655t;

    static {
        java.util.regex.Pattern pattern = B3.AbstractC0088a.f615a;
        f641u = "urn:x-cast:com.google.cast.media";
    }

    public p() {
        super(f641u);
        this.f645i = -1;
        B3.s sVar = new B3.s(86400000L, "load");
        this.j = sVar;
        B3.s sVar2 = new B3.s(86400000L, "pause");
        this.f646k = sVar2;
        B3.s sVar3 = new B3.s(86400000L, "play");
        this.f647l = sVar3;
        B3.s sVar4 = new B3.s(86400000L, "stop");
        B3.s sVar5 = new B3.s(androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US, "seek");
        this.f648m = sVar5;
        B3.s sVar6 = new B3.s(86400000L, "volume");
        this.f649n = sVar6;
        B3.s sVar7 = new B3.s(86400000L, "mute");
        this.f650o = sVar7;
        B3.s sVar8 = new B3.s(86400000L, "status");
        this.f651p = sVar8;
        B3.s sVar9 = new B3.s(86400000L, "activeTracks");
        B3.s sVar10 = new B3.s(86400000L, "trackStyle");
        B3.s sVar11 = new B3.s(86400000L, "queueInsert");
        B3.s sVar12 = new B3.s(86400000L, "queueUpdate");
        this.f652q = sVar12;
        B3.s sVar13 = new B3.s(86400000L, "queueRemove");
        B3.s sVar14 = new B3.s(86400000L, "queueReorder");
        B3.s sVar15 = new B3.s(86400000L, "queueFetchItemIds");
        this.f653r = sVar15;
        B3.s sVar16 = new B3.s(86400000L, "queueFetchItemRange");
        this.f655t = sVar16;
        this.f654s = new B3.s(86400000L, "queueFetchItems");
        B3.s sVar17 = new B3.s(86400000L, "setPlaybackRate");
        B3.s sVar18 = new B3.s(86400000L, "skipAd");
        a(sVar);
        a(sVar2);
        a(sVar3);
        a(sVar4);
        a(sVar5);
        a(sVar6);
        a(sVar7);
        a(sVar8);
        a(sVar9);
        a(sVar10);
        a(sVar11);
        a(sVar12);
        a(sVar13);
        a(sVar14);
        a(sVar15);
        a(sVar16);
        a(sVar16);
        a(sVar17);
        a(sVar18);
        g();
    }

    public static B3.o f(org.json.JSONObject jSONObject) {
        com.google.android.gms.cast.MediaError.a(jSONObject);
        B3.o oVar = new B3.o(0);
        java.util.regex.Pattern pattern = B3.AbstractC0088a.f615a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return oVar;
    }

    public static int[] m(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            iArr[i3] = jSONArray.getInt(i3);
        }
        return iArr;
    }

    public final void d(B3.q qVar, int i3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        long jB = b();
        try {
            jSONObject.put("requestId", jB);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", o());
            if (i3 != 0) {
                jSONObject.put("jump", i3);
            }
            int i9 = this.f645i;
            if (i9 != -1) {
                jSONObject.put("sequenceNumber", i9);
            }
        } catch (org.json.JSONException unused) {
        }
        c(jB, jSONObject.toString());
        this.f652q.a(jB, new B3.m(this, qVar, 1));
    }

    public final long e(long j, double d4, long j9) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f642e;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j10 = j + ((long) (jElapsedRealtime * d4));
        if (j9 > 0 && j10 > j9) {
            return j9;
        }
        if (j10 >= 0) {
            return j10;
        }
        return 0L;
    }

    public final void g() {
        this.f642e = 0L;
        this.f643f = null;
        java.util.Iterator it = this.f669d.iterator();
        while (it.hasNext()) {
            ((B3.s) it.next()).f(androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
        }
    }

    public final void h(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f645i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            B3.C0089b c0089b = this.f666a;
            android.util.Log.w(c0089b.f617a, c0089b.d(str.concat(" message is missing a sequence number."), new java.lang.Object[0]));
        }
    }

    public final void i() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            gVar.getClass();
            java.util.Iterator it = gVar.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 2:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final void j() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            java.util.Iterator it = gVar.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 2:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final void k() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            java.util.Iterator it = gVar.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 2:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final void l() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            gVar.getClass();
            java.util.Iterator it = gVar.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new java.lang.ClassCastException();
                }
                if (!gVar.g() && gVar.g()) {
                    throw null;
                }
                throw null;
            }
            java.util.Iterator it2 = gVar.f31868h.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new java.lang.ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 0:
                        p191x3.C3102c c3102c = (p191x3.C3102c) b9.f31152b;
                        p199y3.g gVar2 = c3102c.j;
                        p184w3.q qVarD = gVar2 != null ? gVar2.d() : null;
                        com.google.android.gms.internal.cast.C1817y2 c1817y2 = c3102c.f31191l;
                        if (c1817y2 != null && qVarD != null) {
                            com.google.android.gms.internal.cast.m3 m3VarD = c1817y2.f19178h.D();
                            B3.z zVar = new B3.z(qVarD);
                            com.google.android.gms.internal.cast.Q1 q9 = new com.google.android.gms.internal.cast.Q1();
                            q9.f18809c = zVar.f677i;
                            q9.f18807a = java.lang.System.currentTimeMillis();
                            com.google.android.gms.internal.cast.Q1 q10 = m3VarD.f18995m;
                            if (q10 == null || q10.f18809c != 2) {
                                q9.f18808b = m3VarD.f18991h;
                                m3VarD.f18995m = q9;
                            }
                        }
                        break;
                    case 1:
                        p199y3.c cVar = (p199y3.c) b9.f31152b;
                        long jE = cVar.e();
                        if (jE != cVar.f31808b) {
                            cVar.f31808b = jE;
                            cVar.c();
                            if (cVar.f31808b != 0) {
                                cVar.d();
                            }
                        }
                        break;
                    default:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final long n() {
        p184w3.j jVar;
        p184w3.q qVar = this.f643f;
        com.google.android.gms.cast.MediaInfo mediaInfo = qVar == null ? null : qVar.f29904h;
        long jE = 0;
        if (mediaInfo != null && qVar != null) {
            java.lang.Long l2 = this.g;
            if (l2 != null) {
                if (l2.equals(4294967296000L)) {
                    p184w3.q qVar2 = this.f643f;
                    if (qVar2.f29900B != null) {
                        long jLongValue = l2.longValue();
                        p184w3.q qVar3 = this.f643f;
                        if (qVar3 != null && (jVar = qVar3.f29900B) != null) {
                            boolean z6 = jVar.f29859k;
                            long j = jVar.f29858i;
                            if (z6) {
                                jE = j;
                            } else {
                                jE = e(j, 1.0d, -1L);
                            }
                        }
                        return java.lang.Math.min(jLongValue, jE);
                    }
                    com.google.android.gms.cast.MediaInfo mediaInfo2 = qVar2 == null ? null : qVar2.f29904h;
                    if ((mediaInfo2 != null ? mediaInfo2.f18642l : 0L) >= 0) {
                        long jLongValue2 = l2.longValue();
                        p184w3.q qVar4 = this.f643f;
                        com.google.android.gms.cast.MediaInfo mediaInfo3 = qVar4 != null ? qVar4.f29904h : null;
                        return java.lang.Math.min(jLongValue2, mediaInfo3 != null ? mediaInfo3.f18642l : 0L);
                    }
                }
                return l2.longValue();
            }
            if (this.f642e != 0) {
                double d4 = qVar.f29906k;
                long j9 = qVar.f29909n;
                return (d4 == 0.0d || qVar.f29907l != 2) ? j9 : e(j9, d4, mediaInfo.f18642l);
            }
        }
        return 0L;
    }

    public final long o() throws B3.n {
        p184w3.q qVar = this.f643f;
        if (qVar != null) {
            return qVar.f29905i;
        }
        throw new B3.n();
    }
}
