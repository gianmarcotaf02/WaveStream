package t5;

import java.util.List;

public final class C2834r1 {

    public final List f28337a;

    public final Integer f28338b;

    public final String f28339c;

    public final p194x6.j f28340d;

    public C2834r1(List list, Integer num, String str, p194x6.j onSelect, int i3) {
        num = (i3 & 2) != 0 ? null : num;
        str = (i3 & 4) != 0 ? null : str;
        kotlin.jvm.internal.m.e(onSelect, "onSelect");
        this.f28337a = list;
        this.f28338b = num;
        this.f28339c = str;
        this.f28340d = onSelect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2834r1)) {
            return false;
        }
        C2834r1 c2834r1 = (C2834r1) obj;
        return this.f28337a.equals(c2834r1.f28337a) && kotlin.jvm.internal.m.a(this.f28338b, c2834r1.f28338b) && kotlin.jvm.internal.m.a(this.f28339c, c2834r1.f28339c) && kotlin.jvm.internal.m.a(this.f28340d, c2834r1.f28340d);
    }

    public final int hashCode() {
        int iHashCode = this.f28337a.hashCode() * 31;
        Integer num = this.f28338b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f28339c;
        return this.f28340d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "TvVersionPickerRequest(rows=" + this.f28337a + ", currentId=" + this.f28338b + ", title=" + this.f28339c + ", subtitle=null, onSelect=" + this.f28340d + ")";
    }
}
