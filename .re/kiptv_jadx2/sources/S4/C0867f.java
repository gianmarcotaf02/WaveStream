package S4;

import com.kiptv.core.model.XtreamLiveStream;

public final class C0867f {

    public final XtreamLiveStream f9387a;

    public final EnumC0866e f9388b;

    public C0867f(XtreamLiveStream xtreamLiveStream, EnumC0866e enumC0866e) {
        this.f9387a = xtreamLiveStream;
        this.f9388b = enumC0866e;
    }

    public final XtreamLiveStream a() {
        return this.f9387a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0867f)) {
            return false;
        }
        C0867f c0867f = (C0867f) obj;
        return kotlin.jvm.internal.m.a(this.f9387a, c0867f.f9387a) && this.f9388b == c0867f.f9388b;
    }

    public final int hashCode() {
        return this.f9388b.hashCode() + (this.f9387a.hashCode() * 31);
    }

    public final String toString() {
        return "ChannelVariant(channel=" + this.f9387a + ", quality=" + this.f9388b + ")";
    }
}
