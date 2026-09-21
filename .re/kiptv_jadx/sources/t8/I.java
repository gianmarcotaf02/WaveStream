package t8;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends com.google.common.util.concurrent.P implements p162s8.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f28577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t8.N f28578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t8.AbstractC2851a f28579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v8.d f28580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28581f;
    public N6.A g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p162s8.j f28582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t8.t f28583i;

    public I(p162s8.d json, t8.N n3, t8.AbstractC2851a abstractC2851a, kotlinx.serialization.descriptors.SerialDescriptor descriptor, N6.A a2) {
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f28577b = json;
        this.f28578c = n3;
        this.f28579d = abstractC2851a;
        this.f28580e = json.f27389b;
        this.f28581f = -1;
        this.g = a2;
        p162s8.j jVar = json.f27388a;
        this.f28582h = jVar;
        this.f28583i = jVar.f27411e ? null : new t8.t(descriptor);
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final short A() {
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        long jI = abstractC2851a.i();
        short s9 = (short) jI;
        if (jI == s9) {
            return s9;
        }
        t8.AbstractC2851a.r(abstractC2851a, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final float B() {
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        java.lang.String strL = abstractC2851a.l();
        try {
            float f9 = java.lang.Float.parseFloat(strL);
            if (this.f28577b.f27388a.f27414i || !(java.lang.Float.isInfinite(f9) || java.lang.Float.isNaN(f9))) {
                return f9;
            }
            t8.x.u(abstractC2851a, java.lang.Float.valueOf(f9));
            throw null;
        } catch (java.lang.IllegalArgumentException unused) {
            t8.AbstractC2851a.r(abstractC2851a, B2.a.i('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final double E() {
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        java.lang.String strL = abstractC2851a.l();
        try {
            double d4 = java.lang.Double.parseDouble(strL);
            if (this.f28577b.f27388a.f27414i || !(java.lang.Double.isInfinite(d4) || java.lang.Double.isNaN(d4))) {
                return d4;
            }
            t8.x.u(abstractC2851a, java.lang.Double.valueOf(d4));
            throw null;
        } catch (java.lang.IllegalArgumentException unused) {
            t8.AbstractC2851a.r(abstractC2851a, B2.a.i('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // com.google.common.util.concurrent.P, p143q8.a
    public final void a(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        int iF = descriptor.f();
        p162s8.d dVar = this.f28577b;
        if (iF == 0 && t8.x.o(descriptor, dVar)) {
            while (s(descriptor) != -1) {
            }
        }
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        if (abstractC2851a.B()) {
            p162s8.j jVar = dVar.f27388a;
            t8.x.p(abstractC2851a, "");
            throw null;
        }
        abstractC2851a.h(this.f28578c.f28602i);
        B8.h hVar = abstractC2851a.f28604b;
        int i3 = hVar.f861i;
        int[] iArr = (int[]) hVar.f862k;
        if (iArr[i3] == -2) {
            iArr[i3] = -1;
            hVar.f861i = i3 - 1;
        }
        int i9 = hVar.f861i;
        if (i9 != -1) {
            hVar.f861i = i9 - 1;
        }
    }

    @Override // p143q8.a
    public final v8.e b() {
        return this.f28580e;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final p143q8.a c(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        p162s8.d dVar = this.f28577b;
        t8.N nT = t8.x.t(descriptor, dVar);
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        B8.h hVar = abstractC2851a.f28604b;
        int i3 = hVar.f861i + 1;
        hVar.f861i = i3;
        java.lang.Object[] objArr = (java.lang.Object[]) hVar.j;
        if (i3 == objArr.length) {
            int i9 = i3 * 2;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, i9);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            hVar.j = objArrCopyOf;
            int[] iArrCopyOf = java.util.Arrays.copyOf((int[]) hVar.f862k, i9);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            hVar.f862k = iArrCopyOf;
        }
        ((java.lang.Object[]) hVar.j)[i3] = descriptor;
        abstractC2851a.h(nT.f28601h);
        if (abstractC2851a.w() == 4) {
            t8.AbstractC2851a.r(abstractC2851a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = nT.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new t8.I(this.f28577b, nT, abstractC2851a, descriptor, this.g);
        }
        if (this.f28578c == nT && dVar.f27388a.f27411e) {
            return this;
        }
        return new t8.I(this.f28577b, nT, abstractC2851a, descriptor, this.g);
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final boolean e() {
        boolean z6;
        boolean z9;
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        int iZ = abstractC2851a.z();
        if (iZ == abstractC2851a.t().length()) {
            t8.AbstractC2851a.r(abstractC2851a, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC2851a.t().charAt(iZ) == '\"') {
            iZ++;
            z6 = true;
        } else {
            z6 = false;
        }
        int iY = abstractC2851a.y(iZ);
        if (iY >= abstractC2851a.t().length() || iY == -1) {
            t8.AbstractC2851a.r(abstractC2851a, "EOF", 0, null, 6);
            throw null;
        }
        int i3 = iY + 1;
        int iCharAt = abstractC2851a.t().charAt(iY) | ' ';
        if (iCharAt == 102) {
            abstractC2851a.d(i3, "alse");
            z9 = false;
        } else {
            if (iCharAt != 116) {
                t8.AbstractC2851a.r(abstractC2851a, "Expected valid boolean literal prefix, but had '" + abstractC2851a.l() + '\'', 0, null, 6);
                throw null;
            }
            abstractC2851a.d(i3, "rue");
            z9 = true;
        }
        if (!z6) {
            return z9;
        }
        if (abstractC2851a.f28603a == abstractC2851a.t().length()) {
            t8.AbstractC2851a.r(abstractC2851a, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC2851a.t().charAt(abstractC2851a.f28603a) == '\"') {
            abstractC2851a.f28603a++;
            return z9;
        }
        t8.AbstractC2851a.r(abstractC2851a, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final char f() {
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        java.lang.String strL = abstractC2851a.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        t8.AbstractC2851a.r(abstractC2851a, B2.a.i('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final int g(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        return t8.x.n(enumDescriptor, this.f28577b, m(), " at path " + this.f28579d.f28604b.e());
    }

    @Override // p162s8.k
    public final kotlinx.serialization.json.b i() {
        p162s8.j jVar = this.f28577b.f27388a;
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        Y2.C1038h c1038h = new Y2.C1038h();
        c1038h.f11470c = abstractC2851a;
        c1038h.f11469b = jVar.f27409c;
        return c1038h.j();
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final int j() {
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        long jI = abstractC2851a.i();
        int i3 = (int) jI;
        if (jI == i3) {
            return i3;
        }
        t8.AbstractC2851a.r(abstractC2851a, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final java.lang.String m() {
        p162s8.j jVar = this.f28582h;
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        return jVar.f27409c ? abstractC2851a.m() : abstractC2851a.j();
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final long n() {
        return this.f28579d.i();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0124, please report this as an issue */
    @Override // kotlinx.serialization.encoding.Decoder
    public final java.lang.Object p(kotlinx.serialization.KSerializer deserializer) {
        java.lang.String message;
        p162s8.d dVar = this.f28577b;
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        B8.h hVar = abstractC2851a.f28604b;
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof p153r8.AbstractC2687b)) {
                return deserializer.deserialize(this);
            }
            p162s8.j jVar = dVar.f27388a;
            java.lang.String strJ = t8.x.j(((p153r8.AbstractC2687b) deserializer).getDescriptor(), dVar);
            java.lang.String strV = abstractC2851a.v(strJ, this.f28582h.f27409c);
            java.lang.String strD = null;
            if (strV != null) {
                try {
                    kotlinx.serialization.KSerializer kSerializerT = com.google.common.util.concurrent.AbstractC1903s.t((p153r8.AbstractC2687b) deserializer, this, strV);
                    N6.A a2 = new N6.A(6);
                    a2.f7359i = strJ;
                    this.g = a2;
                    return kSerializerT.deserialize(this);
                } catch (p119n8.j e6) {
                    java.lang.String message2 = e6.getMessage();
                    kotlin.jvm.internal.m.b(message2);
                    java.lang.String strW0 = O7.q.W0(O7.q.l1(message2, '\n'), ".");
                    java.lang.String message3 = e6.getMessage();
                    kotlin.jvm.internal.m.b(message3);
                    t8.AbstractC2851a.r(abstractC2851a, strW0, 0, O7.q.i1('\n', message3, ""), 2);
                    throw null;
                }
            }
            if (!(deserializer instanceof p153r8.AbstractC2687b)) {
                return deserializer.deserialize(this);
            }
            p162s8.j jVar2 = dVar.f27388a;
            java.lang.String strJ2 = t8.x.j(((p153r8.AbstractC2687b) deserializer).getDescriptor(), dVar);
            kotlinx.serialization.json.b bVarI = i();
            java.lang.String strA = ((p153r8.AbstractC2687b) deserializer).getDescriptor().a();
            if (!(bVarI instanceof kotlinx.serialization.json.c)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
                kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
                sb.append(c9.b(kotlinx.serialization.json.c.class).h());
                sb.append(", but had ");
                sb.append(c9.b(bVarI.getClass()).h());
                sb.append(" as the serialized body of ");
                sb.append(strA);
                sb.append(" at element: ");
                sb.append(hVar.e());
                throw t8.x.d(sb.toString(), bVarI.toString(), -1);
            }
            kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) bVarI;
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(strJ2);
            if (bVar != null) {
                kotlinx.serialization.json.d dVarJ = p162s8.l.j(bVar);
                if (!(dVarJ instanceof kotlinx.serialization.json.JsonNull)) {
                    strD = dVarJ.d();
                }
            }
            try {
                return t8.x.s(dVar, strJ2, cVar, com.google.common.util.concurrent.AbstractC1903s.t((p153r8.AbstractC2687b) deserializer, this, strD));
            } catch (p119n8.j e9) {
                java.lang.String message4 = e9.getMessage();
                kotlin.jvm.internal.m.b(message4);
                throw t8.x.d(message4, cVar.toString(), -1);
            }
            message = e.getMessage();
            kotlin.jvm.internal.m.b(message);
            if (O7.q.B0(message, "at path", false)) {
                throw e;
            }
            throw new p119n8.b(e.f25937h, e.getMessage() + " at path: " + hVar.e(), e);
        } catch (p119n8.b e10) {
            message = e10.getMessage();
            kotlin.jvm.internal.m.b(message);
            if (O7.q.B0(message, "at path", false)) {
                throw e10;
            }
            throw new p119n8.b(e10.f25937h, e10.getMessage() + " at path: " + hVar.e(), e10);
        }
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final boolean r() {
        t8.t tVar = this.f28583i;
        return ((tVar != null ? tVar.f28638b : false) || this.f28579d.C(true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x02ef A[EDGE_INSN: B:175:0x02ef->B:176:0x02f0 BREAK  A[LOOP:2: B:158:0x028e->B:203:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p143q8.a
    public final int s(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        boolean z6;
        boolean z9;
        char c9;
        java.lang.String strX;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        t8.N n3 = this.f28578c;
        int iOrdinal = n3.ordinal();
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        boolean z10 = true;
        int i3 = -1;
        int i9 = 0;
        zB = false;
        boolean zB = false;
        char c10 = ':';
        p162s8.d dVar = this.f28577b;
        B8.h hVar = abstractC2851a.f28604b;
        if (iOrdinal == 0) {
            boolean zB2 = abstractC2851a.B();
            while (true) {
                boolean zC = abstractC2851a.c();
                t8.t tVar = this.f28583i;
                if (zC) {
                    p162s8.j jVar = this.f28582h;
                    boolean z11 = jVar.f27409c;
                    int i10 = i3;
                    java.lang.String strM = z11 ? abstractC2851a.m() : abstractC2851a.e();
                    abstractC2851a.h(c10);
                    int iM = t8.x.m(descriptor, dVar, strM);
                    if (iM != -3) {
                        if (jVar.g) {
                            boolean zJ = descriptor.j(iM);
                            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptorI = descriptor.i(iM);
                            if (zJ && !serialDescriptorI.d() && abstractC2851a.C(z10)) {
                                z6 = z10;
                            } else {
                                z6 = z10;
                                if (kotlin.jvm.internal.m.a(serialDescriptorI.c(), p135p8.i.f26282f) && ((!serialDescriptorI.d() || !abstractC2851a.C(false)) && (strX = abstractC2851a.x(z11)) != null)) {
                                    int iM2 = t8.x.m(serialDescriptorI, dVar, strX);
                                    boolean z12 = (dVar.f27388a.f27411e || !serialDescriptorI.d()) ? false : z6;
                                    if (iM2 == -3 && (zJ || z12)) {
                                        abstractC2851a.j();
                                    }
                                }
                            }
                            zB2 = abstractC2851a.B();
                            z10 = false;
                        }
                        if (tVar != null) {
                            p153r8.C2711w c2711w = tVar.f28637a;
                            if (iM < 64) {
                                c2711w.f27013c |= 1 << iM;
                            } else {
                                int i11 = (iM >>> 6) - 1;
                                long[] jArr = c2711w.f27014d;
                                jArr[i11] = jArr[i11] | (1 << (iM & 63));
                            }
                        }
                        i3 = iM;
                    } else {
                        z6 = z10;
                        zB2 = false;
                    }
                    if (z10) {
                        if (!t8.x.o(descriptor, dVar)) {
                            N6.A a2 = this.g;
                            if (a2 == null || !kotlin.jvm.internal.m.a(a2.f7359i, strM)) {
                                int i12 = hVar.f861i;
                                int[] iArr = (int[]) hVar.f862k;
                                if (iArr[i12] == -2) {
                                    iArr[i12] = i10;
                                    hVar.f861i = i12 - 1;
                                }
                                int i13 = hVar.f861i;
                                if (i13 != i10) {
                                    hVar.f861i = i13 + i10;
                                }
                                int iP0 = O7.q.P0(0, 6, abstractC2851a.A(0, abstractC2851a.f28603a), strM);
                                throw new t8.s("Encountered an unknown key '" + strM + "' at offset " + iP0 + " at path: " + hVar.e() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) t8.x.q(abstractC2851a.t(), iP0)));
                            }
                            a2.f7359i = null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        byte bW = abstractC2851a.w();
                        if (bW == 8 || bW == 6) {
                            while (true) {
                                byte bW2 = abstractC2851a.w();
                                z9 = z6;
                                if (bW2 != z9) {
                                    c9 = 6;
                                    if (bW2 == 8 || bW2 == 6) {
                                        arrayList.add(java.lang.Byte.valueOf(bW2));
                                    } else {
                                        if (bW2 == 9) {
                                            if (((java.lang.Number) p078i6.o.q1(arrayList)).byteValue() != 8) {
                                                throw t8.x.d("found ] instead of } at path: " + hVar, abstractC2851a.t(), abstractC2851a.f28603a);
                                            }
                                            p078i6.u.T0(arrayList);
                                        } else if (bW2 == 7) {
                                            if (((java.lang.Number) p078i6.o.q1(arrayList)).byteValue() != 6) {
                                                throw t8.x.d("found } instead of ] at path: " + hVar, abstractC2851a.t(), abstractC2851a.f28603a);
                                            }
                                            p078i6.u.T0(arrayList);
                                        } else if (bW2 == 10) {
                                            t8.AbstractC2851a.r(abstractC2851a, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c9 = 6;
                                    }
                                    abstractC2851a.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z11) {
                                    abstractC2851a.l();
                                } else {
                                    abstractC2851a.e();
                                }
                                z6 = z9;
                            }
                        } else {
                            abstractC2851a.l();
                            z9 = z6;
                            c9 = 6;
                        }
                        zB2 = abstractC2851a.B();
                        i3 = i10;
                        z10 = z9;
                    } else {
                        i3 = i10;
                        z10 = z6;
                    }
                    c10 = ':';
                } else {
                    int i14 = i3;
                    if (!zB2) {
                        if (tVar == null) {
                            i3 = i14;
                            break;
                        }
                        p153r8.C2711w c2711w2 = tVar.f28637a;
                        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = c2711w2.f27011a;
                        int iF = serialDescriptor.f();
                        while (true) {
                            long j = c2711w2.f27013c;
                            long j9 = -1;
                            D7.t tVar2 = c2711w2.f27012b;
                            if (j == -1) {
                                if (iF <= 64) {
                                    i3 = i14;
                                    break;
                                }
                                long[] jArr2 = c2711w2.f27014d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (i9 >= length) {
                                        i3 = i14;
                                        break;
                                    }
                                    int i15 = i9 + 1;
                                    int i16 = i15 * 64;
                                    long j10 = jArr2[i9];
                                    while (true) {
                                        if (j10 != j9) {
                                            int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(~j10);
                                            j10 |= 1 << iNumberOfTrailingZeros;
                                            int i17 = iNumberOfTrailingZeros + i16;
                                            if (((java.lang.Boolean) tVar2.invoke(serialDescriptor, java.lang.Integer.valueOf(i17))).booleanValue()) {
                                                jArr2[i9] = j10;
                                                i3 = i17;
                                                break;
                                            }
                                            j9 = -1;
                                        } else {
                                            jArr2[i9] = j10;
                                            i9 = i15;
                                            j9 = -1;
                                        }
                                    }
                                }
                            } else {
                                int iNumberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(~j);
                                c2711w2.f27013c |= 1 << iNumberOfTrailingZeros2;
                                if (((java.lang.Boolean) tVar2.invoke(serialDescriptor, java.lang.Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                    i3 = iNumberOfTrailingZeros2;
                                    break;
                                }
                            }
                        }
                    } else {
                        p162s8.j jVar2 = dVar.f27388a;
                        t8.x.p(abstractC2851a, "object");
                        throw null;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zB3 = abstractC2851a.B();
            if (abstractC2851a.c()) {
                int i18 = this.f28581f;
                if (i18 != -1 && !zB3) {
                    t8.AbstractC2851a.r(abstractC2851a, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i3 = i18 + 1;
                this.f28581f = i3;
            } else if (zB3) {
                p162s8.j jVar3 = dVar.f27388a;
                t8.x.p(abstractC2851a, "array");
                throw null;
            }
        } else {
            int i19 = this.f28581f;
            java.lang.Object[] objArr = i19 % 2 != 0;
            if (objArr != true) {
                abstractC2851a.h(':');
            } else if (i19 != -1) {
                zB = abstractC2851a.B();
            }
            if (abstractC2851a.c()) {
                if (objArr != false) {
                    if (this.f28581f == -1) {
                        int i20 = abstractC2851a.f28603a;
                        if (zB) {
                            t8.AbstractC2851a.r(abstractC2851a, "Unexpected leading comma", i20, null, 4);
                            throw null;
                        }
                    } else {
                        int i21 = abstractC2851a.f28603a;
                        if (!zB) {
                            t8.AbstractC2851a.r(abstractC2851a, "Expected comma after the key-value pair", i21, null, 4);
                            throw null;
                        }
                    }
                }
                i3 = this.f28581f + 1;
                this.f28581f = i3;
            } else if (zB) {
                p162s8.j jVar4 = dVar.f27388a;
                t8.x.p(abstractC2851a, "object");
                throw null;
            }
        }
        if (n3 != t8.N.MAP) {
            ((int[]) hVar.f862k)[hVar.f861i] = i3;
        }
        return i3;
    }

    @Override // p162s8.k
    public final p162s8.d t() {
        return this.f28577b;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final kotlinx.serialization.encoding.Decoder v(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return t8.K.a(descriptor) ? new t8.r(this.f28579d, this.f28577b) : this;
    }

    @Override // com.google.common.util.concurrent.P, p143q8.a
    public final java.lang.Object x(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3, kotlinx.serialization.KSerializer deserializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        boolean z6 = this.f28578c == t8.N.MAP && (i3 & 1) == 0;
        B8.h hVar = this.f28579d.f28604b;
        if (z6) {
            int[] iArr = (int[]) hVar.f862k;
            int i9 = hVar.f861i;
            if (iArr[i9] == -2) {
                ((java.lang.Object[]) hVar.j)[i9] = t8.y.f28646a;
            }
        }
        java.lang.Object objX = super.x(descriptor, i3, deserializer, obj);
        if (z6) {
            int[] iArr2 = (int[]) hVar.f862k;
            int i10 = hVar.f861i;
            if (iArr2[i10] != -2) {
                int i11 = i10 + 1;
                hVar.f861i = i11;
                java.lang.Object[] objArr = (java.lang.Object[]) hVar.j;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, i12);
                    kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    hVar.j = objArrCopyOf;
                    int[] iArrCopyOf = java.util.Arrays.copyOf((int[]) hVar.f862k, i12);
                    kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
                    hVar.f862k = iArrCopyOf;
                }
            }
            java.lang.Object[] objArr2 = (java.lang.Object[]) hVar.j;
            int i13 = hVar.f861i;
            objArr2[i13] = objX;
            ((int[]) hVar.f862k)[i13] = -2;
        }
        return objX;
    }

    @Override // com.google.common.util.concurrent.P, kotlinx.serialization.encoding.Decoder
    public final byte z() {
        t8.AbstractC2851a abstractC2851a = this.f28579d;
        long jI = abstractC2851a.i();
        byte b9 = (byte) jI;
        if (jI == b9) {
            return b9;
        }
        t8.AbstractC2851a.r(abstractC2851a, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }
}
