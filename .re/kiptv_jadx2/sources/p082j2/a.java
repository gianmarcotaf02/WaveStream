package p082j2;

import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.audio.e;

public final class a {

    public c f23901a;

    public a(String str, int i3, int i9) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f23901a = new c(str, i3, i9);
            return;
        }
        b bVar = new b(str, i3, i9);
        e.h(i3, i9, str);
        this.f23901a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f23901a.equals(((a) obj).f23901a);
    }

    public final int hashCode() {
        return this.f23901a.hashCode();
    }
}
