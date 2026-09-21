package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19293b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19294c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19295d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f19296e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19297a;

    public /* synthetic */ V0(int i3) {
        this.f19297a = i3;
    }

    public static final byte[] A(java.io.InputStream inputStream) throws java.io.IOException {
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        p(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.m.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final boolean B(p136q.H h9, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objG = h9.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof p136q.I)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            h9.k(obj);
            return true;
        }
        p136q.I i3 = (p136q.I) objG;
        boolean zL = i3.l(obj2);
        if (zL && i3.g()) {
            h9.k(obj);
        }
        return zL;
    }

    public static final void C(p136q.H h9, java.lang.Object obj) {
        boolean zG;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        java.lang.Object obj2 = h9.f26323b[i11];
                        java.lang.Object obj3 = h9.f26324c[i11];
                        if (obj3 instanceof p136q.I) {
                            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            p136q.I i12 = (p136q.I) obj3;
                            i12.l(obj);
                            zG = i12.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            h9.l(i11);
                        }
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public static final long D(long j) {
        int iRound = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        return (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object E(int i3, java.lang.Object obj, p048f1.y yVar, p048f1.s sVar, int i9) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        if (!(obj instanceof android.graphics.Typeface)) {
            return obj;
        }
        boolean z6 = false;
        int i10 = 0;
        z6 = false;
        if ((i3 & 1) == 0 || kotlin.jvm.internal.m.a(yVar.f21679b, sVar)) {
            objArr = false;
        } else {
            p048f1.s sVar2 = p048f1.s.f21667k;
            if (sVar.compareTo(sVar2) < 0 || kotlin.jvm.internal.m.f(yVar.f21679b.f21672h, sVar2.f21672h) >= 0) {
                objArr = false;
            } else {
                objArr = true;
            }
        }
        if ((i3 & 2) != 0) {
            yVar.getClass();
            if (i9 == 0) {
                objArr2 = false;
            } else {
                objArr2 = true;
            }
        } else {
            objArr2 = false;
        }
        if (objArr2 != true && objArr != true) {
            return obj;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            int i11 = objArr != false ? sVar.f21672h : yVar.f21679b.f21672h;
            if (objArr2 != true) {
                yVar.getClass();
            } else if (i9 == 1) {
                z6 = true;
            }
            return android.graphics.Typeface.create((android.graphics.Typeface) obj, i11, z6);
        }
        java.lang.Object[] objArr3 = objArr2 == true && i9 == 1;
        if (objArr3 == true && objArr == true) {
            i10 = 3;
        } else if (objArr == true) {
            i10 = 1;
        } else if (objArr3 != false) {
            i10 = 2;
        }
        return android.graphics.Typeface.create((android.graphics.Typeface) obj, i10);
    }

    public static final android.view.inputmethod.ExtractedText F(g1.x xVar) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        java.lang.String str = xVar.f21847a.f17809i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = xVar.f21848b;
        extractedText.selectionStart = p011b1.L.f(j);
        extractedText.selectionEnd = p011b1.L.e(j);
        extractedText.flags = !O7.q.C0(xVar.f21847a.f17809i, '\n') ? 1 : 0;
        return extractedText;
    }

    public static p118n7.g G(p194x6.j changeOptions) {
        kotlin.jvm.internal.m.e(changeOptions, "changeOptions");
        p118n7.k kVar = new p118n7.k();
        changeOptions.invoke(kVar);
        kVar.f25903a = true;
        return new p118n7.g(kVar);
    }

    public static /* synthetic */ boolean H(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.I1 i3, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(i3) != obj && atomicReferenceFieldUpdater.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final p153r8.C2691d a(kotlinx.serialization.KSerializer elementSerializer) {
        kotlin.jvm.internal.m.e(elementSerializer, "elementSerializer");
        return new p153r8.C2691d(elementSerializer, 0);
    }

    public static final p153r8.F b(kotlinx.serialization.KSerializer keySerializer, kotlinx.serialization.KSerializer valueSerializer) {
        kotlin.jvm.internal.m.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.m.e(valueSerializer, "valueSerializer");
        return new p153r8.F(keySerializer, valueSerializer, 1);
    }

    public static final p181w0.b c(long j, long j9) {
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        return new p181w0.b(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat((int) (j9 >> 32)) + java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) + java.lang.Float.intBitsToFloat(i9));
    }

    public static final void d(p136q.H h9, java.lang.Object obj, java.lang.Object obj2) {
        int iF = h9.f(obj);
        boolean z6 = iF < 0;
        java.lang.Object obj3 = z6 ? null : h9.f26324c[iF];
        if (obj3 != null) {
            if (obj3 instanceof p136q.I) {
                ((p136q.I) obj3).a(obj2);
            } else if (obj3 != obj2) {
                p136q.I i3 = new p136q.I();
                i3.a(obj3);
                i3.a(obj2);
                obj2 = i3;
            }
            obj2 = obj3;
        }
        if (!z6) {
            h9.f26324c[iF] = obj2;
            return;
        }
        int i9 = ~iF;
        h9.f26323b[i9] = obj;
        h9.f26324c[i9] = obj2;
    }

    public static void e(p045e8.InterfaceC2119b interfaceC2119b, p194x6.j[] otherFormats, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(otherFormats, "otherFormats");
        java.util.ArrayList arrayList = new java.util.ArrayList(otherFormats.length);
        for (p194x6.j jVar2 : otherFormats) {
            p045e8.InterfaceC2119b interfaceC2119bQ = interfaceC2119b.q();
            jVar2.invoke(interfaceC2119bQ);
            arrayList.add(new p063g8.f(interfaceC2119bQ.a().f12900b));
        }
        p045e8.InterfaceC2119b interfaceC2119bQ2 = interfaceC2119b.q();
        jVar.invoke(interfaceC2119bQ2);
        interfaceC2119b.a().b(new p063g8.b(new p063g8.f(interfaceC2119bQ2.a().f12900b), arrayList));
    }

    public static void f(p045e8.InterfaceC2119b interfaceC2119b, java.lang.String str, p194x6.j jVar) {
        Z2.C1202m c1202mA = interfaceC2119b.a();
        p045e8.InterfaceC2119b interfaceC2119bQ = interfaceC2119b.q();
        jVar.invoke(interfaceC2119bQ);
        c1202mA.b(new p063g8.p(str, new p063g8.f(interfaceC2119bQ.a().f12900b)));
    }

    public static p063g8.d h(p045e8.InterfaceC2119b interfaceC2119b) {
        java.util.ArrayList formats = interfaceC2119b.a().f12900b;
        kotlin.jvm.internal.m.e(formats, "formats");
        return new p063g8.d(formats);
    }

    public static final android.os.Bundle i(p070h6.k... kVarArr) {
        android.os.Bundle bundle = new android.os.Bundle(kVarArr.length);
        for (p070h6.k kVar : kVarArr) {
            java.lang.String str = (java.lang.String) kVar.f22539h;
            java.lang.Object obj = kVar.f22540i;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Number) obj).byteValue());
            } else if (obj instanceof java.lang.Character) {
                bundle.putChar(str, ((java.lang.Character) obj).charValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Number) obj).floatValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Short) {
                bundle.putShort(str, ((java.lang.Number) obj).shortValue());
            } else if (obj instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) obj);
            } else if (obj instanceof java.lang.CharSequence) {
                bundle.putCharSequence(str, (java.lang.CharSequence) obj);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.m.b(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (android.os.Parcelable[]) obj);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (java.lang.String[]) obj);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (java.lang.CharSequence[]) obj);
                } else {
                    if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                        throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (java.io.Serializable) obj);
                }
            } else if (obj instanceof java.io.Serializable) {
                bundle.putSerializable(str, (java.io.Serializable) obj);
            } else if (obj instanceof android.os.IBinder) {
                bundle.putBinder(str, (android.os.IBinder) obj);
            } else if (obj instanceof android.util.Size) {
                bundle.putSize(str, (android.util.Size) obj);
            } else {
                if (!(obj instanceof android.util.SizeF)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (android.util.SizeF) obj);
            }
        }
        return bundle;
    }

    public static void j(p045e8.InterfaceC2119b interfaceC2119b, java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        interfaceC2119b.a().b(new p063g8.h(value));
    }

    public static final p080i8.p k(java.util.List list) {
        p078i6.w wVar = p078i6.w.f23205h;
        p080i8.p pVar = new p080i8.p(wVar, wVar);
        if (!list.isEmpty()) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                pVar = m((p080i8.p) listIterator.previous(), pVar);
            }
        }
        return n(pVar, wVar);
    }

    public static long[] l(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i3 = (int) length;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.N(length == ((long) i3), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i3];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            java.lang.System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static final p080i8.p m(p080i8.p pVar, p080i8.p pVar2) {
        boolean zIsEmpty = pVar.f23276b.isEmpty();
        java.util.List list = pVar.f23275a;
        if (zIsEmpty) {
            return new p080i8.p(p078i6.o.A1(list, pVar2.f23275a), pVar2.f23276b);
        }
        java.util.List list2 = pVar.f23276b;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m((p080i8.p) it.next(), pVar2));
        }
        return new p080i8.p(list, arrayList);
    }

    public static final p080i8.p n(p080i8.p pVar, java.util.List list) {
        java.util.List listI0;
        java.util.List listI1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayListO1 = p078i6.o.O1(list);
        java.util.ArrayList arrayListO2 = null;
        for (p080i8.o oVar : pVar.f23275a) {
            if (oVar instanceof p080i8.h) {
                if (arrayListO2 != null) {
                    arrayListO2.addAll(((p080i8.h) oVar).f23264a);
                } else {
                    arrayListO2 = p078i6.o.O1(((p080i8.h) oVar).f23264a);
                }
            } else if (oVar instanceof p080i8.w) {
                arrayListO1.add(oVar);
            } else {
                if (arrayListO2 != null) {
                    arrayList.add(new p080i8.h(arrayListO2));
                    arrayListO2 = null;
                }
                arrayList.add(oVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = pVar.f23276b.iterator();
        while (it.hasNext()) {
            p080i8.p pVarN = n((p080i8.p) it.next(), arrayListO1);
            if (pVarN.f23275a.isEmpty()) {
                listI1 = pVarN.f23276b;
                if (listI1.isEmpty()) {
                    listI1 = com.google.common.util.concurrent.P.i0(pVarN);
                }
            } else {
                listI1 = com.google.common.util.concurrent.P.i0(pVarN);
            }
            p078i6.u.M0(arrayList2, listI1);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        java.util.List<p080i8.p> list2 = arrayList2;
        if (zIsEmpty) {
            listI0 = com.google.common.util.concurrent.P.i0(new p080i8.p(arrayListO1, p078i6.w.f23205h));
        }
        if (arrayListO2 == null) {
            list2 = listI0;
            return new p080i8.p(arrayList, list2);
        }
        if (!list2.isEmpty()) {
            list2 = listI0;
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                p080i8.o oVar2 = (p080i8.o) p078i6.o.j1(((p080i8.p) it2.next()).f23275a);
                if (oVar2 != null && (oVar2 instanceof p080i8.h)) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(list2, 10));
                    for (p080i8.p pVar2 : list2) {
                        p080i8.o oVar3 = (p080i8.o) p078i6.o.j1(pVar2.f23275a);
                        boolean z6 = oVar3 instanceof p080i8.h;
                        java.util.List list3 = pVar2.f23275a;
                        java.util.List list4 = pVar2.f23276b;
                        arrayList3.add(z6 ? new p080i8.p(p078i6.o.A1(com.google.common.util.concurrent.P.i0(new p080i8.h(p078i6.o.A1(arrayListO2, ((p080i8.h) oVar3).f23264a))), p078i6.o.d1(list3, 1)), list4) : oVar3 == null ? new p080i8.p(com.google.common.util.concurrent.P.i0(new p080i8.h(arrayListO2)), list4) : new p080i8.p(p078i6.o.A1(com.google.common.util.concurrent.P.i0(new p080i8.h(arrayListO2)), list3), list4));
                    }
                    return new p080i8.p(arrayList, arrayList3);
                }
            }
        }
        list2 = listI0;
        arrayList.add(new p080i8.h(arrayListO2));
        return new p080i8.p(arrayList, list2);
    }

    public static p136q.H o() {
        long[] jArr = p136q.P.f26351a;
        return new p136q.H();
    }

    public static final long p(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i3) throws java.io.IOException {
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        byte[] bArr = new byte[i3];
        int i9 = inputStream.read(bArr);
        long j = 0;
        while (i9 >= 0) {
            outputStream.write(bArr, 0, i9);
            j += (long) i9;
            i9 = inputStream.read(bArr);
        }
        return j;
    }

    public static void q(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.String strT = t(str);
        if (android.util.Log.isLoggable(strT, 3)) {
            android.util.Log.d(strT, java.lang.String.format(str2, obj));
        }
    }

    public static void r(java.lang.Exception exc, java.lang.String str, java.lang.String str2) {
        java.lang.String strT = t(str);
        if (android.util.Log.isLoggable(strT, 6)) {
            android.util.Log.e(strT, str2, exc);
        }
    }

    public static final kotlinx.serialization.KSerializer s(kotlinx.serialization.KSerializer kSerializer) {
        kotlin.jvm.internal.m.e(kSerializer, "<this>");
        return kSerializer.getDescriptor().d() ? kSerializer : new p153r8.Y(kSerializer);
    }

    public static java.lang.String t(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        java.lang.String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static java.lang.String u() {
        java.lang.String country = java.util.Locale.getDefault().getCountry();
        kotlin.jvm.internal.m.d(country, "getCountry(...)");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = country.toUpperCase(locale);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 0 && X4.c.a(upperCase)) {
            return upperCase;
        }
        p015b5.t.Companion.getClass();
        java.lang.String country2 = p015b5.p.a().getCountry();
        kotlin.jvm.internal.m.d(country2, "getCountry(...)");
        java.lang.String upperCase2 = country2.toUpperCase(locale);
        kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
        if (upperCase2.length() <= 0 || !X4.c.a(upperCase2)) {
            return upperCase.length() == 0 ? "US" : upperCase;
        }
        return upperCase2;
    }

    public static int v(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void w(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        throw new java.lang.IllegalArgumentException(Y6.f.h("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static p068h4.v x(p068h4.v vVar) {
        if ((vVar instanceof p068h4.x) || (vVar instanceof p068h4.w)) {
            return vVar;
        }
        return vVar instanceof java.io.Serializable ? new p068h4.w(vVar) : new p068h4.x(vVar);
    }

    public static final int y(E.q qVar, x.EnumC3061p0 enumC3061p0) {
        return (int) (enumC3061p0 == x.EnumC3061p0.f30978h ? qVar.f2694o & 4294967295L : qVar.f2694o >> 32);
    }

    public static final long z(long j, long j9) {
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) + ((int) (j9 >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j9 & 4294967295L)))) & 4294967295L);
    }

    public abstract java.lang.String g();

    public int hashCode() {
        switch (this.f19297a) {
            case 14:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public java.lang.String toString() {
        switch (this.f19297a) {
            case 9:
                return g();
            case 14:
                java.lang.String strH = kotlin.jvm.internal.B.f24540a.b(getClass()).h();
                kotlin.jvm.internal.m.b(strH);
                return strH;
            default:
                return super.toString();
        }
    }
}
