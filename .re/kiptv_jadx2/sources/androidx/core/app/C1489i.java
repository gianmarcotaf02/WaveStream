package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.common.util.concurrent.P;

public final class C1489i {

    public final Bundle f16031a;

    public IconCompat f16032b;

    public final M[] f16033c;

    public final boolean f16034d;

    public final boolean f16035e;

    public final int f16036f;
    public final CharSequence g;

    public final PendingIntent f16037h;

    public C1489i(int i3, PendingIntent pendingIntent, String str) {
        this(i3 != 0 ? IconCompat.e(null, "", i3) : null, str, pendingIntent);
    }

    public final IconCompat a() {
        int i3;
        if (this.f16032b == null && (i3 = this.f16036f) != 0) {
            this.f16032b = IconCompat.e(null, "", i3);
        }
        return this.f16032b;
    }

    public C1489i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, true);
    }

    public C1489i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, M[] mArr, M[] mArr2, boolean z6, boolean z9) {
        this.f16035e = true;
        this.f16032b = iconCompat;
        if (iconCompat != null) {
            int i3 = iconCompat.f16077a;
            if ((i3 == -1 ? P.e0(iconCompat.f16078b) : i3) == 2) {
                this.f16036f = iconCompat.f();
            }
        }
        this.g = n.b(charSequence);
        this.f16037h = pendingIntent;
        this.f16031a = bundle == null ? new Bundle() : bundle;
        this.f16033c = mArr;
        this.f16034d = z6;
        this.f16035e = z9;
    }
}
