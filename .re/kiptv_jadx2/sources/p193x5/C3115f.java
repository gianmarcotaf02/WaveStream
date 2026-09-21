package p193x5;

import S4.p;
import com.kiptv.core.model.EPGProgram;
import kotlin.jvm.internal.m;

public final class C3115f {

    public final EPGProgram f31458a;

    public final p f31459b;

    public C3115f(EPGProgram program, p group) {
        m.e(program, "program");
        m.e(group, "group");
        this.f31458a = program;
        this.f31459b = group;
    }

    public final p a() {
        return this.f31459b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3115f)) {
            return false;
        }
        C3115f c3115f = (C3115f) obj;
        return m.a(this.f31458a, c3115f.f31458a) && m.a(this.f31459b, c3115f.f31459b);
    }

    public final int hashCode() {
        return this.f31459b.hashCode() + (this.f31458a.hashCode() * 31);
    }

    public final String toString() {
        return "LiveEpgDetail(program=" + this.f31458a + ", group=" + this.f31459b + ")";
    }
}
