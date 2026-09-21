package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f15998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f15999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f16000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f16001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16003f;

    public static androidx.core.app.K a(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("icon");
        java.lang.CharSequence charSequence = bundle.getCharSequence("name");
        androidx.core.graphics.drawable.IconCompat iconCompatA = bundle2 != null ? androidx.core.graphics.drawable.IconCompat.a(bundle2) : null;
        java.lang.String string = bundle.getString("uri");
        java.lang.String string2 = bundle.getString(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY);
        boolean z6 = bundle.getBoolean("isBot");
        boolean z9 = bundle.getBoolean("isImportant");
        androidx.core.app.K k9 = new androidx.core.app.K();
        k9.f15998a = charSequence;
        k9.f15999b = iconCompatA;
        k9.f16000c = string;
        k9.f16001d = string2;
        k9.f16002e = z6;
        k9.f16003f = z9;
        return k9;
    }

    public final android.os.Bundle b() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putCharSequence("name", this.f15998a);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.f15999b;
        if (iconCompat != null) {
            bundle = new android.os.Bundle();
            switch (iconCompat.f16077a) {
                case -1:
                    bundle.putParcelable("obj", (android.os.Parcelable) iconCompat.f16078b);
                    break;
                case 0:
                default:
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (android.graphics.Bitmap) iconCompat.f16078b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (java.lang.String) iconCompat.f16078b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f16078b);
                    break;
            }
            bundle.putInt("type", iconCompat.f16077a);
            bundle.putInt("int1", iconCompat.f16081e);
            bundle.putInt("int2", iconCompat.f16082f);
            bundle.putString("string1", iconCompat.j);
            android.content.res.ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            android.graphics.PorterDuff.Mode mode = iconCompat.f16083h;
            if (mode != androidx.core.graphics.drawable.IconCompat.f16076k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f16000c);
        bundle2.putString(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, this.f16001d);
        bundle2.putBoolean("isBot", this.f16002e);
        bundle2.putBoolean("isImportant", this.f16003f);
        return bundle2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof androidx.core.app.K)) {
            return false;
        }
        androidx.core.app.K k9 = (androidx.core.app.K) obj;
        java.lang.String str = this.f16001d;
        java.lang.String str2 = k9.f16001d;
        if (str == null && str2 == null) {
            return java.util.Objects.equals(java.util.Objects.toString(this.f15998a), java.util.Objects.toString(k9.f15998a)) && java.util.Objects.equals(this.f16000c, k9.f16000c) && java.lang.Boolean.valueOf(this.f16002e).equals(java.lang.Boolean.valueOf(k9.f16002e)) && java.lang.Boolean.valueOf(this.f16003f).equals(java.lang.Boolean.valueOf(k9.f16003f));
        }
        return java.util.Objects.equals(str, str2);
    }

    public final int hashCode() {
        java.lang.String str = this.f16001d;
        if (str != null) {
            return str.hashCode();
        }
        return java.util.Objects.hash(this.f15998a, this.f16000c, java.lang.Boolean.valueOf(this.f16002e), java.lang.Boolean.valueOf(this.f16003f));
    }
}
