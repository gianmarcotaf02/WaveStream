package p035d7;

import kotlin.jvm.internal.m;
import p070h6.A;

public final class j implements p194x6.j {

    public final int f21269h;

    public final String f21270i;
    public final String j;

    public j(String str, String str2, int i3) {
        this.f21269h = i3;
        this.f21270i = str;
        this.j = str2;
    }

    @Override
    public final Object invoke(Object obj) {
        o function = (o) obj;
        switch (this.f21269h) {
            case 0:
                m.e(function, "$this$function");
                d dVar = l.f21274b;
                String str = this.f21270i;
                function.a(str, dVar);
                d dVar2 = l.f21273a;
                function.a(this.j, dVar, dVar, dVar2, dVar2);
                function.b(str, dVar2);
                break;
            case 1:
                m.e(function, "$this$function");
                d dVar3 = l.f21274b;
                String str2 = this.f21270i;
                function.a(str2, dVar3);
                function.a(this.j, dVar3, dVar3, dVar3);
                function.b(str2, dVar3);
                break;
            case 2:
                m.e(function, "$this$function");
                d dVar4 = l.f21274b;
                String str3 = this.f21270i;
                function.a(str3, dVar4);
                d dVar5 = l.f21275c;
                d dVar6 = l.f21273a;
                function.a(this.j, dVar4, dVar4, dVar5, dVar6);
                function.b(str3, dVar6);
                break;
            case 3:
                m.e(function, "$this$function");
                d dVar7 = l.f21274b;
                String str4 = this.f21270i;
                function.a(str4, dVar7);
                d dVar8 = l.f21275c;
                function.a(str4, dVar8);
                d dVar9 = l.f21273a;
                function.a(this.j, dVar7, dVar8, dVar8, dVar9);
                function.b(str4, dVar9);
                break;
            case 4:
                m.e(function, "$this$function");
                d dVar10 = l.f21275c;
                function.a(this.f21270i, dVar10);
                function.b(this.j, l.f21274b, dVar10);
                break;
            default:
                m.e(function, "$this$function");
                function.a(this.f21270i, l.f21273a);
                function.b(this.j, l.f21274b, l.f21275c);
                break;
        }
        return A.f22523a;
    }
}
