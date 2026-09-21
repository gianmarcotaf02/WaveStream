package p208z5;

import B2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

public final class Y {

    public final String f32601a;

    public final String f32602b;

    public final ArrayList f32603c;

    public Y(String tagKey, String title, ArrayList arrayList) {
        m.e(tagKey, "tagKey");
        m.e(title, "title");
        this.f32601a = tagKey;
        this.f32602b = title;
        this.f32603c = arrayList;
    }

    public final List a() {
        return this.f32603c;
    }

    public final String b() {
        return this.f32602b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return m.a(this.f32601a, y.f32601a) && m.a(this.f32602b, y.f32602b) && this.f32603c.equals(y.f32603c);
    }

    public final int hashCode() {
        return this.f32603c.hashCode() + a.a(this.f32601a.hashCode() * 31, 31, this.f32602b);
    }

    public final String toString() {
        return "TvMovieMyListSection(tagKey=" + this.f32601a + ", title=" + this.f32602b + ", items=" + this.f32603c + ")";
    }
}
