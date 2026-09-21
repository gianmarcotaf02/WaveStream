package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1833d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19318a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f19319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f19320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19321d = 0;

    public static final E6.InterfaceC0331d A(java.lang.Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        return kotlin.jvm.internal.B.f24540a.b(cls);
    }

    public static p048f1.s B() {
        return p048f1.s.f21669m;
    }

    public static boolean C() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return p198y2.a.a();
        }
        try {
            if (f19320c == null) {
                f19319b = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f19320c = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            return ((java.lang.Boolean) f19320c.invoke(null, java.lang.Long.valueOf(f19319b))).booleanValue();
        } catch (java.lang.Exception e6) {
            if (!(e6 instanceof java.lang.reflect.InvocationTargetException)) {
                android.util.Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
                return false;
            }
            java.lang.Throwable cause = e6.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static final boolean D(p181w0.c cVar) {
        long j = cVar.f29754e;
        return (j >>> 32) == (4294967295L & j) && j == cVar.f29755f && j == cVar.g && j == cVar.f29756h;
    }

    public static java.lang.String E(java.lang.String url, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(url, "url");
        if (!z6 || z9) {
            return null;
        }
        java.util.List listB0 = p078i6.p.B0(java.lang.Integer.valueOf(O7.q.K0(url, '?', 0, 6)), java.lang.Integer.valueOf(O7.q.K0(url, '#', 0, 6)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listB0) {
            if (((java.lang.Number) obj).intValue() >= 0) {
                arrayList.add(obj);
            }
        }
        java.lang.Integer num = (java.lang.Integer) p078i6.o.u1(arrayList);
        int iIntValue = num != null ? num.intValue() : url.length();
        java.lang.String strSubstring = url.substring(0, iIntValue);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        if (!O7.x.q0(strSubstring, ".m3u8", true)) {
            return null;
        }
        java.lang.String strE0 = O7.q.E0(5, strSubstring);
        java.lang.String strSubstring2 = url.substring(iIntValue);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        return strE0 + ".ts" + strSubstring2;
    }

    public static long F(byte[] bArr, int i3) {
        return ((long) (((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16))) & 4294967295L;
    }

    public static p100l6.h G(p100l6.f fVar, p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        return kotlin.jvm.internal.m.a(fVar.getKey(), key) ? p100l6.i.f24820h : fVar;
    }

    public static p100l6.h H(p100l6.f fVar, p100l6.h context) {
        kotlin.jvm.internal.m.e(context, "context");
        return context == p100l6.i.f24820h ? fVar : (p100l6.h) context.fold(fVar, new p011b1.y(22));
    }

    public static final long I(H0.b bVar, x.EnumC3061p0 enumC3061p0, H0.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (enumC3061p0 == null) {
            return bVar.f3835c;
        }
        int i3 = aVar.f3832a;
        if (i3 == 1) {
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (bVar.f3835c >> 32));
        } else {
            if (i3 != 2) {
                return bVar.f3835c;
            }
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (bVar.f3835c & 4294967295L));
        }
        if (enumC3061p0 == x.EnumC3061p0.f30979i) {
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final long J(H0.b bVar, x.EnumC3061p0 enumC3061p0, H0.a aVar) {
        float fIntBitsToFloat;
        long j = bVar.g;
        if (enumC3061p0 == null) {
            return j;
        }
        int i3 = aVar.f3832a;
        if (i3 == 1) {
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (i3 != 2) {
                return j;
            }
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (enumC3061p0 == x.EnumC3061p0.f30979i) {
            return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32);
    }

    public static final void K(java.lang.String key, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        bundle.putString(key, null);
    }

    public static final void L(android.os.Bundle bundle, java.lang.String key, android.os.Bundle value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void M(android.os.Bundle bundle, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        bundle.putString(key, value);
    }

    public static final void N(java.lang.String str, android.os.Bundle bundle, java.util.List list) {
        bundle.putStringArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
    }

    public static final java.lang.String O(p101l7.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        java.lang.String strB = eVar.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        if (!p118n7.m.f25927a.contains(strB)) {
            for (int i3 = 0; i3 < strB.length(); i3++) {
                char cCharAt = strB.charAt(i3);
                if (java.lang.Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && java.lang.Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                java.lang.String strB2 = eVar.b();
                kotlin.jvm.internal.m.d(strB2, "asString(...)");
                return strB2;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strB3 = eVar.b();
        kotlin.jvm.internal.m.d(strB3, "asString(...)");
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final java.lang.String P(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p101l7.e eVar = (p101l7.e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(O(eVar));
        }
        return sb.toString();
    }

    public static final java.lang.String Q(java.lang.String lowerRendered, java.lang.String lowerPrefix, java.lang.String upperRendered, java.lang.String upperPrefix, java.lang.String foldedPrefix) {
        kotlin.jvm.internal.m.e(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.m.e(lowerPrefix, "lowerPrefix");
        kotlin.jvm.internal.m.e(upperRendered, "upperRendered");
        kotlin.jvm.internal.m.e(upperPrefix, "upperPrefix");
        kotlin.jvm.internal.m.e(foldedPrefix, "foldedPrefix");
        if (!O7.x.x0(lowerRendered, lowerPrefix, false) || !O7.x.x0(upperRendered, upperPrefix, false)) {
            return null;
        }
        java.lang.String strSubstring = lowerRendered.substring(lowerPrefix.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        java.lang.String strSubstring2 = upperRendered.substring(upperPrefix.length());
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        java.lang.String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!X(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final p113n1.l R(p181w0.b bVar) {
        return new p113n1.l(java.lang.Math.round(bVar.f29746a), java.lang.Math.round(bVar.f29747b), java.lang.Math.round(bVar.f29748c), java.lang.Math.round(bVar.f29749d));
    }

    public static final p080i8.p S(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, p080i8.a setter, java.lang.String name, boolean z6) {
        int iIntValue;
        p078i6.w wVar;
        kotlin.jvm.internal.m.e(setter, "setter");
        kotlin.jvm.internal.m.e(name, "name");
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z6 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z6) {
                iIntValue++;
            }
        } else {
            iIntValue = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = java.lang.Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return T(z6, setter, name, iIntValue2, iIntValue);
        }
        p080i8.p pVarT = T(z6, setter, name, iIntValue2, iIntValue2);
        while (true) {
            wVar = p078i6.w.f23205h;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            pVarT = new p080i8.p(wVar, p078i6.p.B0(T(z6, setter, name, iIntValue2, iIntValue2), com.google.android.gms.internal.play_billing.V0.k(p078i6.p.B0(new p080i8.p(com.google.common.util.concurrent.P.i0(new p080i8.r(io.ktor.sse.ServerSentEventKt.SPACE)), wVar), pVarT))));
        }
        if (iIntValue3 > iIntValue) {
            return com.google.android.gms.internal.play_billing.V0.k(p078i6.p.B0(new p080i8.p(com.google.common.util.concurrent.P.i0(new p080i8.r(O7.x.u0(iIntValue3 - iIntValue, io.ktor.sse.ServerSentEventKt.SPACE))), wVar), pVarT));
        }
        return iIntValue3 == iIntValue ? pVarT : new p080i8.p(wVar, p078i6.p.B0(T(z6, setter, name, iIntValue3 + 1, iIntValue), pVarT));
    }

    public static final p080i8.p T(boolean z6, p080i8.a aVar, java.lang.String str, int i3, int i9) {
        if (i9 < (z6 ? 1 : 0) + 1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        p086j6.b bVarU = com.google.common.util.concurrent.P.U();
        if (z6) {
            bVarU.add(new p080i8.r("-"));
        }
        bVarU.add(new p080i8.h(com.google.common.util.concurrent.P.i0(new p080i8.x(java.lang.Integer.valueOf(i3 - (z6 ? 1 : 0)), java.lang.Integer.valueOf(i9 - (z6 ? 1 : 0)), aVar, str, z6))));
        return new p080i8.p(com.google.common.util.concurrent.P.M(bVarU), p078i6.w.f23205h);
    }

    public static final p154s.D U(p163t.y0 y0Var, p194x6.j jVar, java.lang.Object obj, p020c0.C1700q c1700q) {
        p154s.D d4;
        c1700q.a0(-422486745, y0Var);
        boolean zG = y0Var.g();
        D1.AbstractC0220e0 abstractC0220e0 = y0Var.f27727a;
        if (zG) {
            c1700q.c0(-212166497);
            c1700q.p(false);
            if (((java.lang.Boolean) jVar.invoke(obj)).booleanValue()) {
                d4 = p154s.D.f27047i;
            } else {
                d4 = ((java.lang.Boolean) jVar.invoke(abstractC0220e0.s0())).booleanValue() ? p154s.D.j : p154s.D.f27046h;
            }
        } else {
            c1700q.c0(-211892364);
            java.lang.Object objQ = c1700q.Q();
            if (objQ == p020c0.C1690l.f18284a) {
                objQ = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                c1700q.n0(objQ);
            }
            p020c0.X x9 = (p020c0.X) objQ;
            if (((java.lang.Boolean) jVar.invoke(abstractC0220e0.s0())).booleanValue()) {
                x9.setValue(java.lang.Boolean.TRUE);
            }
            if (((java.lang.Boolean) jVar.invoke(obj)).booleanValue()) {
                d4 = p154s.D.f27047i;
            } else {
                d4 = ((java.lang.Boolean) x9.getValue()).booleanValue() ? p154s.D.j : p154s.D.f27046h;
            }
            c1700q.p(false);
        }
        c1700q.p(false);
        return d4;
    }

    public static void V(byte[] bArr, int i3, long j) {
        int i9 = 0;
        while (i9 < 4) {
            bArr[i3 + i9] = (byte) (255 & j);
            i9++;
            j >>= 8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f7.b, p0.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final java.util.ArrayList W(p020c0.J0 j9, int i3, java.lang.Integer num) {
        ?? jVar = new p129p0.j(j9);
        i3 = j9.q(i3);
        p020c0.C1668a c1668aA = j9.a(i3);
        while (i3 >= 0) {
            jVar.d(j9.i(i3), j9.k(i3) ? j9.p(j9.f18123b, i3) : p020c0.C1690l.f18284a, j9.f18122a.q(i3), num);
            if (i3 >= 0) {
                p020c0.C1668a c1668a = c1668aA;
                c1668aA = j9.a(i3);
                i3 = j9.q(i3);
                num = c1668a;
            } else {
                num = c1668aA;
            }
        }
        return jVar.f21732h;
    }

    public static final boolean X(java.lang.String lower, java.lang.String upper) {
        kotlin.jvm.internal.m.e(lower, "lower");
        kotlin.jvm.internal.m.e(upper, "upper");
        if (lower.equals(O7.x.w0(upper, "?", ""))) {
            return true;
        }
        if (O7.x.q0(upper, "?", false) && kotlin.jvm.internal.m.a(lower.concat("?"), upper)) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return kotlin.jvm.internal.m.a(sb.toString(), upper);
    }

    public static boolean Y(byte b9) {
        return b9 > -65;
    }

    public static final void a(p163t.y0 y0Var, p194x6.j jVar, p137q0.p pVar, p154s.P p2, p154s.Q q9, p194x6.m mVar, p089k0.e eVar, p020c0.C1700q c1700q, int i3) {
        int i9;
        p154s.Q q10;
        boolean z6;
        c1700q.e0(1912839215);
        if ((i3 & 6) == 0) {
            i9 = (c1700q.f(y0Var) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.h(jVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= c1700q.f(pVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i9 |= c1700q.f(p2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            q10 = q9;
            i9 |= c1700q.f(q10) ? 16384 : 8192;
        } else {
            q10 = q9;
        }
        if ((196608 & i3) == 0) {
            i9 |= c1700q.h(mVar) ? 131072 : 65536;
        }
        int i10 = i9 | 1572864;
        if ((12582912 & i3) == 0) {
            i10 |= c1700q.h(eVar) ? 8388608 : 4194304;
        }
        if (c1700q.T(i10 & 1, (4793491 & i10) != 4793490)) {
            boolean zBooleanValue = ((java.lang.Boolean) jVar.invoke(y0Var.f27730d.getValue())).booleanValue();
            D1.AbstractC0220e0 abstractC0220e0 = y0Var.f27727a;
            if (zBooleanValue || ((java.lang.Boolean) jVar.invoke(abstractC0220e0.s0())).booleanValue() || y0Var.g() || y0Var.d()) {
                c1700q.c0(-232413539);
                int i11 = i10 & 14;
                int i12 = i11 | 48;
                int i13 = i12 & 14;
                boolean z9 = ((i13 ^ 6) > 4 && c1700q.f(y0Var)) || (i12 & 6) == 4;
                java.lang.Object objQ = c1700q.Q();
                java.lang.Object obj = p020c0.C1690l.f18284a;
                if (z9 || objQ == obj) {
                    objQ = abstractC0220e0.s0();
                    c1700q.n0(objQ);
                }
                if (y0Var.g()) {
                    objQ = abstractC0220e0.s0();
                }
                c1700q.c0(1844425648);
                p154s.D dU = U(y0Var, jVar, objQ, c1700q);
                c1700q.p(false);
                java.lang.Object value = y0Var.f27730d.getValue();
                c1700q.c0(1844425648);
                p154s.D dU2 = U(y0Var, jVar, value, c1700q);
                c1700q.p(false);
                int i14 = i13 | 3072;
                q5.i iVar = p163t.C0.f27441a;
                int i15 = (i14 & 14) ^ 6;
                boolean z10 = (i15 > 4 && c1700q.f(y0Var)) || (i14 & 6) == 4;
                java.lang.Object objQ2 = c1700q.Q();
                if (z10 || objQ2 == obj) {
                    objQ2 = new p163t.y0(new p163t.L(dU), y0Var, Y6.f.m(new java.lang.StringBuilder(), y0Var.f27729c, " > EnterExitTransition"));
                    c1700q.n0(objQ2);
                }
                p163t.y0 y0Var2 = (p163t.y0) objQ2;
                boolean zF = ((i15 > 4 && c1700q.f(y0Var)) || (i14 & 6) == 4) | c1700q.f(y0Var2);
                java.lang.Object objQ3 = c1700q.Q();
                if (zF || objQ3 == obj) {
                    objQ3 = new p028c8.b(y0Var, y0Var2, 20);
                    c1700q.n0(objQ3);
                }
                p020c0.AbstractC1703s.d(y0Var2, (p194x6.j) objQ3, c1700q);
                if (y0Var.g()) {
                    y0Var2.k(dU, dU2);
                } else {
                    y0Var2.p(dU2);
                    y0Var2.f27735k.setValue(java.lang.Boolean.FALSE);
                }
                p020c0.X xF = p020c0.AbstractC1703s.F(mVar, c1700q);
                java.lang.Object objS0 = y0Var2.f27727a.s0();
                p020c0.C1681g0 c1681g0 = y0Var2.f27730d;
                java.lang.Object objInvoke = mVar.invoke(objS0, c1681g0.getValue());
                boolean zF2 = c1700q.f(y0Var2) | c1700q.f(xF);
                java.lang.Object objQ4 = c1700q.Q();
                if (zF2 || objQ4 == obj) {
                    objQ4 = new p154s.r(y0Var2, xF, null);
                    c1700q.n0(objQ4);
                }
                p020c0.X xZ = p020c0.AbstractC1703s.z(c1700q, objInvoke, (p194x6.m) objQ4);
                java.lang.Object objS1 = y0Var2.f27727a.s0();
                p154s.D d4 = p154s.D.j;
                if (objS1 == d4 && c1681g0.getValue() == d4 && ((java.lang.Boolean) xZ.getValue()).booleanValue()) {
                    c1700q.c0(-272333293);
                    c1700q.p(false);
                    z6 = false;
                } else {
                    c1700q.c0(-231383533);
                    boolean z11 = i11 == 4;
                    java.lang.Object objQ5 = c1700q.Q();
                    if (z11 || objQ5 == obj) {
                        objQ5 = new p154s.C2737x(y0Var2);
                        c1700q.n0(objQ5);
                    }
                    p154s.C2737x c2737x = (p154s.C2737x) objQ5;
                    int i16 = i10 >> 6;
                    p137q0.p pVarA = p154s.K.a(y0Var2, p2, q10, "Built-in", c1700q, (i16 & 112) | 24576 | (i16 & 896));
                    c1700q.c0(-7432681);
                    c1700q.p(false);
                    p137q0.p pVarD = pVar.d(pVarA.d(p137q0.m.f26474b));
                    java.lang.Object objQ6 = c1700q.Q();
                    if (objQ6 == obj) {
                        objQ6 = new p154s.C2730p(c2737x);
                        c1700q.n0(objQ6);
                    }
                    p154s.C2730p c2730p = (p154s.C2730p) objQ6;
                    int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
                    p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
                    p137q0.p pVarC = p137q0.a.c(c1700q, pVarD);
                    Q0.InterfaceC0773g.f8436c.getClass();
                    kotlin.jvm.functions.Function0 function0 = Q0.C0772f.f8424b;
                    c1700q.g0();
                    if (c1700q.f18322S) {
                        c1700q.k(function0);
                    } else {
                        c1700q.q0();
                    }
                    p020c0.AbstractC1703s.H(c1700q, c2730p, Q0.C0772f.f8427e);
                    p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, Q0.C0772f.f8426d);
                    p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(iHashCode), Q0.C0772f.f8428f);
                    p020c0.AbstractC1703s.D(c1700q, Q0.C0772f.g);
                    p020c0.AbstractC1703s.H(c1700q, pVarC, Q0.C0772f.f8425c);
                    eVar.invoke(c2737x, c1700q, java.lang.Integer.valueOf((i10 >> 18) & 112));
                    c1700q.p(true);
                    z6 = false;
                    c1700q.p(false);
                }
                c1700q.p(z6);
            } else {
                c1700q.c0(-272333293);
                c1700q.p(false);
            }
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p154s.C2731q(y0Var, jVar, pVar, p2, q9, mVar, eVar, i3);
        }
    }

    public static final void b(boolean z6, p137q0.m mVar, p154s.P p2, p154s.Q q9, java.lang.String str, p089k0.e eVar, p020c0.C1700q c1700q, int i3, int i9) {
        p137q0.m mVar2;
        p154s.P pA;
        p154s.Q qA;
        java.lang.String str2;
        int i10;
        c1700q.e0(1799879339);
        int i11 = (c1700q.g(z6) ? 32 : 16) | i3;
        int i12 = i11 | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
        int i13 = i9 & 4;
        if (i13 != 0) {
            i12 = i11 | 3456;
        } else if ((i3 & 3072) == 0) {
            i12 |= c1700q.f(p2) ? 2048 : 1024;
        }
        int i14 = i9 & 8;
        if (i14 != 0) {
            i12 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i12 |= c1700q.f(q9) ? 16384 : 8192;
        }
        int i15 = i12 | 196608;
        if (c1700q.T(i15 & 1, (599185 & i15) != 599184)) {
            p137q0.m mVar3 = p137q0.m.f26474b;
            if (i13 != 0) {
                pA = p154s.K.c(null, 3).a(p154s.K.b(null, 15));
                i10 = i14;
            } else {
                i10 = i14;
                pA = p2;
            }
            qA = i10 != 0 ? p154s.K.d(null, 3).a(p154s.K.e(null, 15)) : q9;
            p163t.y0 y0VarD = p163t.C0.d(java.lang.Boolean.valueOf(z6), "AnimatedVisibility", c1700q, ((i15 >> 3) & 14) | 48);
            java.lang.Object objQ = c1700q.Q();
            if (objQ == p020c0.C1690l.f18284a) {
                objQ = p154s.C2717c.f27117k;
                c1700q.n0(objQ);
            }
            mVar2 = mVar3;
            d(y0VarD, (p194x6.j) objQ, mVar2, pA, qA, eVar, c1700q, (i15 & 57344) | (i15 & 7168) | 432 | 196608);
            str2 = "AnimatedVisibility";
        } else {
            c1700q.W();
            mVar2 = mVar;
            pA = p2;
            qA = q9;
            str2 = str;
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p154s.C2732s(z6, mVar2, pA, qA, str2, eVar, i3, i9, 1);
        }
    }

    public static final void c(boolean z6, p137q0.p pVar, p154s.P p2, p154s.Q q9, java.lang.String str, p089k0.e eVar, p020c0.C1700q c1700q, int i3, int i9) {
        int i10;
        p154s.P p9;
        p154s.Q q10;
        p089k0.e eVar2;
        p137q0.p pVar2;
        java.lang.String str2;
        c1700q.e0(-1448730565);
        if ((i3 & 6) == 0) {
            i10 = (c1700q.g(z6) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        int i11 = i9 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i3 & 48) == 0) {
            i10 |= c1700q.f(pVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            p9 = p2;
            i10 |= c1700q.f(p9) ? 256 : 128;
        } else {
            p9 = p2;
        }
        if ((i3 & 3072) == 0) {
            q10 = q9;
            i10 |= c1700q.f(q10) ? 2048 : 1024;
        } else {
            q10 = q9;
        }
        int i12 = i10 | 24576;
        if ((196608 & i3) == 0) {
            eVar2 = eVar;
            i12 |= c1700q.h(eVar2) ? 131072 : 65536;
        } else {
            eVar2 = eVar;
        }
        if (c1700q.T(i12 & 1, (74899 & i12) != 74898)) {
            pVar2 = i11 != 0 ? p137q0.m.f26474b : pVar;
            p163t.y0 y0VarD = p163t.C0.d(java.lang.Boolean.valueOf(z6), "AnimatedVisibility", c1700q, (i12 & 14) | ((i12 >> 9) & 112));
            java.lang.Object objQ = c1700q.Q();
            if (objQ == p020c0.C1690l.f18284a) {
                objQ = p154s.C2717c.j;
                c1700q.n0(objQ);
            }
            int i13 = i12 << 3;
            d(y0VarD, (p194x6.j) objQ, pVar2, p9, q10, eVar2, c1700q, (i12 & 458752) | (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168));
            str2 = "AnimatedVisibility";
        } else {
            c1700q.W();
            pVar2 = pVar;
            str2 = str;
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p154s.C2732s(z6, pVar2, p2, q9, str2, eVar, i3, i9, 0);
        }
    }

    public static final void d(p163t.y0 y0Var, p194x6.j jVar, p137q0.p pVar, p154s.P p2, p154s.Q q9, p089k0.e eVar, p020c0.C1700q c1700q, int i3) {
        int i9;
        p154s.P p9;
        p154s.Q q10;
        p089k0.e eVar2;
        c1700q.e0(1706321816);
        if ((i3 & 6) == 0) {
            i9 = (c1700q.f(y0Var) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.h(jVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= c1700q.f(pVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            p9 = p2;
            i9 |= c1700q.f(p9) ? 2048 : 1024;
        } else {
            p9 = p2;
        }
        if ((i3 & 24576) == 0) {
            q10 = q9;
            i9 |= c1700q.f(q10) ? 16384 : 8192;
        } else {
            q10 = q9;
        }
        if ((i3 & 196608) == 0) {
            eVar2 = eVar;
            i9 |= c1700q.h(eVar2) ? 131072 : 65536;
        } else {
            eVar2 = eVar;
        }
        if (c1700q.T(i9 & 1, (74899 & i9) != 74898)) {
            int i10 = i9 & 112;
            int i11 = i9 & 14;
            boolean z6 = (i10 == 32) | (i11 == 4);
            java.lang.Object objQ = c1700q.Q();
            p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
            if (z6 || objQ == c1676e) {
                objQ = new p154s.C2733t(jVar, y0Var);
                c1700q.n0(objQ);
            }
            p137q0.p pVarK = O0.AbstractC0735y.k(pVar, (p194x6.n) objQ);
            java.lang.Object objQ2 = c1700q.Q();
            if (objQ2 == c1676e) {
                objQ2 = p154s.C2734u.f27187h;
                c1700q.n0(objQ2);
            }
            a(y0Var, jVar, pVarK, p9, q10, (p194x6.m) objQ2, eVar2, c1700q, 196608 | i11 | i10 | (i9 & 7168) | (57344 & i9) | ((i9 << 6) & 29360128));
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p154s.C2720f(y0Var, jVar, pVar, p2, q9, eVar, i3);
        }
    }

    public static final p181w0.c e(float f9, float f10, float f11, float f12, long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new p181w0.c(f9, f10, f11, f12, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void f(p166t3.i iVar, H0.b bVar, x.EnumC3061p0 enumC3061p0, H0.a aVar, A8.s sVar, long j) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j9;
        sVar.getClass();
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (bVar.f3835c >> 32));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (bVar.f3835c & 4294967295L));
        boolean z6 = bVar.f3836d;
        boolean z9 = bVar.f3839h;
        boolean z10 = !z9 && z6;
        java.util.ArrayList arrayList = sVar.f450b;
        if (z10) {
            sVar.f449a = 0;
            arrayList.clear();
        }
        if (!g(bVar) && (z9 || !z6)) {
            if (arrayList.size() == 3) {
                int i3 = sVar.f449a;
                sVar.f449a = i3 + 1;
                arrayList.set(i3, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (sVar.f449a == 3) {
                sVar.f449a = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList2.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (((H0.b) arrayList.get(i9)).f3835c >> 32))));
            }
            fIntBitsToFloat2 = (float) p078i6.o.Z0(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList3.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (((H0.b) arrayList.get(i10)).f3835c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) p078i6.o.Z0(arrayList3);
        }
        long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (enumC3061p0 != null) {
            int i11 = aVar.f3832a;
            if (i11 == 1) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
            } else if (i11 == 2) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
            }
            if (enumC3061p0 == x.EnumC3061p0.f30979i) {
                long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(0.0f);
                j9 = jFloatToRawIntBits3 << 32;
            } else {
                long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
                j9 = jFloatToRawIntBits4 << 32;
            }
            jFloatToRawIntBits2 = j9 | (jFloatToRawIntBits & 4294967295L);
        }
        ((L0.b) iVar.f27782i).a(bVar.f3834b, p181w0.a.g(jFloatToRawIntBits2, j));
    }

    public static final boolean g(H0.b bVar) {
        return bVar.f3839h && !bVar.f3836d;
    }

    public static void h(java.lang.String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        android.os.Trace.beginSection(str);
    }

    public static final java.lang.String i(java.util.List list) {
        java.lang.Object next;
        java.util.List listB0 = p078i6.p.B0(3, 2, 4, 6, 5, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            p070h6.k kVar = null;
            if (!it.hasNext()) {
                break;
            }
            com.kiptv.core.model.TMDBReleaseDate tMDBReleaseDate = (com.kiptv.core.model.TMDBReleaseDate) it.next();
            java.lang.String str = tMDBReleaseDate.f20277a;
            java.lang.String string = str != null ? O7.q.r1(str).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                java.lang.Integer num = tMDBReleaseDate.f20279c;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(listB0.indexOf(java.lang.Integer.valueOf(num != null ? num.intValue() : -1)));
                java.lang.Integer num2 = numValueOf.intValue() >= 0 ? numValueOf : null;
                kVar = new p070h6.k(java.lang.Integer.valueOf(num2 != null ? num2.intValue() : listB0.size()), string);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iIntValue = ((java.lang.Number) ((p070h6.k) next).f22539h).intValue();
                do {
                    java.lang.Object next2 = it2.next();
                    int iIntValue2 = ((java.lang.Number) ((p070h6.k) next2).f22539h).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        p070h6.k kVar2 = (p070h6.k) next;
        if (kVar2 != null) {
            return (java.lang.String) kVar2.f22540i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f7.b, p0.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [c0.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final java.util.List j(p020c0.N0 n3, java.lang.Integer num, int i3, java.lang.Integer num2) {
        int iE;
        int iS;
        p136q.D d4;
        if (n3.f18173w || n3.p() == 0) {
            return p078i6.w.f23205h;
        }
        ?? jVar = new p129p0.j(n3);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = n3.f18172v;
            if (iE < 0) {
                iE = n3.E(n3.f18154b, i3);
            }
        }
        if (num == 0) {
            int iN = n3.f18160i - n3.N(n3.f18154b, n3.r(i3));
            p136q.w wVar = n3.f18169s;
            num = java.lang.Integer.valueOf(iN + ((wVar == null || (d4 = (p136q.D) wVar.b(i3)) == null) ? 0 : d4.f26304b));
        }
        int iR = n3.r(i3) * 5;
        int[] iArr = n3.f18154b;
        if (iR < iArr.length) {
            iS = n3.s(i3);
        } else {
            int iE2 = iE >= 0 ? n3.E(iArr, iE) : iE;
            iS = n3.s(iE);
            int i9 = iE;
            iE = iE2;
            i3 = i9;
        }
        while (i3 >= 0) {
            jVar.d(iS, (n3.f18154b[(n3.r(i3) * 5) + 1] & androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? n3.t(i3) : p020c0.C1690l.f18284a, n3.O(i3), num);
            num = n3.b(i3);
            if (iE >= 0) {
                int iE3 = n3.E(n3.f18154b, iE);
                iS = n3.s(iE);
                int i10 = iE;
                iE = iE3;
                i3 = i10;
            } else {
                i3 = iE;
            }
        }
        return jVar.f21732h;
    }

    public static byte k(long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.N((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static final void l(java.io.Closeable closeable, java.lang.Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.AbstractC1903s.j(th, th2);
            }
        }
    }

    public static byte[] m(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jF = F(bArr, 0) & 67108863;
        int i3 = 3;
        long jF2 = (F(bArr, 3) >> 2) & 67108611;
        long jF3 = (F(bArr, 6) >> 4) & 67092735;
        long jF4 = (F(bArr, 9) >> 6) & 66076671;
        long jF5 = (F(bArr, 12) >> 8) & 1048575;
        long j = jF2 * 5;
        long j9 = jF3 * 5;
        long j10 = jF4 * 5;
        long j11 = jF5 * 5;
        byte[] bArr3 = new byte[17];
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        int i9 = 0;
        while (i9 < bArr2.length) {
            int iMin = java.lang.Math.min(16, bArr2.length - i9);
            java.lang.System.arraycopy(bArr2, i9, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                java.util.Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jF6 = j16 + (F(bArr3, 0) & 67108863);
            long jF7 = j12 + ((F(bArr3, i3) >> 2) & 67108863);
            long jF8 = j13 + ((F(bArr3, 6) >> 4) & 67108863);
            long jF9 = j14 + ((F(bArr3, 9) >> 6) & 67108863);
            long j17 = jF2;
            long jF10 = j15 + (((F(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j18 = (jF10 * j) + (jF9 * j9) + (jF8 * j10) + (jF7 * j11) + (jF6 * jF);
            long j19 = (jF10 * j9) + (jF9 * j10) + (jF8 * j11) + (jF7 * jF) + (jF6 * j17);
            long j20 = (jF10 * j10) + (jF9 * j11) + (jF8 * jF) + (jF7 * j17) + (jF6 * jF3);
            long j21 = (jF10 * j11) + (jF9 * jF) + (jF8 * j17) + (jF7 * jF3) + (jF6 * jF4);
            long j22 = jF9 * j17;
            long j23 = jF10 * jF;
            long j24 = j19 + (j18 >> 26);
            long j25 = j20 + (j24 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j23 + j22 + (jF8 * jF3) + (jF7 * jF4) + (jF6 * jF5) + (j26 >> 26);
            long j28 = j27 >> 26;
            j15 = j27 & 67108863;
            long j29 = (j28 * 5) + (j18 & 67108863);
            i9 += 16;
            j13 = j25 & 67108863;
            j14 = j26 & 67108863;
            j16 = j29 & 67108863;
            j12 = (j24 & 67108863) + (j29 >> 26);
            jF2 = j17;
            i3 = 3;
        }
        long j30 = j13 + (j12 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j14 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j15 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = ((j34 >> 26) * 5) + j16;
        long j37 = j36 >> 26;
        long j38 = j36 & 67108863;
        long j39 = (j12 & 67108863) + j37;
        long j40 = j38 + 5;
        long j41 = j40 & 67108863;
        long j42 = j39 + (j40 >> 26);
        long j43 = j31 + (j42 >> 26);
        long j44 = j33 + (j43 >> 26);
        long j45 = j44 & 67108863;
        long j46 = (j35 + (j44 >> 26)) - 67108864;
        long j47 = j46 >> 63;
        long j48 = j38 & j47;
        long j49 = j39 & j47;
        long j50 = j31 & j47;
        long j51 = j33 & j47;
        long j52 = j35 & j47;
        long j53 = ~j47;
        long j54 = j49 | (j42 & 67108863 & j53);
        long j55 = j50 | (j43 & 67108863 & j53);
        long j56 = j51 | (j45 & j53);
        long j57 = (j48 | (j41 & j53) | (j54 << 26)) & 4294967295L;
        long j58 = ((j54 >> 6) | (j55 << 20)) & 4294967295L;
        long j59 = ((j55 >> 12) | (j56 << 14)) & 4294967295L;
        long j60 = ((j56 >> 18) | ((j52 | (j46 & j53)) << 8)) & 4294967295L;
        long jF11 = F(bArr, 16) + j57;
        long j61 = jF11 & 4294967295L;
        long jF12 = F(bArr, 20) + j58 + (jF11 >> 32);
        long jF13 = F(bArr, 24) + j59 + (jF12 >> 32);
        long jF14 = (F(bArr, 28) + j60 + (jF13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        V(bArr4, 0, j61);
        V(bArr4, 4, jF12 & 4294967295L);
        V(bArr4, 8, jF13 & 4294967295L);
        V(bArr4, 12, jF14);
        return bArr4;
    }

    public static final java.util.ArrayList n(java.lang.String str, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String upperCase = ((java.lang.String) it.next()).toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            arrayList2.add(upperCase);
        }
        java.util.Set setR1 = p078i6.o.R1(arrayList2);
        java.util.List listB0 = p078i6.p.B0("US", "GB", "DE", "FR", "IT", "ES", "BR", "CA", "AU", "NL");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : listB0) {
            java.lang.String str2 = (java.lang.String) obj;
            if (setR1.contains(str2) && !kotlin.jvm.internal.m.a(str2, str)) {
                arrayList3.add(obj);
            }
        }
        return p078i6.o.A1(arrayList3, p078i6.o.H1(p078i6.I.m0(p078i6.I.n0(setR1, p078i6.o.R1(listB0)), str)));
    }

    public static android.os.Handler o(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return D1.AbstractC0225j.c(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.IllegalAccessException e6) {
            e = e6;
            android.util.Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.InstantiationException e9) {
            e = e9;
            android.util.Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.NoSuchMethodException e10) {
            e = e10;
            android.util.Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException e11) {
            java.lang.Throwable cause = e11.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static void p(p045e8.InterfaceC2120c interfaceC2120c, p045e8.a0 a0Var) {
        interfaceC2120c.h(new p063g8.c(new p045e8.C2141y(a0Var)));
    }

    public static final java.util.List q(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.size() < 2) {
            return list;
        }
        java.util.HashMap map = new java.util.HashMap(list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.kiptv.core.model.TMDBCastMember tMDBCastMember = (com.kiptv.core.model.TMDBCastMember) it.next();
            java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(tMDBCastMember.f20122a));
            if (num == null) {
                map.put(java.lang.Integer.valueOf(tMDBCastMember.f20122a), java.lang.Integer.valueOf(arrayList.size()));
                arrayList.add(tMDBCastMember);
            } else {
                java.lang.String strP = tMDBCastMember.f20124c;
                if (strP != null) {
                    java.lang.String str = null;
                    if (O7.q.N0(strP)) {
                        strP = null;
                    }
                    if (strP != null) {
                        java.lang.Object obj = arrayList.get(num.intValue());
                        kotlin.jvm.internal.m.d(obj, "get(...)");
                        com.kiptv.core.model.TMDBCastMember tMDBCastMember2 = (com.kiptv.core.model.TMDBCastMember) obj;
                        java.lang.String str2 = tMDBCastMember2.f20124c;
                        if (str2 != null && !O7.q.N0(str2)) {
                            str = str2;
                        }
                        int iIntValue = num.intValue();
                        if (str != null) {
                            strP = p121o0.p.p(str, " / ", strP);
                        }
                        java.lang.String str3 = strP;
                        java.lang.String name = tMDBCastMember2.f20123b;
                        kotlin.jvm.internal.m.e(name, "name");
                        arrayList.set(iIntValue, new com.kiptv.core.model.TMDBCastMember(tMDBCastMember2.f20122a, name, str3, tMDBCastMember2.f20125d, tMDBCastMember2.f20126e));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final java.lang.Integer r(p020c0.J0 j9, p020c0.AbstractC1709v abstractC1709v, int i3, int i9) {
        java.lang.Integer numR;
        while (true) {
            if (i3 >= i9) {
                return null;
            }
            int[] iArr = j9.f18123b;
            int i10 = iArr[(i3 * 5) + 3] + i3;
            if (j9.j(i3) && j9.i(i3) == 206 && kotlin.jvm.internal.m.a(j9.p(iArr, i3), p020c0.AbstractC1705t.f18367e)) {
                java.lang.Object objH = j9.h(i3, 0);
                p020c0.D0 d4 = objH instanceof p020c0.D0 ? (p020c0.D0) objH : null;
                p020c0.C0 c9 = d4 != null ? d4.f18104a : null;
                p020c0.C1694n c1694n = c9 instanceof p020c0.C1694n ? (p020c0.C1694n) c9 : null;
                if (c1694n != null && c1694n.f18287h.equals(abstractC1709v)) {
                    return java.lang.Integer.valueOf(i3);
                }
            }
            if (j9.d(i3) && (numR = r(j9, abstractC1709v, i3 + 1, i10)) != null) {
                return java.lang.Integer.valueOf(numR.intValue());
            }
            i3 = i10;
        }
    }

    public static java.lang.Object s(p100l6.f fVar, java.lang.Object obj, p194x6.m operation) {
        kotlin.jvm.internal.m.e(operation, "operation");
        return operation.invoke(obj, fVar);
    }

    public static p100l6.f t(p100l6.f fVar, p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        if (kotlin.jvm.internal.m.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static final E6.InterfaceC0331d u(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.m.e(annotation, "<this>");
        java.lang.Class<? extends java.lang.annotation.Annotation> clsAnnotationType = annotation.annotationType();
        kotlin.jvm.internal.m.d(clsAnnotationType, "annotationType(...)");
        return A(clsAnnotationType);
    }

    public static final float v(android.text.Layout layout, int i3, android.graphics.Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i3);
        java.lang.ThreadLocal threadLocal = p021c1.j.f18483a;
        if (layout.getEllipsisCount(i3) <= 0 || layout.getParagraphDirection(i3) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)) - lineLeft);
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment == null ? -1 : p039e1.d.f21340a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = java.lang.Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = java.lang.Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float w(android.text.Layout layout, int i3, android.graphics.Paint paint) {
        float width;
        float width2;
        java.lang.ThreadLocal threadLocal = p021c1.j.f18483a;
        if (layout.getEllipsisCount(i3) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i3) != -1 || layout.getWidth() >= layout.getLineRight(i3)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i3) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)));
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment != null ? p039e1.d.f21340a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final java.lang.Class x(E6.InterfaceC0331d interfaceC0331d) {
        kotlin.jvm.internal.m.e(interfaceC0331d, "<this>");
        java.lang.Class clsB = ((kotlin.jvm.internal.InterfaceC2539d) interfaceC0331d).b();
        kotlin.jvm.internal.m.c(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    public static final java.lang.Class y(E6.InterfaceC0331d interfaceC0331d) {
        kotlin.jvm.internal.m.e(interfaceC0331d, "<this>");
        java.lang.Class clsB = ((kotlin.jvm.internal.InterfaceC2539d) interfaceC0331d).b();
        if (!clsB.isPrimitive()) {
            return clsB;
        }
        java.lang.String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsB : java.lang.Double.class;
            case 104431:
                return !name.equals("int") ? clsB : java.lang.Integer.class;
            case 3039496:
                return !name.equals(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES) ? clsB : java.lang.Byte.class;
            case 3052374:
                return !name.equals("char") ? clsB : java.lang.Character.class;
            case 3327612:
                return !name.equals("long") ? clsB : java.lang.Long.class;
            case 3625364:
                return !name.equals("void") ? clsB : java.lang.Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsB : java.lang.Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsB : java.lang.Float.class;
            case 109413500:
                return !name.equals("short") ? clsB : java.lang.Short.class;
            default:
                return clsB;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Class z(E6.InterfaceC0331d interfaceC0331d) {
        kotlin.jvm.internal.m.e(interfaceC0331d, "<this>");
        java.lang.Class clsB = ((kotlin.jvm.internal.InterfaceC2539d) interfaceC0331d).b();
        if (clsB.isPrimitive()) {
            return clsB;
        }
        java.lang.String name = clsB.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return java.lang.Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return java.lang.Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return java.lang.Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return java.lang.Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return java.lang.Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return java.lang.Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return java.lang.Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return java.lang.Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return java.lang.Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }
}
