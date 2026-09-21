package D5;

import com.kiptv.core.model.XtreamLiveStream;

public final class C0262p implements p194x6.j {

    public final int f2370h;

    public final p194x6.j f2371i;
    public final p020c0.X j;

    public C0262p(int i3, p020c0.X x9, p194x6.j jVar) {
        this.f2370h = i3;
        this.f2371i = jVar;
        this.j = x9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2370h) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.j.setValue(bool);
                this.f2371i.invoke(bool);
                break;
            case 1:
                XtreamLiveStream channel = (XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(channel, "channel");
                this.j.setValue(null);
                this.f2371i.invoke(channel);
                break;
            case 2:
                S4.p group = (S4.p) obj;
                kotlin.jvm.internal.m.e(group, "group");
                if (group.c()) {
                    this.j.setValue(group);
                } else {
                    this.f2371i.invoke(group.e());
                }
                break;
            case 3:
                p175v0.C state = (p175v0.C) obj;
                kotlin.jvm.internal.m.e(state, "state");
                p175v0.D d4 = (p175v0.D) state;
                boolean zB = d4.b();
                p020c0.X x9 = this.j;
                if (zB != ((Boolean) x9.getValue()).booleanValue()) {
                    x9.setValue(Boolean.valueOf(d4.b()));
                    this.f2371i.invoke(Boolean.valueOf(d4.b()));
                }
                break;
            case 4:
                String name = (String) obj;
                kotlin.jvm.internal.m.e(name, "name");
                this.j.setValue(Boolean.FALSE);
                this.f2371i.invoke(name);
                break;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.j.setValue(bool2);
                this.f2371i.invoke(bool2);
                break;
            default:
                XtreamLiveStream channel2 = (XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(channel2, "channel");
                this.j.setValue(null);
                this.f2371i.invoke(Integer.valueOf(channel2.f20657d));
                break;
        }
        return p070h6.A.f22523a;
    }
}
