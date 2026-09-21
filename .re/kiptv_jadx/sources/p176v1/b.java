package p176v1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f29114a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f29115b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f29116c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f29117d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static Y2.L a(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i3) {
        Y2.L lG;
        if (b(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i3, typedValue);
            int i9 = typedValue.type;
            if (i9 >= 28 && i9 <= 31) {
                return new Y2.L((android.graphics.Shader) null, (android.content.res.ColorStateList) null, typedValue.data);
            }
            try {
                lG = Y2.L.g(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
            } catch (java.lang.Exception e6) {
                android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e6);
                lG = null;
            }
            if (lG != null) {
                return lG;
            }
        }
        return new Y2.L((android.graphics.Shader) null, (android.content.res.ColorStateList) null, 0);
    }

    public static boolean b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int c(float f9) {
        if (f9 < 1.0f) {
            return -16777216;
        }
        if (f9 > 99.0f) {
            return -1;
        }
        float f10 = (f9 + 16.0f) / 116.0f;
        float f11 = f9 > 8.0f ? f10 * f10 * f10 : f9 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z6 = f12 > 0.008856452f;
        float f13 = z6 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z6) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f29116c;
        return p182w1.a.a(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float d(int i3) {
        float f9 = i3 / 255.0f;
        return (f9 <= 0.04045f ? f9 / 12.92f : (float) java.lang.Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static android.content.res.TypedArray e(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static p176v1.d f(android.content.res.XmlResourceParser xmlResourceParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            h(xmlResourceParser);
            return null;
        }
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), p164t1.a.f27754b);
        java.lang.String string = typedArrayObtainAttributes.getString(0);
        java.lang.String string2 = typedArrayObtainAttributes.getString(5);
        java.lang.String string3 = typedArrayObtainAttributes.getString(6);
        java.lang.String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        java.lang.String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                h(xmlResourceParser);
            }
            java.util.List listG = g(resources, resourceId);
            return new p176v1.g(new A1.e(string, string2, string3, listG), string4 != null ? new A1.e(string, string2, string4, listG) : null, integer, integer2, string5);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals(io.ktor.http.ContentType.Font.TYPE)) {
                    android.content.res.TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), p164t1.a.f27755c);
                    int i3 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST);
                    boolean z6 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i9 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    java.lang.String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i10 = typedArrayObtainAttributes2.getInt(i9, 0);
                    int i11 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i11, 0);
                    java.lang.String string7 = typedArrayObtainAttributes2.getString(i11);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        h(xmlResourceParser);
                    }
                    arrayList.add(new p176v1.f(i3, i10, resourceId2, string7, string6, z6));
                } else {
                    h(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p176v1.e((p176v1.f[]) arrayList.toArray(new p176v1.f[0]));
    }

    public static java.util.List g(android.content.res.Resources resources, int i3) {
        if (i3 == 0) {
            return java.util.Collections.EMPTY_LIST;
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.EMPTY_LIST;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        java.lang.String[] stringArray = resources.getStringArray(resourceId);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                java.lang.String[] stringArray2 = resources.getStringArray(i3);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void h(android.content.res.XmlResourceParser xmlResourceParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static float i() {
        return ((float) java.lang.Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
