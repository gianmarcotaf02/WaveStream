package p082j2;

import android.text.TextUtils;
import java.util.Objects;

public class c {

    public final String f23902a;

    public final int f23903b;

    public final int f23904c;

    public c(String str, int i3, int i9) {
        this.f23902a = str;
        this.f23903b = i3;
        this.f23904c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i3 = this.f23904c;
        String str = this.f23902a;
        int i9 = this.f23903b;
        if (i9 < 0 || cVar.f23903b < 0) {
            return TextUtils.equals(str, cVar.f23902a) && i3 == cVar.f23904c;
        }
        return TextUtils.equals(str, cVar.f23902a) && i9 == cVar.f23903b && i3 == cVar.f23904c;
    }

    public final int hashCode() {
        return Objects.hash(this.f23902a, Integer.valueOf(this.f23904c));
    }
}
