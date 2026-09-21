package p078i6;

import N6.A;
import N7.g;
import N7.p;
import N7.r;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p070h6.k;
import p070h6.s;
import p070h6.u;
import p070h6.w;
import p070h6.z;
import p194x6.j;

public abstract class m extends D {
    public static void A0(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void B0(Object[] objArr, Comparator comparator, int i3, int i9) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        Arrays.sort(objArr, i3, i9, comparator);
    }

    public static List C0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArr, "copyOf(...)");
            A0(objArr, comparator);
        }
        return S(objArr);
    }

    public static final void D0(Object[] objArr, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List E0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new k(objArr, false)) : P.i0(objArr[0]);
        }
        return w.f23205h;
    }

    public static Set F0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return y.f23207h;
        }
        if (length == 1) {
            return AbstractC1909d.h0(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(objArr.length));
        D0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList G0(Object[] objArr, Object[] other) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i3 = 0; i3 < iMin; i3++) {
            arrayList.add(new k(objArr[i3], other[i3]));
        }
        return arrayList;
    }

    public static Iterable R(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return objArr.length == 0 ? w.f23205h : new r(1, objArr);
    }

    public static List S(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.m.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static N7.m T(Object[] objArr) {
        return objArr.length == 0 ? g.f7442a : new p(3, objArr);
    }

    public static boolean U(char[] cArr, char c9) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (c9 == cArr[i3]) {
                if (i3 >= 0) {
                    return true;
                }
                return false;
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean V(int[] iArr, int i3) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        int i9 = 0;
        while (i9 < length) {
            if (i3 == iArr[i9]) {
                if (i9 >= 0) {
                    return true;
                }
                return false;
            }
            i9++;
        }
        i9 = -1;
        if (i9 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean W(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return s0(objArr, obj) >= 0;
    }

    public static boolean X(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = objArr[i3];
            Object obj2 = objArr2[i3];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!X((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof s) && (obj2 instanceof s)) {
                    s sVar = (s) obj2;
                    byte[] bArr = ((s) obj).f22550h;
                    if (bArr == null) {
                        bArr = null;
                    }
                    byte[] bArr2 = sVar.f22550h;
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof z) && (obj2 instanceof z)) {
                    z zVar = (z) obj2;
                    short[] sArr = ((z) obj).f22557h;
                    if (sArr == null) {
                        sArr = null;
                    }
                    short[] sArr2 = zVar.f22557h;
                    if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof u) && (obj2 instanceof u)) {
                    u uVar = (u) obj2;
                    int[] iArr = ((u) obj).f22552h;
                    if (iArr == null) {
                        iArr = null;
                    }
                    int[] iArr2 = uVar.f22552h;
                    if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof w) && (obj2 instanceof w)) {
                    w wVar = (w) obj2;
                    long[] jArr = ((w) obj).f22554h;
                    if (jArr == null) {
                        jArr = null;
                    }
                    long[] jArr2 = wVar.f22554h;
                    if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Y(int i3, int i9, int i10, int[] iArr, int[] destination) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(iArr, i9, destination, i3, i10 - i9);
    }

    public static void Z(int i3, int i9, int i10, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(objArr, i9, destination, i3, i10 - i9);
    }

    public static void a0(byte[] bArr, int i3, int i9, byte[] destination, int i10) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(bArr, i9, destination, i3, i10 - i9);
    }

    public static void b0(char[] cArr, char[] cArr2, int i3, int i9, int i10) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        System.arraycopy(cArr, i9, cArr2, i3, i10 - i9);
    }

    public static void c0(long[] jArr, long[] destination, int i3, int i9, int i10) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(jArr, i9, destination, i3, i10 - i9);
    }

    public static void d0(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = iArr.length;
        }
        Y(i3, 0, i9, iArr, iArr2);
    }

    public static void e0(int i3, int i9, int i10, Object[] objArr, Object[] objArr2) {
        if ((i10 & 4) != 0) {
            i3 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        Z(0, i3, i9, objArr, objArr2);
    }

    public static byte[] f0(byte[] bArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        D.i(i9, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i9);
        kotlin.jvm.internal.m.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] g0(Object[] objArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        D.i(i9, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i3, i9);
        kotlin.jvm.internal.m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void h0(Object[] objArr, A a2, int i3, int i9) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        Arrays.fill(objArr, i3, i9, a2);
    }

    public static void i0(int[] iArr, int i3) {
        int length = iArr.length;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i3);
    }

    public static void j0(long[] jArr, long j) {
        int length = jArr.length;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static List l0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object m0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object n0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static D6.g o0(int[] iArr) {
        return new D6.g(0, iArr.length - 1, 1);
    }

    public static int p0(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Integer q0(int[] iArr, int i3) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        if (i3 < 0 || i3 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i3]);
    }

    public static Object r0(Object[] objArr, int i3) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    public static int s0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final void t0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, j jVar) throws IOException {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        sb.append(charSequence2);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            O7.r.m(sb, obj, jVar);
        }
        sb.append(charSequence3);
    }

    public static String u0(byte[] bArr, String str, j jVar, int i3) {
        String str2 = (i3 & 2) != 0 ? "" : "[";
        String str3 = (i3 & 4) == 0 ? "]" : "";
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        kotlin.jvm.internal.m.e(bArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i9 = 0;
        for (byte b9 : bArr) {
            i9++;
            if (i9 > 1) {
                sb.append((CharSequence) str);
            }
            if (jVar != null) {
                sb.append((CharSequence) jVar.invoke(Byte.valueOf(b9)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b9));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String v0(Object[] objArr, String str, String str2, String str3, j jVar, int i3) throws IOException {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        kotlin.jvm.internal.m.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        t0(objArr, sb, str4, str5, str6, "...", jVar);
        return sb.toString();
    }

    public static Object w0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static byte[] x0(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.m.b(bArrCopyOf);
        return bArrCopyOf;
    }

    public static char y0(char[] cArr) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object z0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
