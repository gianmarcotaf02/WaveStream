package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Objects;

public final class K {

    public CharSequence f15998a;

    public IconCompat f15999b;

    public String f16000c;

    public String f16001d;

    public boolean f16002e;

    public boolean f16003f;

    public static K a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString(SubscriberAttributeKt.JSON_NAME_KEY);
        boolean z6 = bundle.getBoolean("isBot");
        boolean z9 = bundle.getBoolean("isImportant");
        K k9 = new K();
        k9.f15998a = charSequence;
        k9.f15999b = iconCompatA;
        k9.f16000c = string;
        k9.f16001d = string2;
        k9.f16002e = z6;
        k9.f16003f = z9;
        return k9;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f15998a);
        IconCompat iconCompat = this.f15999b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f16077a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f16078b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f16078b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f16078b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f16078b);
                    break;
            }
            bundle.putInt("type", iconCompat.f16077a);
            bundle.putInt("int1", iconCompat.f16081e);
            bundle.putInt("int2", iconCompat.f16082f);
            bundle.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f16083h;
            if (mode != IconCompat.f16076k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f16000c);
        bundle2.putString(SubscriberAttributeKt.JSON_NAME_KEY, this.f16001d);
        bundle2.putBoolean("isBot", this.f16002e);
        bundle2.putBoolean("isImportant", this.f16003f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        K k9 = (K) obj;
        String str = this.f16001d;
        String str2 = k9.f16001d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f15998a), Objects.toString(k9.f15998a)) && Objects.equals(this.f16000c, k9.f16000c) && Boolean.valueOf(this.f16002e).equals(Boolean.valueOf(k9.f16002e)) && Boolean.valueOf(this.f16003f).equals(Boolean.valueOf(k9.f16003f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f16001d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f15998a, this.f16000c, Boolean.valueOf(this.f16002e), Boolean.valueOf(this.f16003f));
    }
}
