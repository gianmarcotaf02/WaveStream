package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C5.c2 f1063i;

    public /* synthetic */ K0(C5.c2 c2Var, int i3) {
        this.f1062h = i3;
        this.f1063i = c2Var;
    }

    private final java.lang.Object b(java.lang.Object obj, p100l6.c cVar) {
        java.lang.Object value;
        com.kiptv.core.model.U u6 = (com.kiptv.core.model.U) obj;
        V7.n0 n0Var = this.f1063i.f1295x;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, C5.I0.a((C5.I0) value, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, u6 != null, u6 != null ? new java.lang.Integer(u6.f20565b) : null, u6 != null ? new java.lang.Integer(u6.f20566c) : null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -1, -225, 262143)));
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public java.lang.Object a(boolean z6, p100l6.c cVar) {
        C5.Z0 z9;
        java.lang.Object value;
        C5.K0 k1;
        if (cVar instanceof C5.Z0) {
            z9 = (C5.Z0) cVar;
            int i3 = z9.f1195k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z9.f1195k = i3 - Integer.MIN_VALUE;
            } else {
                z9 = new C5.Z0(this, cVar);
            }
        } else {
            z9 = new C5.Z0(this, cVar);
        }
        java.lang.Object obj = z9.f1194i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = z9.f1195k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            C5.c2 c2Var = this.f1063i;
            V7.n0 n0Var = c2Var.f1295x;
            do {
                value = n0Var.getValue();
            } while (!n0Var.g(value, C5.I0.a((C5.I0) value, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, z6, null, -1, -1, 196607)));
            if (z6) {
                z9.f1193h = this;
                z9.f1195k = 1;
                if (c2Var.Z(true, true, z9) == aVar) {
                    return aVar;
                }
                k1 = this;
            }
            return a2;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k1 = z9.f1193h;
        com.google.common.util.concurrent.P.u0(obj);
        C5.c2 c2Var2 = k1.f1063i;
        O7.o oVar = C5.c2.f1231s0;
        com.kiptv.core.model.TraktMediaRef traktMediaRefF0 = c2Var2.f0();
        if (traktMediaRefF0 != null) {
            k1.f1063i.W(traktMediaRefF0);
        }
        return a2;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        java.lang.Object value;
        C5.I0 i3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object value2;
        java.lang.Object value3;
        C5.I0 i9;
        java.lang.String str3;
        java.lang.Object value4;
        java.lang.Object value5;
        C5.I0 i10;
        java.lang.Object value6;
        switch (this.f1062h) {
            case 0:
                p070h6.k kVar = (p070h6.k) obj;
                com.kiptv.core.model.LocalDeviceSettings localDeviceSettings = (com.kiptv.core.model.LocalDeviceSettings) kVar.f22539h;
                com.kiptv.core.model.UserSettings userSettings = (com.kiptv.core.model.UserSettings) kVar.f22540i;
                C5.c2 c2Var = this.f1063i;
                V7.n0 n0Var = c2Var.f1295x;
                do {
                    value = n0Var.getValue();
                    i3 = (C5.I0) value;
                    C5.AbstractC0108f0 abstractC0108f0 = c2Var.f1294w;
                    abstractC0108f0.getClass();
                    str = ((abstractC0108f0 instanceof C5.C0099c0) || (abstractC0108f0 instanceof C5.C0093a0)) ? localDeviceSettings.f19824b : localDeviceSettings.f19823a;
                    str2 = localDeviceSettings.f19829h;
                    p108m5.l.Companion.getClass();
                } while (!n0Var.g(value, C5.I0.a(i3, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, str, str2, localDeviceSettings.f19830i, localDeviceSettings.j, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, p108m5.k.a(c2Var.f1258b, userSettings, localDeviceSettings), null, false, null, -1, -61441, 245759)));
                return p070h6.A.f22523a;
            case 1:
                long jLongValue = ((java.lang.Number) obj).longValue();
                V7.n0 n0Var2 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value7 = n0Var2.getValue();
                    V7.n0 n0Var3 = n0Var2;
                    if (n0Var3.g(value7, C5.I0.a((C5.I0) value7, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, jLongValue, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -1048577, -1, 262143))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var2 = n0Var3;
                }
                break;
            case 2:
                java.util.List list = (java.util.List) obj;
                V7.n0 n0Var4 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value8 = n0Var4.getValue();
                    V7.n0 n0Var5 = n0Var4;
                    C5.I0 i11 = (C5.I0) value8;
                    if (n0Var5.g(value8, C5.I0.a(i11, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, list, false, null, i11.f1039v0 || !list.isEmpty(), false, null, null, null, null, null, false, null, -1, -1, 261567))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var4 = n0Var5;
                }
                break;
            case 3:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                V7.n0 n0Var6 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value9 = n0Var6.getValue();
                    V7.n0 n0Var7 = n0Var6;
                    if (n0Var7.g(value9, C5.I0.a((C5.I0) value9, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, zBooleanValue, null, false, false, null, null, null, null, null, false, null, -1, -1, 262015))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var6 = n0Var7;
                }
                break;
            case 4:
                java.lang.String str4 = (java.lang.String) obj;
                V7.n0 n0Var8 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value10 = n0Var8.getValue();
                    V7.n0 n0Var9 = n0Var8;
                    if (n0Var9.g(value10, C5.I0.a((C5.I0) value10, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, str4, false, false, null, null, null, null, null, false, null, -1, -1, 261887))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var8 = n0Var9;
                }
                break;
            case 5:
                java.lang.String str5 = (java.lang.String) obj;
                V7.n0 n0Var10 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value11 = n0Var10.getValue();
                    V7.n0 n0Var11 = n0Var10;
                    if (n0Var11.g(value11, C5.I0.a((C5.I0) value11, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, str5, null, null, false, null, -1, -1, 253951))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var10 = n0Var11;
                }
                break;
            case 6:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                V7.n0 n0Var12 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value12 = n0Var12.getValue();
                    V7.n0 n0Var13 = n0Var12;
                    C5.I0 i12 = (C5.I0) value12;
                    if (n0Var13.g(value12, C5.I0.a(i12, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, zBooleanValue2 ? -1 : i12.f1032s, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, zBooleanValue2, null, null, null, null, null, false, null, -262145, -1, 261119))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var12 = n0Var13;
                }
                break;
            case 7:
                java.lang.Integer num = (java.lang.Integer) obj;
                V7.n0 n0Var14 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value13 = n0Var14.getValue();
                    V7.n0 n0Var15 = n0Var14;
                    if (n0Var15.g(value13, C5.I0.a((C5.I0) value13, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, num, null, null, null, null, false, null, -1, -1, 260095))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var14 = n0Var15;
                }
                break;
            case 8:
                java.lang.String str6 = (java.lang.String) obj;
                V7.n0 n0Var16 = this.f1063i.f1295x;
                do {
                    value2 = n0Var16.getValue();
                } while (!n0Var16.g(value2, C5.I0.a((C5.I0) value2, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, str6, null, null, null, false, null, -1, -1, 258047)));
                return p070h6.A.f22523a;
            case 9:
                com.kiptv.core.model.C1931a c1931a = (com.kiptv.core.model.C1931a) obj;
                V7.n0 n0Var17 = this.f1063i.f1295x;
                do {
                    value3 = n0Var17.getValue();
                    i9 = (C5.I0) value3;
                    if (c1931a != null) {
                        int iOrdinal = c1931a.f20736a.ordinal();
                        if (iOrdinal == 0) {
                            str3 = "player.skipRecap";
                        } else {
                            if (iOrdinal != 1) {
                                throw new I3.b();
                            }
                            str3 = "player.skipIntro";
                        }
                    } else {
                        str3 = null;
                    }
                } while (!n0Var17.g(value3, C5.I0.a(i9, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, str3, false, null, -1, -1, 229375)));
                return p070h6.A.f22523a;
            case 10:
                return a(((java.lang.Boolean) obj).booleanValue(), cVar);
            case 11:
                java.lang.Long l2 = (java.lang.Long) obj;
                V7.n0 n0Var18 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value14 = n0Var18.getValue();
                    V7.n0 n0Var19 = n0Var18;
                    if (n0Var19.g(value14, C5.I0.a((C5.I0) value14, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, l2, -1, -1, 131071))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var18 = n0Var19;
                }
                break;
            case 12:
                long jLongValue2 = ((java.lang.Number) obj).longValue();
                V7.n0 n0Var20 = this.f1063i.f1295x;
                while (true) {
                    java.lang.Object value15 = n0Var20.getValue();
                    V7.n0 n0Var21 = n0Var20;
                    if (n0Var21.g(value15, C5.I0.a((C5.I0) value15, false, false, null, null, null, null, 0L, jLongValue2, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -129, -1, 262143))) {
                        return p070h6.A.f22523a;
                    }
                    n0Var20 = n0Var21;
                }
                break;
            case 13:
                p099l5.C c9 = (p099l5.C) obj;
                V7.n0 n0Var22 = this.f1063i.f1295x;
                do {
                    value4 = n0Var22.getValue();
                } while (!n0Var22.g(value4, C5.I0.a((C5.I0) value4, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, 0L, 0L, false, c9, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -4194305, -1, 262143)));
                return p070h6.A.f22523a;
            case 14:
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                V7.n0 n0Var23 = this.f1063i.f1295x;
                do {
                    value5 = n0Var23.getValue();
                    i10 = (C5.I0) value5;
                } while (!n0Var23.g(value5, C5.I0.a(i10, false, false, null, null, null, null, 0L, 0L, null, false, false, zBooleanValue3 || (i10.f1018l && !i10.f1016k), false, null, null, null, 0, 0, 0L, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -2049, -1, 262143)));
                return p070h6.A.f22523a;
            case 15:
                return b(obj, cVar);
            default:
                long jLongValue3 = ((java.lang.Number) obj).longValue();
                V7.n0 n0Var24 = this.f1063i.f1295x;
                do {
                    value6 = n0Var24.getValue();
                } while (!n0Var24.g(value6, C5.I0.a((C5.I0) value6, false, false, null, null, null, null, 0L, 0L, null, false, false, false, false, null, null, null, 0, 0, jLongValue3, 0L, false, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, 0L, false, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, false, null, -524289, -1, 262143)));
                return p070h6.A.f22523a;
        }
    }
}
