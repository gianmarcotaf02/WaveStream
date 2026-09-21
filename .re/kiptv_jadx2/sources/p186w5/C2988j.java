package p186w5;

import B2.a;
import S4.p;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.XtreamLiveStream;
import kotlin.jvm.internal.m;

public final class C2988j {

    public final String f30248a;

    public final XtreamLiveStream f30249b;

    public final p f30250c;

    public final String f30251d;

    public final String f30252e;

    public final String f30253f;
    public final EPGProgram g;

    public C2988j(String id, XtreamLiveStream xtreamLiveStream, p pVar, String programTitle, String str, String str2, EPGProgram ePGProgram) {
        m.e(id, "id");
        m.e(programTitle, "programTitle");
        this.f30248a = id;
        this.f30249b = xtreamLiveStream;
        this.f30250c = pVar;
        this.f30251d = programTitle;
        this.f30252e = str;
        this.f30253f = str2;
        this.g = ePGProgram;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2988j)) {
            return false;
        }
        C2988j c2988j = (C2988j) obj;
        return m.a(this.f30248a, c2988j.f30248a) && m.a(this.f30249b, c2988j.f30249b) && m.a(this.f30250c, c2988j.f30250c) && m.a(this.f30251d, c2988j.f30251d) && m.a(this.f30252e, c2988j.f30252e) && m.a(this.f30253f, c2988j.f30253f) && m.a(this.g, c2988j.g);
    }

    public final int hashCode() {
        int iA = a.a(a.a((this.f30250c.hashCode() + ((this.f30249b.hashCode() + (this.f30248a.hashCode() * 31)) * 31)) * 31, 31, this.f30251d), 31, this.f30252e);
        String str = this.f30253f;
        return this.g.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TonightEntry(id=" + this.f30248a + ", channel=" + this.f30249b + ", group=" + this.f30250c + ", programTitle=" + this.f30251d + ", startTimeText=" + this.f30252e + ", artworkUrl=" + this.f30253f + ", program=" + this.g + ")";
    }
}
