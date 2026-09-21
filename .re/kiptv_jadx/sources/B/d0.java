package B;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f523i;

    public /* synthetic */ d0(int i3, java.lang.Object obj) {
        this.f522h = i3;
        this.f523i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0223 A[Catch: all -> 0x0216, LOOP:5: B:90:0x01e7->B:107:0x0223, LOOP_END, TryCatch #0 {all -> 0x0216, blocks: (B:83:0x01c4, B:85:0x01d4, B:87:0x01da, B:90:0x01e7, B:92:0x01f3, B:94:0x01fd, B:96:0x0203, B:98:0x020c, B:103:0x0218, B:104:0x021b, B:107:0x0223, B:117:0x0248, B:108:0x0226, B:109:0x022c, B:111:0x0232, B:113:0x023a, B:116:0x0244), top: B:197:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02de  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:216:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:162:0x02f8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object item) {
        boolean zG;
        char c9;
        char c10;
        java.util.Collection collectionA1;
        char c11 = 7;
        char c12 = 3;
        java.lang.Object objY = null;
        int i3 = 0;
        switch (this.f522h) {
            case 0:
                return new p113n1.k(((p137q0.h) this.f523i).a(0L, ((p113n1.m) obj).f25565a, (p113n1.n) item));
            case 1:
                ((java.lang.Integer) item).getClass();
                F.AbstractC0349n.c((p089k0.e) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(7));
                return p070h6.A.f22523a;
            case 2:
                ((java.lang.Integer) item).getClass();
                J.AbstractC0549n.h((U.i0) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            case 3:
                ((J.g0) this.f523i).e(((p181w0.a) item).f29744a);
                return p070h6.A.f22523a;
            case 4:
                ((java.lang.Integer) item).getClass();
                J5.Z0.a((J5.C0639v0) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            case 5:
                ((java.lang.Integer) item).getClass();
                J5.X1.e((com.kiptv.core.model.l0) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            case 6:
                ((java.lang.Integer) item).getClass();
                J5.X1.l((p137q0.m) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            case 7:
                ((java.lang.Integer) item).getClass();
                O7.r.b((p043e5.a) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            case 8:
                p020c0.C1700q c1700q = (p020c0.C1700q) obj;
                ((java.lang.Integer) item).getClass();
                c1700q.c0(666084174);
                java.lang.String str = ((M.d) this.f523i).f7109b;
                c1700q.p(false);
                return str;
            case 9:
                android.view.textclassifier.TextClassification textClassification = (android.view.textclassifier.TextClassification) this.f523i;
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                ((java.lang.Integer) item).getClass();
                c1700q2.c0(950061013);
                java.lang.String strValueOf = java.lang.String.valueOf(textClassification.getLabel());
                c1700q2.p(false);
                return strValueOf;
            case 10:
                android.app.RemoteAction remoteAction = (android.app.RemoteAction) this.f523i;
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj;
                ((java.lang.Integer) item).getClass();
                c1700q3.c0(-1376593684);
                java.lang.String string = remoteAction.getTitle().toString();
                c1700q3.p(false);
                return string;
            case 11:
                java.lang.CharSequence DelimitedRangesSequence = (java.lang.CharSequence) obj;
                int iIntValue = ((java.lang.Integer) item).intValue();
                kotlin.jvm.internal.m.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iM0 = O7.q.M0(DelimitedRangesSequence, (char[]) this.f523i, iIntValue, false);
                if (iM0 < 0) {
                    return null;
                }
                return new p070h6.k(java.lang.Integer.valueOf(iM0), 1);
            case 12:
                ((K0.x) obj).a();
                ((kotlin.jvm.internal.z) this.f523i).f24556h = ((p181w0.a) item).f29744a;
                return p070h6.A.f22523a;
            case 13:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                p100l6.f fVar = (p100l6.f) item;
                p100l6.g key = fVar.getKey();
                p100l6.f fVar2 = ((W7.y) this.f523i).f10780i.get(key);
                if (key == S7.C0889g0.f9584h) {
                    S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) fVar2;
                    S7.InterfaceC0891h0 parent = (S7.InterfaceC0891h0) fVar;
                    while (parent != null) {
                        if (parent != interfaceC0891h0 && (parent instanceof X7.p)) {
                            S7.InterfaceC0898n interfaceC0898n = (S7.InterfaceC0898n) S7.p0.f9611i.get((X7.p) parent);
                            parent = interfaceC0898n != null ? interfaceC0898n.getParent() : null;
                        } else {
                            objY = parent;
                            if (objY == interfaceC0891h0) {
                                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objY + ", expected child of " + interfaceC0891h0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC0891h0 != null) {
                                iIntValue2++;
                            }
                        }
                    }
                    if (objY == interfaceC0891h0) {
                        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objY + ", expected child of " + interfaceC0891h0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (interfaceC0891h0 != null) {
                        iIntValue2++;
                    }
                } else if (fVar != fVar2) {
                    iIntValue2 = Integer.MIN_VALUE;
                } else {
                    iIntValue2++;
                }
                return java.lang.Integer.valueOf(iIntValue2);
            case 14:
                p181w0.b bVarK = p188x0.z.K((android.graphics.RectF) obj);
                p181w0.b bVarK2 = p188x0.z.K((android.graphics.RectF) item);
                switch (((D1.C0223h) this.f523i).f2018h) {
                    case 20:
                        zG = bVarK.g(bVarK2);
                        break;
                    default:
                        zG = bVarK2.a(bVarK.b());
                        break;
                }
                return java.lang.Boolean.valueOf(zG);
            case 15:
                ((java.lang.Integer) obj).getClass();
                boolean z6 = item instanceof p020c0.InterfaceC1682h;
                p089k0.k kVar = (p089k0.k) this.f523i;
                if (z6) {
                    p020c0.InterfaceC1682h interfaceC1682h = (p020c0.InterfaceC1682h) item;
                    p136q.I i9 = kVar.f24429h;
                    if (i9 == null) {
                        p136q.I i10 = p136q.Q.f26352a;
                        i9 = new p136q.I();
                        kVar.f24429h = i9;
                    }
                    i9.j(interfaceC1682h);
                    kVar.f24428f.c(interfaceC1682h);
                }
                if (item instanceof p020c0.D0) {
                    kVar.e((p020c0.D0) item);
                }
                if (item instanceof p020c0.C1701q0) {
                    ((p020c0.C1701q0) item).d();
                }
                return p070h6.A.f22523a;
            case 16:
                p020c0.C1718z0 c1718z0 = (p020c0.C1718z0) this.f523i;
                java.util.Set set = (java.util.Set) obj;
                synchronized (c1718z0.f18431c) {
                    try {
                        if (((p020c0.EnumC1706t0) c1718z0.f18447u.getValue()).compareTo(p020c0.EnumC1706t0.f18371l) >= 0) {
                            p136q.I i11 = c1718z0.f18435h;
                            if (set instanceof p038e0.h) {
                                p136q.I i12 = ((p038e0.h) set).f21335h;
                                java.lang.Object[] objArr = i12.f26329b;
                                long[] jArr = i12.f26328a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j = jArr[i13];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = i3; i15 < i14; i15++) {
                                                if ((j & 255) < 128) {
                                                    java.lang.Object obj2 = objArr[(i13 << 3) + i15];
                                                    if (!(obj2 instanceof p121o0.u) || ((p121o0.u) obj2).c(1)) {
                                                        i11.a(obj2);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i14 == 8) {
                                                if (i13 != length) {
                                                    i13++;
                                                    i3 = 0;
                                                }
                                            }
                                        } else if (i13 != length) {
                                            i13++;
                                            i3 = 0;
                                        }
                                    }
                                }
                            } else {
                                for (java.lang.Object obj3 : set) {
                                    if (!(obj3 instanceof p121o0.u) || ((p121o0.u) obj3).c(1)) {
                                        i11.a(obj3);
                                    }
                                }
                            }
                            objY = c1718z0.y();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objY != null) {
                    ((S7.C0895k) objY).resumeWith(p070h6.A.f22523a);
                }
                return p070h6.A.f22523a;
            case 17:
                java.util.Set set2 = (java.util.Set) obj;
                if (set2 instanceof p038e0.h) {
                    p136q.I i16 = ((p038e0.h) set2).f21335h;
                    java.lang.Object[] objArr2 = i16.f26329b;
                    long[] jArr2 = i16.f26328a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j9 = jArr2[i17];
                            if ((((~j9) << c11) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                int i19 = 0;
                                while (true) {
                                    if (i19 < i18) {
                                        if ((j9 & 255) < 128) {
                                            java.lang.Object obj4 = objArr2[(i17 << 3) + i19];
                                            if (!(obj4 instanceof p121o0.u) || ((p121o0.u) obj4).c(4)) {
                                                ((U7.j) this.f523i).mo3trySendJP2dKIU(set2);
                                            }
                                        }
                                        j9 >>= 8;
                                        i19++;
                                        c12 = c12;
                                        c11 = c11;
                                    } else {
                                        c9 = c11;
                                        c10 = c12;
                                        if (i18 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c9 = c11;
                                c10 = c12;
                            }
                            if (i17 != length2) {
                                i17++;
                                c12 = c10;
                                c11 = c9;
                            }
                        }
                    }
                } else {
                    java.util.Set set3 = set2;
                    if (!(set3 instanceof java.util.Collection) || !set3.isEmpty()) {
                        for (java.lang.Object obj5 : set3) {
                            if (!(obj5 instanceof p121o0.u) || ((p121o0.u) obj5).c(4)) {
                                ((U7.j) this.f523i).mo3trySendJP2dKIU(set2);
                            }
                        }
                    }
                }
                return p070h6.A.f22523a;
            case 18:
                ((Q0.C0768d) this.f523i).invoke(obj);
                return p070h6.A.f22523a;
            case 19:
                return io.ktor.client.engine.okhttp.OkHttpEngineKt.convertToOkHttpRequest$lambda$1$lambda$0((w8.u) this.f523i, (java.lang.String) obj, (java.lang.String) item);
            case 20:
                return io.ktor.http.URLParserKt.parseQuery$lambda$5((io.ktor.http.URLBuilder) this.f523i, (java.lang.String) obj, (java.util.List) item);
            case 21:
                java.util.Collection collection = (java.util.Set) obj;
                while (true) {
                    p121o0.r rVar = (p121o0.r) this.f523i;
                    java.util.concurrent.atomic.AtomicReference atomicReference = rVar.f26015b;
                    java.lang.Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        collectionA1 = collection;
                    } else if (obj6 instanceof java.util.Set) {
                        collectionA1 = p078i6.p.B0(obj6, collection);
                    } else {
                        if (!(obj6 instanceof java.util.List)) {
                            p020c0.AbstractC1705t.b("Unexpected notification");
                            throw new I3.b();
                        }
                        collectionA1 = p078i6.o.A1((java.util.Collection) obj6, com.google.common.util.concurrent.P.i0(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj6, collectionA1)) {
                            if (rVar.c()) {
                                rVar.f26014a.invoke(new p077i5.C2237d(17, rVar));
                            }
                            return p070h6.A.f22523a;
                        }
                    } while (atomicReference.get() == obj6);
                }
                break;
            case 22:
                ((java.lang.Integer) item).getClass();
                com.google.common.util.concurrent.U.H((p123o2.n) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            case 23:
                ((java.lang.Integer) item).getClass();
                ((p163t.I) this.f523i).a(p020c0.AbstractC1703s.K(1), (p020c0.C1700q) obj);
                return p070h6.A.f22523a;
            case 24:
                ((java.lang.Integer) obj).intValue();
                kotlin.jvm.internal.m.e(item, "item");
                return ((p194x6.j) this.f523i).invoke(item);
            case 25:
                ((java.lang.Integer) item).getClass();
                t5.AbstractC2793d1.R((com.kiptv.core.model.EnumC1956p) this.f523i, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return p070h6.A.f22523a;
            default:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                float fFloatValue2 = ((java.lang.Float) item).floatValue();
                x.P0 p2 = (x.P0) this.f523i;
                S7.C.A(p2.B0(), null, new x.N0(p2, fFloatValue, fFloatValue2, null), 3);
                return java.lang.Boolean.TRUE;
        }
    }

    public /* synthetic */ d0(java.lang.Object obj, int i3, int i9) {
        this.f522h = i9;
        this.f523i = obj;
    }
}
