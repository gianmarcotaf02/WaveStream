package G5;

import com.kiptv.core.model.XtreamLiveStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class d {

    public final List f3814a;

    public final XtreamLiveStream f3815b;

    public final List f3816c;

    public final boolean f3817d;

    public final String f3818e;

    public d(List channels, XtreamLiveStream xtreamLiveStream, List dayGroups, boolean z6, String str) {
        m.e(channels, "channels");
        m.e(dayGroups, "dayGroups");
        this.f3814a = channels;
        this.f3815b = xtreamLiveStream;
        this.f3816c = dayGroups;
        this.f3817d = z6;
        this.f3818e = str;
    }

    public static d a(d dVar, ArrayList arrayList, XtreamLiveStream xtreamLiveStream, ArrayList arrayList2, boolean z6, String str, int i3) {
        List list = arrayList;
        if ((i3 & 1) != 0) {
            list = dVar.f3814a;
        }
        List channels = list;
        if ((i3 & 2) != 0) {
            xtreamLiveStream = dVar.f3815b;
        }
        XtreamLiveStream xtreamLiveStream2 = xtreamLiveStream;
        List list2 = arrayList2;
        if ((i3 & 4) != 0) {
            list2 = dVar.f3816c;
        }
        List dayGroups = list2;
        if ((i3 & 8) != 0) {
            z6 = dVar.f3817d;
        }
        boolean z9 = z6;
        if ((i3 & 16) != 0) {
            str = dVar.f3818e;
        }
        dVar.getClass();
        m.e(channels, "channels");
        m.e(dayGroups, "dayGroups");
        return new d(channels, xtreamLiveStream2, dayGroups, z9, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f3814a, dVar.f3814a) && m.a(this.f3815b, dVar.f3815b) && m.a(this.f3816c, dVar.f3816c) && this.f3817d == dVar.f3817d && m.a(this.f3818e, dVar.f3818e);
    }

    public final int hashCode() {
        int iHashCode = this.f3814a.hashCode() * 31;
        XtreamLiveStream xtreamLiveStream = this.f3815b;
        int iF = p.f(B2.a.b((iHashCode + (xtreamLiveStream == null ? 0 : xtreamLiveStream.hashCode())) * 31, 31, this.f3816c), 31, this.f3817d);
        String str = this.f3818e;
        return iF + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvReplayUiState(channels=");
        sb.append(this.f3814a);
        sb.append(", selectedChannel=");
        sb.append(this.f3815b);
        sb.append(", dayGroups=");
        sb.append(this.f3816c);
        sb.append(", loading=");
        sb.append(this.f3817d);
        sb.append(", error=");
        return Y6.f.m(sb, this.f3818e, ")");
    }
}
