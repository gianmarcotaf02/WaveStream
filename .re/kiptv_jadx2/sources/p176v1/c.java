package p176v1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.kiptv.tv.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p164t1.a;

public abstract class c {

    public static final ThreadLocal f29118a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f9;
        int i3;
        int iC;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r9 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r9 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = a.f27753a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i9, i9);
                int resourceId = ObtainAttributes.getResourceId(i9, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f29118a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r9);
                    int i11 = typedValue.type;
                    if (i11 < 28 || i11 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i9, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i9, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i9, -65281);
                }
                if (ObtainAttributes.hasValue(r9)) {
                    f9 = ObtainAttributes.getFloat(r9, 1.0f);
                } else {
                    f9 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r9;
                float f10 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i12 = i9;
                int i13 = i12;
                while (i12 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i14 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i13] = attributeNameResource;
                        i13 = i14;
                    }
                    i12++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i13);
                float f11 = 100.0f;
                boolean z6 = (f10 < 0.0f || f10 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f9 != 1.0f || z6) {
                    int iAlpha = (int) ((Color.alpha(color) * f9) + 0.5f);
                    if (iAlpha < 0) {
                        i3 = 0;
                    } else {
                        i3 = 255;
                        if (iAlpha <= 255) {
                            i3 = iAlpha;
                        }
                    }
                    if (z6) {
                        a aVarA = a.a(color);
                        k kVar = k.f29139k;
                        float f12 = aVarA.f29109b;
                        if (f12 >= 1.0d && Math.round(f10) > 0.0d && Math.round(f10) < 100.0d) {
                            float f13 = aVarA.f29108a;
                            float fMin = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
                            float f14 = 0.0f;
                            float f15 = f12;
                            boolean z9 = r16 == true ? 1 : 0;
                            a aVar = null;
                            while (true) {
                                if (Math.abs(f14 - f12) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iC = aVar.c(kVar);
                                        break;
                                    }
                                    iC = b.c(f10);
                                    break;
                                }
                                float f16 = 1000.0f;
                                float f17 = f11;
                                float f18 = 0.0f;
                                float f19 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f18 - f17) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f11 = f11;
                                        break;
                                    }
                                    f11 = f11;
                                    float f20 = ((f17 - f18) / 2.0f) + f18;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC2 = a.b(f20, f15, fMin).c(k.f29139k);
                                    float fD = b.d(Color.red(iC2));
                                    float fD2 = b.d(Color.green(iC2));
                                    float fD3 = b.d(Color.blue(iC2));
                                    float[] fArr = b.f29117d[r16 == true ? 1 : 0];
                                    float f21 = ((fD3 * fArr[2]) + ((fD2 * fArr[r16 == true ? 1 : 0]) + (fD * fArr[0]))) / f11;
                                    float fCbrt = f21 <= 0.008856452f ? f21 * 903.2963f : (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f10 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC2);
                                        a aVarB = a.b(aVarA2.f29110c, aVarA2.f29109b, fMin);
                                        float f22 = aVarA2.f29111d - aVarB.f29111d;
                                        float f23 = aVarA2.f29112e - aVarB.f29112e;
                                        float f24 = aVarA2.f29113f - aVarB.f29113f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f19 = fPow;
                                            f16 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f16 == 0.0f && f19 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f10) {
                                        f18 = f20;
                                    } else {
                                        f17 = f20;
                                    }
                                    f11 = f11;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z9) {
                                    if (aVar3 == null) {
                                        f12 = f15;
                                    } else {
                                        aVar = aVar3;
                                        f14 = f15;
                                    }
                                    f15 = ((f12 - f14) / 2.0f) + f14;
                                } else {
                                    if (aVar3 != null) {
                                        iC = aVar3.c(kVar);
                                        break;
                                    }
                                    f15 = ((f12 - f14) / 2.0f) + f14;
                                    z9 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iC = b.c(f10);
                        }
                        color = iC;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i3 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i15 = i10 + 1;
                if (i15 > iArr.length) {
                    int[] iArr4 = new int[i10 <= 4 ? 8 : i10 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i10);
                    iArr = iArr4;
                }
                iArr[i10] = color;
                if (i15 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10 > 4 ? i10 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i10);
                    objArr = objArr2;
                }
                objArr[i10] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i10 = i15;
                r9 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i9 = 0;
            } else {
                int i16 = depth2;
                r9 = r9 == true ? 1 : 0;
                depth2 = i16;
                i9 = 0;
            }
        }
        int[] iArr5 = new int[i10];
        int[][] iArr6 = new int[i10][];
        System.arraycopy(iArr, 0, iArr5, 0, i10);
        System.arraycopy(objArr, 0, iArr6, 0, i10);
        return new ColorStateList(iArr6, iArr5);
    }
}
