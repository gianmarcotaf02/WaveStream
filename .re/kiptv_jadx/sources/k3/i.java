package k3;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f24459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p050f3.f f24460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p098l3.d f24461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.c f24462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f24463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p106m3.c f24464f;
    public final V1.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V1.b f24465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p098l3.c f24466i;

    public i(android.content.Context context, p050f3.f fVar, p098l3.d dVar, k3.c cVar, java.util.concurrent.Executor executor, p106m3.c cVar2, V1.b bVar, V1.b bVar2, p098l3.c cVar3) {
        this.f24459a = context;
        this.f24460b = fVar;
        this.f24461c = dVar;
        this.f24462d = cVar;
        this.f24463e = executor;
        this.f24464f = cVar2;
        this.g = bVar;
        this.f24465h = bVar2;
        this.f24466i = cVar3;
    }

    public final void a(final p041e3.i iVar, int i3) {
        p050f3.h hVar;
        p050f3.a aVar;
        java.lang.String str;
        p050f3.a aVar2;
        int i9;
        p023c3.b bVarB;
        java.lang.String str2;
        java.lang.Integer numValueOf;
        java.util.Iterator it;
        p103m.c1 c1Var;
        int i10;
        int i11;
        final k3.i iVar2 = this;
        final p041e3.i iVar3 = iVar;
        final int i12 = 1;
        final int i13 = 0;
        p050f3.h hVarA = iVar2.f24460b.a(iVar3.f21395a);
        long jMax = 0;
        while (true) {
            p106m3.b bVar = new p106m3.b(iVar2) { // from class: k3.f

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ k3.i f24453i;

                {
                    this.f24453i = iVar2;
                }

                @Override // p106m3.b
                public final java.lang.Object c() {
                    java.lang.Boolean bool;
                    switch (i13) {
                        case 0:
                            p041e3.i iVar4 = iVar3;
                            p098l3.g gVar = (p098l3.g) this.f24453i.f24461c;
                            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = gVar.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                java.lang.Long lE = p098l3.g.e(sQLiteDatabaseB, iVar4);
                                if (lE == null) {
                                    bool = java.lang.Boolean.FALSE;
                                } else {
                                    android.database.Cursor cursorRawQuery = gVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new java.lang.String[]{lE.toString()});
                                    try {
                                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (java.lang.Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (java.lang.Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            p098l3.g gVar2 = (p098l3.g) this.f24453i.f24461c;
                            gVar2.getClass();
                            return (java.lang.Iterable) gVar2.i(new F.f0(gVar2, iVar3, 21));
                    }
                }
            };
            p098l3.g gVar = (p098l3.g) iVar2.f24464f;
            if (!((java.lang.Boolean) gVar.u(bVar)).booleanValue()) {
                gVar.u(new androidx.media3.exoplayer.analytics.v(jMax, iVar2, iVar3));
                return;
            }
            final java.lang.Iterable iterable = (java.lang.Iterable) gVar.u(new p106m3.b(iVar2) { // from class: k3.f

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ k3.i f24453i;

                {
                    this.f24453i = iVar2;
                }

                @Override // p106m3.b
                public final java.lang.Object c() {
                    java.lang.Boolean bool;
                    switch (i12) {
                        case 0:
                            p041e3.i iVar4 = iVar3;
                            p098l3.g gVar2 = (p098l3.g) this.f24453i.f24461c;
                            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = gVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                java.lang.Long lE = p098l3.g.e(sQLiteDatabaseB, iVar4);
                                if (lE == null) {
                                    bool = java.lang.Boolean.FALSE;
                                } else {
                                    android.database.Cursor cursorRawQuery = gVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new java.lang.String[]{lE.toString()});
                                    try {
                                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (java.lang.Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (java.lang.Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            p098l3.g gVar3 = (p098l3.g) this.f24453i.f24461c;
                            gVar3.getClass();
                            return (java.lang.Iterable) gVar3.i(new F.f0(gVar3, iVar3, 21));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar3.f21396b;
            if (hVarA == null) {
                com.google.android.gms.internal.play_billing.V0.q("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                aVar2 = new p050f3.a(3, -1L);
                hVar = hVarA;
            } else {
                java.util.ArrayList<p041e3.h> arrayList = new java.util.ArrayList();
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((p098l3.b) it2.next()).f24725c);
                }
                if ((bArr != null ? 1 : i13) != 0) {
                    p098l3.c cVar = iVar2.f24466i;
                    java.util.Objects.requireNonNull(cVar);
                    p067h3.a aVar3 = (p067h3.a) gVar.u(new F1.e(28, cVar));
                    Z2.C0 c9 = new Z2.C0();
                    c9.f12660f = new java.util.HashMap();
                    c9.f12658d = java.lang.Long.valueOf(iVar2.g.g());
                    c9.f12659e = java.lang.Long.valueOf(iVar2.f24465h.g());
                    c9.f12655a = "GDT_CLIENT_METRICS";
                    p013b3.b bVar2 = new p013b3.b("proto");
                    aVar3.getClass();
                    android.support.v4.media.session.q qVar = p041e3.n.f21407a;
                    qVar.getClass();
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        qVar.o(aVar3, byteArrayOutputStream);
                    } catch (java.io.IOException unused) {
                    }
                    c9.f12657c = new p041e3.k(bVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((p023c3.c) hVarA).a(c9.d()));
                }
                p023c3.c cVar2 = (p023c3.c) hVarA;
                java.util.HashMap map = new java.util.HashMap();
                for (p041e3.h hVar2 : arrayList) {
                    java.lang.String str3 = hVar2.f21389a;
                    if (map.containsKey(str3)) {
                        ((java.util.List) map.get(str3)).add(hVar2);
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(hVar2);
                        map.put(str3, arrayList2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
                    p041e3.h hVar3 = (p041e3.h) ((java.util.List) entry.getValue()).get(0);
                    p033d3.w wVar = p033d3.w.f21228h;
                    long jG = cVar2.f18506f.g();
                    long jG2 = cVar2.f18505e.g();
                    p033d3.j jVar = new p033d3.j(new p033d3.h(java.lang.Integer.valueOf(hVar3.b("sdk-version")), hVar3.a(io.sentry.protocol.Device.JsonKeys.MODEL), hVar3.a("hardware"), hVar3.a(io.sentry.protocol.Device.TYPE), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a(io.sentry.protocol.Device.JsonKeys.MANUFACTURER), hVar3.a(io.sentry.SentryEvent.JsonKeys.FINGERPRINT), hVar3.a(io.sentry.protocol.Device.JsonKeys.LOCALE), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) entry.getKey()));
                        str2 = null;
                    } catch (java.lang.NumberFormatException unused2) {
                        str2 = (java.lang.String) entry.getKey();
                        numValueOf = null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator it4 = ((java.util.List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        p041e3.h hVar4 = (p041e3.h) it4.next();
                        java.util.Iterator it5 = it3;
                        p041e3.k kVar = hVar4.f21391c;
                        p013b3.b bVar3 = kVar.f21403a;
                        p050f3.h hVar5 = hVarA;
                        boolean zEquals = bVar3.equals(new p013b3.b("proto"));
                        byte[] bArr2 = kVar.f21404b;
                        if (zEquals) {
                            c1Var = new p103m.c1();
                            c1Var.f25020k = bArr2;
                            it = it4;
                        } else {
                            it = it4;
                            if (bVar3.equals(new p013b3.b("json"))) {
                                java.lang.String str4 = new java.lang.String(bArr2, java.nio.charset.Charset.forName("UTF-8"));
                                p103m.c1 c1Var2 = new p103m.c1();
                                c1Var2.f25021l = str4;
                                c1Var = c1Var2;
                            } else {
                                java.lang.String strT = com.google.android.gms.internal.play_billing.V0.t("CctTransportBackend");
                                if (android.util.Log.isLoggable(strT, 5)) {
                                    android.util.Log.w(strT, "Received event of unsupported encoding " + bVar3 + ". Skipping...");
                                }
                            }
                            it4 = it;
                            it3 = it5;
                            hVarA = hVar5;
                        }
                        c1Var.f25018h = java.lang.Long.valueOf(hVar4.f21392d);
                        c1Var.j = java.lang.Long.valueOf(hVar4.f21393e);
                        java.lang.String str5 = (java.lang.String) hVar4.f21394f.get("tz-offset");
                        c1Var.f25022m = java.lang.Long.valueOf(str5 == null ? 0L : java.lang.Long.valueOf(str5).longValue());
                        c1Var.f25023n = new p033d3.n((p033d3.u) p033d3.u.f21226h.get(hVar4.b("net-type")), (p033d3.t) p033d3.t.f21224h.get(hVar4.b("mobile-subtype")));
                        java.lang.Integer num = hVar4.f21390b;
                        if (num != null) {
                            c1Var.f25019i = num;
                        }
                        java.lang.String strO = ((java.lang.Long) c1Var.f25018h) == null ? " eventTimeMs" : "";
                        if (((java.lang.Long) c1Var.j) == null) {
                            strO = strO.concat(" eventUptimeMs");
                        }
                        if (((java.lang.Long) c1Var.f25022m) == null) {
                            strO = p121o0.p.o(strO, " timezoneOffsetSeconds");
                        }
                        if (!strO.isEmpty()) {
                            throw new java.lang.IllegalStateException("Missing required properties:".concat(strO));
                        }
                        arrayList4.add(new p033d3.k(((java.lang.Long) c1Var.f25018h).longValue(), (java.lang.Integer) c1Var.f25019i, ((java.lang.Long) c1Var.j).longValue(), (byte[]) c1Var.f25020k, (java.lang.String) c1Var.f25021l, ((java.lang.Long) c1Var.f25022m).longValue(), (p033d3.n) c1Var.f25023n));
                        it4 = it;
                        it3 = it5;
                        hVarA = hVar5;
                    }
                    arrayList3.add(new p033d3.l(jG, jG2, jVar, numValueOf, str2, arrayList4));
                    it3 = it3;
                    hVarA = hVarA;
                }
                hVar = hVarA;
                p033d3.i iVar4 = new p033d3.i(arrayList3);
                java.net.URL urlB = cVar2.f18504d;
                if (bArr != null) {
                    try {
                        p023c3.a aVarA = p023c3.a.a(bArr);
                        str = aVarA.f18497b;
                        if (str == null) {
                            str = null;
                        }
                        java.lang.String str6 = aVarA.f18496a;
                        if (str6 != null) {
                            urlB = p023c3.c.b(str6);
                        }
                    } catch (java.lang.IllegalArgumentException unused3) {
                        aVar = new p050f3.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    android.support.v4.media.session.q qVar2 = new android.support.v4.media.session.q(urlB, iVar4, str, 20);
                    F1.e eVar = new F1.e(16, cVar2);
                    int i14 = 5;
                    do {
                        bVarB = eVar.b(qVar2);
                        java.net.URL url = (java.net.URL) bVarB.f18500c;
                        if (url != null) {
                            com.google.android.gms.internal.play_billing.V0.q("CctTransportBackend", "Following redirect to: %s", url);
                            qVar2 = new android.support.v4.media.session.q(url, (p033d3.i) qVar2.j, (java.lang.String) qVar2.f15618k, 20);
                        } else {
                            qVar2 = null;
                        }
                        if (qVar2 == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = bVarB.f18498a;
                    if (i15 == 200) {
                        aVar2 = new p050f3.a(1, bVarB.f18499b);
                    } else {
                        if (i15 >= 500 || i15 == 404) {
                            aVar = new p050f3.a(2, -1L);
                        } else if (i15 == 400) {
                            try {
                                aVar = new p050f3.a(4, -1L);
                            } catch (java.io.IOException e6) {
                                e = e6;
                                com.google.android.gms.internal.play_billing.V0.r(e, "CctTransportBackend", "Could not make request to the backend");
                                i9 = 2;
                                aVar2 = new p050f3.a(2, -1L);
                            }
                        } else {
                            aVar = new p050f3.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (java.io.IOException e9) {
                    e = e9;
                }
            }
            i9 = 2;
            int i16 = aVar2.f21682a;
            if (i16 == i9) {
                final long j = jMax;
                gVar.u(new p106m3.b() { // from class: k3.g
                    @Override // p106m3.b
                    public final java.lang.Object c() {
                        k3.i iVar5 = this.f24454h;
                        p098l3.g gVar2 = (p098l3.g) iVar5.f24461c;
                        gVar2.getClass();
                        java.lang.Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            java.lang.String str7 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + p098l3.g.v(iterable2);
                            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = gVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                sQLiteDatabaseB.compileStatement(str7).execute();
                                android.database.Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        gVar2.t(cursorRawQuery.getInt(0), p067h3.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (java.lang.Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                            } catch (java.lang.Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        }
                        gVar2.i(new androidx.media3.exoplayer.upstream.experimental.a(iVar5.g.g() + j, iVar));
                        return null;
                    }
                });
                this.f24462d.a(iVar, i3 + 1, true);
                return;
            }
            iVar2 = this;
            iVar3 = iVar;
            long j9 = jMax;
            gVar.u(new F.f0(iVar2, iterable, 19));
            if (i16 == 1) {
                jMax = java.lang.Math.max(j9, aVar2.f21683b);
                if (bArr != null) {
                    i10 = 0;
                    gVar.u(new k3.h(i10, iVar2));
                } else {
                    i10 = 0;
                }
                i11 = 1;
            } else {
                i10 = 0;
                if (i16 == 4) {
                    java.util.HashMap map2 = new java.util.HashMap();
                    java.util.Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str7 = ((p098l3.b) it6.next()).f24725c.f21389a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, java.lang.Integer.valueOf(((java.lang.Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    i11 = 1;
                    gVar.u(new F.f0(iVar2, map2, 20));
                } else {
                    i11 = 1;
                }
                jMax = j9;
            }
            i13 = i10;
            i12 = i11;
            hVarA = hVar;
        }
    }
}
