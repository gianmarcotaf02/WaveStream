package p035d7;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f21270i;
    public final java.lang.String j;

    public /* synthetic */ j(java.lang.String str, java.lang.String str2, int i3) {
        this.f21269h = i3;
        this.f21270i = str;
        this.j = str2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p035d7.o function = (p035d7.o) obj;
        switch (this.f21269h) {
            case 0:
                kotlin.jvm.internal.m.e(function, "$this$function");
                p035d7.d dVar = p035d7.l.f21274b;
                java.lang.String str = this.f21270i;
                function.a(str, dVar);
                p035d7.d dVar2 = p035d7.l.f21273a;
                function.a(this.j, dVar, dVar, dVar2, dVar2);
                function.b(str, dVar2);
                break;
            case 1:
                kotlin.jvm.internal.m.e(function, "$this$function");
                p035d7.d dVar3 = p035d7.l.f21274b;
                java.lang.String str2 = this.f21270i;
                function.a(str2, dVar3);
                function.a(this.j, dVar3, dVar3, dVar3);
                function.b(str2, dVar3);
                break;
            case 2:
                kotlin.jvm.internal.m.e(function, "$this$function");
                p035d7.d dVar4 = p035d7.l.f21274b;
                java.lang.String str3 = this.f21270i;
                function.a(str3, dVar4);
                p035d7.d dVar5 = p035d7.l.f21275c;
                p035d7.d dVar6 = p035d7.l.f21273a;
                function.a(this.j, dVar4, dVar4, dVar5, dVar6);
                function.b(str3, dVar6);
                break;
            case 3:
                kotlin.jvm.internal.m.e(function, "$this$function");
                p035d7.d dVar7 = p035d7.l.f21274b;
                java.lang.String str4 = this.f21270i;
                function.a(str4, dVar7);
                p035d7.d dVar8 = p035d7.l.f21275c;
                function.a(str4, dVar8);
                p035d7.d dVar9 = p035d7.l.f21273a;
                function.a(this.j, dVar7, dVar8, dVar8, dVar9);
                function.b(str4, dVar9);
                break;
            case 4:
                kotlin.jvm.internal.m.e(function, "$this$function");
                p035d7.d dVar10 = p035d7.l.f21275c;
                function.a(this.f21270i, dVar10);
                function.b(this.j, p035d7.l.f21274b, dVar10);
                break;
            default:
                kotlin.jvm.internal.m.e(function, "$this$function");
                function.a(this.f21270i, p035d7.l.f21273a);
                function.b(this.j, p035d7.l.f21274b, p035d7.l.f21275c);
                break;
        }
        return p070h6.A.f22523a;
    }
}
