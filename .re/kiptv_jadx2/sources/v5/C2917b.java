package v5;

import com.kiptv.core.model.EPGProgram;

public final class C2917b {

    public final EPGProgram f29402a;

    public final String f29403b;

    public C2917b(EPGProgram program, String str) {
        kotlin.jvm.internal.m.e(program, "program");
        this.f29402a = program;
        this.f29403b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2917b)) {
            return false;
        }
        C2917b c2917b = (C2917b) obj;
        return kotlin.jvm.internal.m.a(this.f29402a, c2917b.f29402a) && kotlin.jvm.internal.m.a(this.f29403b, c2917b.f29403b);
    }

    public final int hashCode() {
        return this.f29403b.hashCode() + (this.f29402a.hashCode() * 31);
    }

    public final String toString() {
        return "FocusedProgram(program=" + this.f29402a + ", channelName=" + this.f29403b + ")";
    }
}
