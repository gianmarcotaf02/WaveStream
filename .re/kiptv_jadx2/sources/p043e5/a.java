package p043e5;

import java.util.Set;
import kotlin.jvm.internal.m;

public final class a {

    public final String f21419a;

    public final String f21420b;

    public final d f21421c;

    public final Set f21422d;

    public a(String str, String str2, d dVar) {
        Set platforms = g.f21436a;
        m.e(platforms, "platforms");
        this.f21419a = str;
        this.f21420b = str2;
        this.f21421c = dVar;
        this.f21422d = platforms;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f21419a, aVar.f21419a) && m.a(this.f21420b, aVar.f21420b) && this.f21421c == aVar.f21421c && m.a(this.f21422d, aVar.f21422d);
    }

    public final int hashCode() {
        return this.f21422d.hashCode() + ((this.f21421c.hashCode() + B2.a.a(this.f21419a.hashCode() * 31, 31, this.f21420b)) * 31);
    }

    public final String toString() {
        return "WhatsNewBullet(titleKey=" + this.f21419a + ", descriptionKey=" + this.f21420b + ", category=" + this.f21421c + ", platforms=" + this.f21422d + ")";
    }
}
