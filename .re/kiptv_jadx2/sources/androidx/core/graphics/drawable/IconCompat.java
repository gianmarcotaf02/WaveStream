package androidx.core.graphics.drawable;

import D1.AbstractC0226k;
import D1.AbstractC0229n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.P;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IconCompat extends CustomVersionedParcelable {

    public static final PorterDuff.Mode f16076k = PorterDuff.Mode.SRC_IN;

    public int f16077a;

    public Object f16078b;

    public byte[] f16079c;

    public Parcelable f16080d;

    public int f16081e;

    public int f16082f;
    public ColorStateList g;

    public PorterDuff.Mode f16083h;

    public String f16084i;
    public String j;

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

    public static IconCompat a(Bundle bundle) {
        int i3 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i3);
        iconCompat.f16081e = bundle.getInt("int1");
        iconCompat.f16082f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f16083h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i3) {
            case -1:
            case 1:
            case 5:
                iconCompat.f16078b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i3);
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

    public static IconCompat b(Icon icon) {
        icon.getClass();
        int iE0 = P.e0(icon);
        if (iE0 == 2) {
            return e(null, P.c0(icon), P.b0(icon));
        }
        if (iE0 == 4) {
            Uri uriF0 = P.f0(icon);
            uriF0.getClass();
            String string = uriF0.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f16078b = string;
            return iconCompat;
        }
        if (iE0 != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f16078b = icon;
            return iconCompat2;
        }
        Uri uriF1 = P.f0(icon);
        uriF1.getClass();
        String string2 = uriF1.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f16078b = string2;
        return iconCompat3;
    }

    public static Bitmap c(boolean z6, Bitmap bitmap) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
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
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Context context, int i3) {
        context.getClass();
        return e(context.getResources(), context.getPackageName(), i3);
    }

    public static IconCompat e(Resources resources, String str, int i3) {
        str.getClass();
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f16081e = i3;
        if (resources != null) {
            try {
                iconCompat.f16078b = resources.getResourceName(i3);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
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
            return P.b0(this.f16078b);
        }
        if (i3 == 2) {
            return this.f16081e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String g() {
        int i3 = this.f16077a;
        if (i3 == -1) {
            return P.c0(this.f16078b);
        }
        if (i3 == 2) {
            String str = this.j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f16078b).split(":", -1)[0] : this.j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri h() {
        int i3 = this.f16077a;
        if (i3 == -1) {
            return P.f0(this.f16078b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f16078b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final Icon i(Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i3 = Build.VERSION.SDK_INT;
        switch (this.f16077a) {
            case -1:
                return (Icon) this.f16078b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f16078b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(g(), this.f16081e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f16078b, this.f16081e, this.f16082f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f16078b);
                break;
            case 5:
                iconCreateWithBitmap = i3 < 26 ? Icon.createWithBitmap(c(false, (Bitmap) this.f16078b)) : AbstractC0229n.c((Bitmap) this.f16078b);
                break;
            case 6:
                if (i3 >= 30) {
                    iconCreateWithBitmap = AbstractC0226k.a(h());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + h());
                    }
                    Uri uriH = h();
                    String scheme = uriH.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriH);
                        } catch (Exception e6) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriH, e6);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f16078b));
                        } catch (FileNotFoundException e9) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriH, e9);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + h());
                    }
                    if (i3 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(c(false, BitmapFactory.decodeStream(inputStreamOpenInputStream)));
                    } else {
                        iconCreateWithBitmap = AbstractC0229n.c(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f16083h;
        if (mode != f16076k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f16077a == -1) {
            return String.valueOf(this.f16078b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
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
                sb.append(((Bitmap) this.f16078b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f16078b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(f())));
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
