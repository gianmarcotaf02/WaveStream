package com.google.android.gms.internal.play_billing;

import Z2.C1202m;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.inputmethod.ExtractedText;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.KSerializer;
import p045e8.InterfaceC2119b;
import p153r8.C2691d;
import x.EnumC3061p0;

public abstract class V0 {

    public static final int f19293b = 0;

    public static final int f19294c = 0;

    public static final int f19295d = 0;

    public static final int f19296e = 0;

    public final int f19297a;

    public V0(int i3) {
        this.f19297a = i3;
    }

    public static final byte[] A(InputStream inputStream) throws IOException {
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        p(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.m.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final boolean B(p136q.H h9, Object obj, Object obj2) {
        Object objG = h9.g(obj);
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

    public static final void C(p136q.H h9, Object obj) {
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
                        Object obj2 = h9.f26323b[i11];
                        Object obj3 = h9.f26324c[i11];
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
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final Object E(int i3, Object obj, p048f1.y yVar, p048f1.s sVar, int i9) {
        Object[] objArr;
        Object[] objArr2;
        if (!(obj instanceof Typeface)) {
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
        if (Build.VERSION.SDK_INT >= 28) {
            int i11 = objArr != false ? sVar.f21672h : yVar.f21679b.f21672h;
            if (objArr2 != true) {
                yVar.getClass();
            } else if (i9 == 1) {
                z6 = true;
            }
            return Typeface.create((Typeface) obj, i11, z6);
        }
        Object[] objArr3 = objArr2 == true && i9 == 1;
        if (objArr3 == true && objArr == true) {
            i10 = 3;
        } else if (objArr == true) {
            i10 = 1;
        } else if (objArr3 != false) {
            i10 = 2;
        }
        return Typeface.create((Typeface) obj, i10);
    }

    public static final ExtractedText F(g1.x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.f21847a.f17809i;
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

    public static boolean H(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, I1 i3, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(i3) != obj && atomicReferenceFieldUpdater.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final C2691d a(KSerializer elementSerializer) {
        kotlin.jvm.internal.m.e(elementSerializer, "elementSerializer");
        return new C2691d(elementSerializer, 0);
    }

    public static final p153r8.F b(KSerializer keySerializer, KSerializer valueSerializer) {
        kotlin.jvm.internal.m.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.m.e(valueSerializer, "valueSerializer");
        return new p153r8.F(keySerializer, valueSerializer, 1);
    }

    public static final p181w0.b c(long j, long j9) {
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        return new p181w0.b(Float.intBitsToFloat(i3), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat(i9));
    }

    public static final void d(p136q.H h9, Object obj, Object obj2) {
        int iF = h9.f(obj);
        boolean z6 = iF < 0;
        Object obj3 = z6 ? null : h9.f26324c[iF];
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

    public static void e(InterfaceC2119b interfaceC2119b, p194x6.j[] otherFormats, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(otherFormats, "otherFormats");
        ArrayList arrayList = new ArrayList(otherFormats.length);
        for (p194x6.j jVar2 : otherFormats) {
            InterfaceC2119b interfaceC2119bQ = interfaceC2119b.q();
            jVar2.invoke(interfaceC2119bQ);
            arrayList.add(new p063g8.f(interfaceC2119bQ.a().f12900b));
        }
        InterfaceC2119b interfaceC2119bQ2 = interfaceC2119b.q();
        jVar.invoke(interfaceC2119bQ2);
        interfaceC2119b.a().b(new p063g8.b(new p063g8.f(interfaceC2119bQ2.a().f12900b), arrayList));
    }

    public static void f(InterfaceC2119b interfaceC2119b, String str, p194x6.j jVar) {
        C1202m c1202mA = interfaceC2119b.a();
        InterfaceC2119b interfaceC2119bQ = interfaceC2119b.q();
        jVar.invoke(interfaceC2119bQ);
        c1202mA.b(new p063g8.p(str, new p063g8.f(interfaceC2119bQ.a().f12900b)));
    }

    public static p063g8.d h(InterfaceC2119b interfaceC2119b) {
        ArrayList formats = interfaceC2119b.a().f12900b;
        kotlin.jvm.internal.m.e(formats, "formats");
        return new p063g8.d(formats);
    }

    public static final Bundle i(p070h6.k... kVarArr) {
        Bundle bundle = new Bundle(kVarArr.length);
        for (p070h6.k kVar : kVarArr) {
            String str = (String) kVar.f22539h;
            Object obj = kVar.f22540i;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
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
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.m.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void j(InterfaceC2119b interfaceC2119b, String value) {
        kotlin.jvm.internal.m.e(value, "value");
        interfaceC2119b.a().b(new p063g8.h(value));
    }

    public static final p080i8.p k(List list) {
        p078i6.w wVar = p078i6.w.f23205h;
        p080i8.p pVar = new p080i8.p(wVar, wVar);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
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
        AbstractC1864o0.N(length == ((long) i3), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i3];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static final p080i8.p m(p080i8.p pVar, p080i8.p pVar2) {
        boolean zIsEmpty = pVar.f23276b.isEmpty();
        List list = pVar.f23275a;
        if (zIsEmpty) {
            return new p080i8.p(p078i6.o.A1(list, pVar2.f23275a), pVar2.f23276b);
        }
        List list2 = pVar.f23276b;
        ArrayList arrayList = new ArrayList(p078i6.q.I0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m((p080i8.p) it.next(), pVar2));
        }
        return new p080i8.p(list, arrayList);
    }

    public static final p080i8.p n(p080i8.p pVar, List list) {
        List listI0;
        List listI1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListO1 = p078i6.o.O1(list);
        ArrayList arrayListO2 = null;
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
        ArrayList arrayList2 = new ArrayList();
        Iterator it = pVar.f23276b.iterator();
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
        List<p080i8.p> list2 = arrayList2;
        if (zIsEmpty) {
            listI0 = com.google.common.util.concurrent.P.i0(new p080i8.p(arrayListO1, p078i6.w.f23205h));
        }
        if (arrayListO2 == null) {
            list2 = listI0;
            return new p080i8.p(arrayList, list2);
        }
        if (!list2.isEmpty()) {
            list2 = listI0;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                p080i8.o oVar2 = (p080i8.o) p078i6.o.j1(((p080i8.p) it2.next()).f23275a);
                if (oVar2 != null && (oVar2 instanceof p080i8.h)) {
                    ArrayList arrayList3 = new ArrayList(p078i6.q.I0(list2, 10));
                    for (p080i8.p pVar2 : list2) {
                        p080i8.o oVar3 = (p080i8.o) p078i6.o.j1(pVar2.f23275a);
                        boolean z6 = oVar3 instanceof p080i8.h;
                        List list3 = pVar2.f23275a;
                        List list4 = pVar2.f23276b;
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

    public static final long p(InputStream inputStream, OutputStream outputStream, int i3) throws IOException {
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

    public static void q(String str, String str2, Object obj) {
        String strT = t(str);
        if (Log.isLoggable(strT, 3)) {
            Log.d(strT, String.format(str2, obj));
        }
    }

    public static void r(Exception exc, String str, String str2) {
        String strT = t(str);
        if (Log.isLoggable(strT, 6)) {
            Log.e(strT, str2, exc);
        }
    }

    public static final KSerializer s(KSerializer kSerializer) {
        kotlin.jvm.internal.m.e(kSerializer, "<this>");
        return kSerializer.getDescriptor().d() ? kSerializer : new p153r8.Y(kSerializer);
    }

    public static String t(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static String u() {
        String country = Locale.getDefault().getCountry();
        kotlin.jvm.internal.m.d(country, "getCountry(...)");
        Locale locale = Locale.ROOT;
        String upperCase = country.toUpperCase(locale);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 0 && X4.c.a(upperCase)) {
            return upperCase;
        }
        p015b5.t.Companion.getClass();
        String country2 = p015b5.p.a().getCountry();
        kotlin.jvm.internal.m.d(country2, "getCountry(...)");
        String upperCase2 = country2.toUpperCase(locale);
        kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
        if (upperCase2.length() <= 0 || !X4.c.a(upperCase2)) {
            return upperCase.length() == 0 ? "US" : upperCase;
        }
        return upperCase2;
    }

    public static int v(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void w(String key) {
        kotlin.jvm.internal.m.e(key, "key");
        throw new IllegalArgumentException(Y6.f.h("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static p068h4.v x(p068h4.v vVar) {
        if ((vVar instanceof p068h4.x) || (vVar instanceof p068h4.w)) {
            return vVar;
        }
        return vVar instanceof Serializable ? new p068h4.w(vVar) : new p068h4.x(vVar);
    }

    public static final int y(E.q qVar, EnumC3061p0 enumC3061p0) {
        return (int) (enumC3061p0 == EnumC3061p0.f30978h ? qVar.f2694o & 4294967295L : qVar.f2694o >> 32);
    }

    public static final long z(long j, long j9) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j9 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j9 & 4294967295L)))) & 4294967295L);
    }

    public abstract String g();

    public int hashCode() {
        switch (this.f19297a) {
            case 14:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f19297a) {
            case 9:
                return g();
            case 14:
                String strH = kotlin.jvm.internal.B.f24540a.b(getClass()).h();
                kotlin.jvm.internal.m.b(strH);
                return strH;
            default:
                return super.toString();
        }
    }
}
