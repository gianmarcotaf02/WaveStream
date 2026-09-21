package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f16076k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f16078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f16079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.os.Parcelable f16080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16082f;
    public android.content.res.ColorStateList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f16083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f16084i;
    public java.lang.String j;

    public IconCompat() {
        this.f16077a = -1;
        this.f16079c = null;
        this.f16080d = null;
        this.f16081e = 0;
        this.f16082f = 0;
        this.g = null;
        this.f16083h = f16076k;
        this.f16084i = null;
    }

    public static androidx.core.graphics.drawable.IconCompat a(android.os.Bundle bundle) {
        int i3 = bundle.getInt("type");
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(i3);
        iconCompat.f16081e = bundle.getInt("int1");
        iconCompat.f16082f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.g = (android.content.res.ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f16083h = android.graphics.PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i3) {
            case -1:
            case 1:
            case 5:
                iconCompat.f16078b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                android.util.Log.w("IconCompat", "Unknown type " + i3);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f16078b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f16078b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat b(android.graphics.drawable.Icon icon) {
        icon.getClass();
        int iE0 = com.google.common.util.concurrent.P.e0(icon);
        if (iE0 == 2) {
            return e(null, com.google.common.util.concurrent.P.c0(icon), com.google.common.util.concurrent.P.b0(icon));
        }
        if (iE0 == 4) {
            android.net.Uri uriF0 = com.google.common.util.concurrent.P.f0(icon);
            uriF0.getClass();
            java.lang.String string = uriF0.toString();
            string.getClass();
            androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
            iconCompat.f16078b = string;
            return iconCompat;
        }
        if (iE0 != 6) {
            androidx.core.graphics.drawable.IconCompat iconCompat2 = new androidx.core.graphics.drawable.IconCompat(-1);
            iconCompat2.f16078b = icon;
            return iconCompat2;
        }
        android.net.Uri uriF1 = com.google.common.util.concurrent.P.f0(icon);
        uriF1.getClass();
        java.lang.String string2 = uriF1.toString();
        string2.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat3 = new androidx.core.graphics.drawable.IconCompat(6);
        iconCompat3.f16078b = string2;
        return iconCompat3;
    }

    public static android.graphics.Bitmap c(boolean z6, android.graphics.Bitmap bitmap) {
        int iMin = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, iMin, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f9 = iMin;
        float f10 = 0.5f * f9;
        float f11 = 0.9166667f * f10;
        if (z6) {
            float f12 = 0.010416667f * f9;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f9 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static androidx.core.graphics.drawable.IconCompat d(android.content.Context context, int i3) {
        context.getClass();
        return e(context.getResources(), context.getPackageName(), i3);
    }

    public static androidx.core.graphics.drawable.IconCompat e(android.content.res.Resources resources, java.lang.String str, int i3) {
        str.getClass();
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.f16081e = i3;
        if (resources != null) {
            try {
                iconCompat.f16078b = resources.getResourceName(i3);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f16078b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int f() {
        int i3 = this.f16077a;
        if (i3 == -1) {
            return com.google.common.util.concurrent.P.b0(this.f16078b);
        }
        if (i3 == 2) {
            return this.f16081e;
        }
        throw new java.lang.IllegalStateException("called getResId() on " + this);
    }

    public final java.lang.String g() {
        int i3 = this.f16077a;
        if (i3 == -1) {
            return com.google.common.util.concurrent.P.c0(this.f16078b);
        }
        if (i3 == 2) {
            java.lang.String str = this.j;
            return (str == null || android.text.TextUtils.isEmpty(str)) ? ((java.lang.String) this.f16078b).split(":", -1)[0] : this.j;
        }
        throw new java.lang.IllegalStateException("called getResPackage() on " + this);
    }

    public final android.net.Uri h() {
        int i3 = this.f16077a;
        if (i3 == -1) {
            return com.google.common.util.concurrent.P.f0(this.f16078b);
        }
        if (i3 == 4 || i3 == 6) {
            return android.net.Uri.parse((java.lang.String) this.f16078b);
        }
        throw new java.lang.IllegalStateException("called getUri() on " + this);
    }

    public final android.graphics.drawable.Icon i(android.content.Context context) {
        android.graphics.drawable.Icon iconCreateWithBitmap;
        java.io.InputStream inputStreamOpenInputStream;
        int i3 = android.os.Build.VERSION.SDK_INT;
        switch (this.f16077a) {
            case -1:
                return (android.graphics.drawable.Icon) this.f16078b;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) this.f16078b);
                break;
            case 2:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithResource(g(), this.f16081e);
                break;
            case 3:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) this.f16078b, this.f16081e, this.f16082f);
                break;
            case 4:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) this.f16078b);
                break;
            case 5:
                iconCreateWithBitmap = i3 < 26 ? android.graphics.drawable.Icon.createWithBitmap(c(false, (android.graphics.Bitmap) this.f16078b)) : D1.AbstractC0229n.c((android.graphics.Bitmap) this.f16078b);
                break;
            case 6:
                if (i3 >= 30) {
                    iconCreateWithBitmap = D1.AbstractC0226k.a(h());
                } else {
                    if (context == null) {
                        throw new java.lang.IllegalArgumentException("Context is required to resolve the file uri of the icon: " + h());
                    }
                    android.net.Uri uriH = h();
                    java.lang.String scheme = uriH.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriH);
                        } catch (java.lang.Exception e6) {
                            android.util.Log.w("IconCompat", "Unable to load image from URI: " + uriH, e6);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new java.io.FileInputStream(new java.io.File((java.lang.String) this.f16078b));
                        } catch (java.io.FileNotFoundException e9) {
                            android.util.Log.w("IconCompat", "Unable to load image from path: " + uriH, e9);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new java.lang.IllegalStateException("Cannot load adaptive icon from uri: " + h());
                    }
                    if (i3 < 26) {
                        iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap(c(false, android.graphics.BitmapFactory.decodeStream(inputStreamOpenInputStream)));
                    } else {
                        iconCreateWithBitmap = D1.AbstractC0229n.c(android.graphics.BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        android.content.res.ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.f16083h;
        if (mode != f16076k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (this.f16077a == -1) {
            return java.lang.String.valueOf(this.f16078b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.f16077a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f16077a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.f16078b).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.f16078b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f16081e);
                if (this.f16082f != 0) {
                    sb.append(" off=");
                    sb.append(this.f16082f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f16078b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.f16083h != f16076k) {
            sb.append(" mode=");
            sb.append(this.f16083h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i3) {
        this.f16079c = null;
        this.f16080d = null;
        this.f16081e = 0;
        this.f16082f = 0;
        this.g = null;
        this.f16083h = f16076k;
        this.f16084i = null;
        this.f16077a = i3;
    }
}
