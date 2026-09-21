package Y2;

import R0.C0828i0;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.play_billing.AbstractC1831d;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.C1834e;
import com.google.android.gms.internal.play_billing.InterfaceC1840g;
import com.google.android.gms.internal.play_billing.J1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p136q.AbstractC2669m;
import p163t.AbstractC2781z;

public final class L implements t8.q {

    public final int f11388h;

    public int f11389i;
    public Object j;

    public L(char c9, int i3) {
        this.f11388h = i3;
    }

    public static L g(Resources resources, int i3, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f9;
        float f10;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i3);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = p176v1.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new L((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayE = p176v1.b.e(resources, theme, attributeSetAsAttributeSet, p164t1.a.f27756d);
        float f11 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayE.getFloat(8, 0.0f);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayE.getFloat(9, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayE.getFloat(10, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayE.getFloat(11, 0.0f) : 0.0f;
        float f15 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayE.getFloat(3, 0.0f);
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayE.getFloat(4, 0.0f) : 0.0f;
        int i9 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayE.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayE.getColor(0, 0) : 0;
        boolean z6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayE.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayE.getColor(1, 0) : 0;
        int i10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayE.getInt(6, 0) : 0;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayE.getFloat(5, 0.0f) : 0.0f;
        typedArrayE.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f18 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f9 = f12;
            if (next2 == 1) {
                f10 = f13;
                break;
            }
            int depth2 = xml.getDepth();
            f10 = f13;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayE2 = p176v1.b.e(resources, theme, attributeSetAsAttributeSet, p164t1.a.f27757e);
                boolean zHasValue = typedArrayE2.hasValue(0);
                boolean zHasValue2 = typedArrayE2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayE2.getColor(0, 0);
                float f19 = typedArrayE2.getFloat(1, 0.0f);
                typedArrayE2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f19));
            }
            f12 = f9;
            f13 = f10;
        }
        C0828i0 c0828i0 = arrayList2.size() > 0 ? new C0828i0(arrayList2, arrayList) : null;
        if (c0828i0 == null) {
            c0828i0 = z6 ? new C0828i0(color, color2, color3) : new C0828i0(color, color3);
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i10 != 1) {
                    tileMode2 = i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f11, f9, f10, f14, c0828i0.f8924a, c0828i0.f8925b, tileMode2);
            } else {
                radialGradient = new SweepGradient(f15, f16, c0828i0.f8924a, c0828i0.f8925b);
            }
        } else {
            if (f18 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i10 != 1) {
                tileMode = i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f15, f16, f18, c0828i0.f8924a, c0828i0.f8925b, tileMode);
        }
        return new L(radialGradient, (ColorStateList) null, 0);
    }

    @Override
    public void D(String text) {
        byte b9;
        kotlin.jvm.internal.m.e(text, "text");
        h(this.f11389i, text.length() + 2);
        char[] cArr = (char[]) this.j;
        int i3 = this.f11389i;
        int i9 = i3 + 1;
        cArr[i3] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        int i11 = i9;
        while (i11 < i10) {
            char c9 = cArr[i11];
            byte[] bArr = t8.M.f28595b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = text.length();
                for (int i12 = i11 - i9; i12 < length2; i12++) {
                    h(i11, 2);
                    char cCharAt = text.charAt(i12);
                    byte[] bArr2 = t8.M.f28595b;
                    if (cCharAt >= bArr2.length || (b9 = bArr2[cCharAt]) == 0) {
                        int i13 = i11 + 1;
                        ((char[]) this.j)[i11] = cCharAt;
                        i11 = i13;
                    } else if (b9 == 1) {
                        String str = t8.M.f28594a[cCharAt];
                        kotlin.jvm.internal.m.b(str);
                        h(i11, str.length());
                        str.getChars(0, str.length(), (char[]) this.j, i11);
                        int length3 = str.length() + i11;
                        this.f11389i = length3;
                        i11 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.j;
                        cArr2[i11] = '\\';
                        cArr2[i11 + 1] = (char) b9;
                        i11 += 2;
                        this.f11389i = i11;
                    }
                }
                h(i11, 1);
                ((char[]) this.j)[i11] = '\"';
                this.f11389i = i11 + 1;
                return;
            }
            i11++;
        }
        cArr[i10] = '\"';
        this.f11389i = i10 + 1;
    }

    @Override
    public void I(String text) {
        kotlin.jvm.internal.m.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        h(this.f11389i, length);
        text.getChars(0, text.length(), (char[]) this.j, this.f11389i);
        this.f11389i += length;
    }

    public Object a() {
        int i3 = this.f11389i;
        if (i3 <= 0) {
            return null;
        }
        int i9 = i3 - 1;
        Object[] objArr = (Object[]) this.j;
        Object obj = objArr[i9];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i9] = null;
        this.f11389i--;
        return obj;
    }

    public void b(long j) {
        if (e(j)) {
            return;
        }
        int i3 = this.f11389i;
        long[] jArrCopyOf = (long[]) this.j;
        if (i3 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i3 + 1, jArrCopyOf.length * 2));
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.j = jArrCopyOf;
        }
        jArrCopyOf[i3] = j;
        if (i3 >= this.f11389i) {
            this.f11389i = i3 + 1;
        }
    }

    public p163t.J c(Float f9, int i3) {
        p163t.J j = new p163t.J(f9, AbstractC2781z.f27739c);
        ((p136q.w) this.j).h(i3, j);
        return j;
    }

    public void d() {
        WeakReference weakReference;
        int i3 = this.f11389i;
        this.f11389i = i3 + 1;
        if (i3 >= 10) {
            this.f11389i = 0;
            Iterator it = ((LinkedHashMap) this.j).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    N2.f fVar = (N2.f) p078i6.o.j1(arrayList);
                    if (((fVar == null || (weakReference = fVar.f7313a) == null) ? null : (E2.l) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        int i11 = i10 - i9;
                        if (((N2.f) arrayList.get(i11)).f7313a.get() == null) {
                            arrayList.remove(i11);
                            i9++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean e(long j) {
        int i3 = this.f11389i;
        for (int i9 = 0; i9 < i3; i9++) {
            if (((long[]) this.j)[i9] == j) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(long j) {
        I(String.valueOf(j));
    }

    public void h(int i3, int i9) {
        int i10 = i9 + i3;
        char[] cArr = (char[]) this.j;
        if (cArr.length <= i10) {
            int i11 = i3 * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.j = cArrCopyOf;
        }
    }

    public void i(Object instance) {
        kotlin.jvm.internal.m.e(instance, "instance");
        int i3 = this.f11389i;
        int i9 = 0;
        while (true) {
            Object[] objArr = (Object[]) this.j;
            if (i9 >= i3) {
                int i10 = this.f11389i;
                if (i10 < objArr.length) {
                    objArr[i10] = instance;
                    this.f11389i = i10 + 1;
                    return;
                }
                return;
            }
            if (objArr[i9] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
            i9++;
        }
    }

    public void j(long j) {
        int i3 = this.f11389i;
        int i9 = 0;
        while (i9 < i3) {
            if (j == ((long[]) this.j)[i9]) {
                int i10 = this.f11389i - 1;
                while (i9 < i10) {
                    long[] jArr = (long[]) this.j;
                    int i11 = i9 + 1;
                    jArr[i9] = jArr[i11];
                    i9 = i11;
                }
                this.f11389i--;
                return;
            }
            i9++;
        }
    }

    public void k(N2.a aVar, E2.l lVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.j;
        Object arrayList = linkedHashMap.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(aVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        N2.f fVar = new N2.f(new WeakReference(lVar), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(fVar);
        } else {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                N2.f fVar2 = (N2.f) arrayList2.get(i3);
                if (j >= fVar2.f7315c) {
                    if (fVar2.f7313a.get() == lVar) {
                        arrayList2.set(i3, fVar);
                        break;
                    } else {
                        arrayList2.add(i3, fVar);
                        break;
                    }
                }
            }
        }
        d();
    }

    public String l(J1 j9) {
        String str;
        O o8 = (O) this.j;
        int i3 = this.f11389i;
        try {
            if (o8.f11393J == null) {
                throw null;
            }
            InterfaceC1840g interfaceC1840g = o8.f11393J;
            String packageName = o8.H.getPackageName();
            if (i3 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i3 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i3 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i3 != 5) {
                str = i3 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            M m8 = new M(j9);
            C1834e c1834e = (C1834e) interfaceC1840g;
            Parcel parcelC0 = c1834e.c0();
            parcelC0.writeString(packageName);
            parcelC0.writeString(str);
            int i9 = AbstractC1831d.f19314a;
            parcelC0.writeStrongBinder(m8);
            try {
                c1834e.f10839d.transact(1, parcelC0, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelC0.recycle();
            }
        } catch (Exception e6) {
            o8.R(95, 28, S.f11402E);
            AbstractC1872t.i("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
            j9.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public void s(char c9) {
        h(this.f11389i, 1);
        char[] cArr = (char[]) this.j;
        int i3 = this.f11389i;
        this.f11389i = i3 + 1;
        cArr[i3] = c9;
    }

    public String toString() {
        switch (this.f11388h) {
            case 11:
                return new String((char[]) this.j, 0, this.f11389i);
            default:
                return super.toString();
        }
    }

    public L(int i3, Object obj, int i9) {
        this.f11388h = i9;
        this.f11389i = i3;
        this.j = obj;
    }

    public L(Object obj, int i3, int i9) {
        this.f11388h = i9;
        this.j = obj;
        this.f11389i = i3;
    }

    public L(Shader shader, ColorStateList colorStateList, int i3) {
        this.f11388h = 12;
        this.j = shader;
        this.f11389i = i3;
    }

    public L(int i3) {
        this.f11388h = 2;
        if (i3 > 0) {
            this.j = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public L(int i3, byte b9) {
        this.f11388h = i3;
        switch (i3) {
            case 6:
                this.j = new LinkedHashMap();
                break;
            case 10:
                this.f11389i = RCHTTPStatusCodes.UNSUCCESSFUL;
                p136q.w wVar = AbstractC2669m.f26402a;
                this.j = new p136q.w();
                break;
            default:
                this.f11389i = 1;
                this.j = Collections.singletonList(null);
                break;
        }
    }

    public L(ArrayList arrayList) {
        this.f11388h = 1;
        this.f11389i = 0;
        this.j = arrayList;
    }
}
