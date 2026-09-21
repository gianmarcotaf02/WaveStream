package D;

import F.L;
import com.kiptv.core.model.ContentTypeSettings;
import io.ktor.http.cio.HttpHeadersMap;
import io.ktor.websocket.RawWebSocketCommonKt;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public final class y implements p194x6.j {

    public final int f1787h;

    public final int f1788i;
    public final Object j;

    public y(int i3, Object obj, int i9) {
        this.f1787h = i9;
        this.f1788i = i3;
        this.j = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1787h) {
            case 0:
                L l2 = (L) obj;
                C0194a c0194a = ((D) this.j).f1642a;
                p121o0.f fVarE = p121o0.o.e();
                p121o0.o.k(fVarE, p121o0.o.h(fVarE), fVarE != null ? fVarE.e() : null);
                int i3 = l2.f3355a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i9 = 0; i9 < i3; i9++) {
                    l2.a(this.f1788i + i9);
                }
                return p070h6.A.f22523a;
            case 1:
                L l9 = (L) obj;
                C0194a c0194a2 = ((E.w) this.j).f2714a;
                p121o0.f fVarE2 = p121o0.o.e();
                p121o0.o.k(fVarE2, p121o0.o.h(fVarE2), fVarE2 != null ? fVarE2.e() : null);
                c0194a2.getClass();
                int i10 = l9.f3355a;
                if (i10 == -1) {
                    i10 = 2;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    l9.a(this.f1788i + i11);
                }
                return p070h6.A.f22523a;
            case 2:
                ContentTypeSettings settings = (ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(settings, "settings");
                LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(settings.f19699m);
                int i12 = this.f1788i;
                String str = (String) this.j;
                if (i12 == 0) {
                    linkedHashMapZ0.remove(str);
                } else {
                    linkedHashMapZ0.put(str, Integer.valueOf(i12));
                }
                return ContentTypeSettings.a(settings, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMapZ0, null, 12287);
            case 3:
                return Boolean.valueOf(HttpHeadersMap.getAll$lambda$2((HttpHeadersMap) this.j, this.f1788i, ((Integer) obj).intValue()));
            case 4:
                return RawWebSocketCommonKt.mask$lambda$2(this.f1788i, (p094k8.n) this.j, (byte[]) obj);
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f1788i, (Collection) this.j));
        }
    }

    public y(Object obj, int i3, int i9) {
        this.f1787h = i9;
        this.j = obj;
        this.f1788i = i3;
    }
}
