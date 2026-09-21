package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class K1 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J5.U1 f6168i;

    public /* synthetic */ K1(J5.U1 u1, int i3) {
        this.f6167h = i3;
        this.f6168i = u1;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        switch (this.f6167h) {
            case 0:
                com.kiptv.core.model.UserSettings userSettings = (com.kiptv.core.model.UserSettings) obj;
                V7.n0 n0Var = this.f6168i.f6283c;
                n0Var.i(null, J5.J1.a((J5.J1) n0Var.getValue(), userSettings.f20583f, userSettings.j, userSettings.g, userSettings.f20581d, userSettings.f20582e, userSettings.f20586k, userSettings.f20587l, userSettings.f20588m, userSettings.f20589n, null, null, false, null, null, null, false, false, null, null, null, null, null, null, false, null, false, false, false, 268434944));
                break;
            default:
                com.kiptv.core.model.LocalDeviceSettings localDeviceSettings = (com.kiptv.core.model.LocalDeviceSettings) obj;
                V7.n0 n0Var2 = this.f6168i.f6283c;
                n0Var2.i(null, J5.J1.a((J5.J1) n0Var2.getValue(), false, false, null, null, null, null, null, null, null, localDeviceSettings.f19833m, localDeviceSettings.f19834n, localDeviceSettings.f19835o, localDeviceSettings.f19836p, localDeviceSettings.f19823a, localDeviceSettings.f19824b, localDeviceSettings.f19825c, localDeviceSettings.f19826d, localDeviceSettings.f19829h, localDeviceSettings.f19830i, localDeviceSettings.j, localDeviceSettings.f19831k, localDeviceSettings.f19838r, localDeviceSettings.f19839s, localDeviceSettings.f19841u, null, false, false, false, 251658751));
                break;
        }
        return p070h6.A.f22523a;
    }
}
