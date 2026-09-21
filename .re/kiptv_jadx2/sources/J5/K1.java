package J5;

import V7.InterfaceC0982h;
import com.kiptv.core.model.LocalDeviceSettings;
import com.kiptv.core.model.UserSettings;

public final class K1 implements InterfaceC0982h {

    public final int f6167h;

    public final U1 f6168i;

    public K1(U1 u1, int i3) {
        this.f6167h = i3;
        this.f6168i = u1;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        switch (this.f6167h) {
            case 0:
                UserSettings userSettings = (UserSettings) obj;
                V7.n0 n0Var = this.f6168i.f6283c;
                n0Var.i(null, J1.a((J1) n0Var.getValue(), userSettings.f20583f, userSettings.j, userSettings.g, userSettings.f20581d, userSettings.f20582e, userSettings.f20586k, userSettings.f20587l, userSettings.f20588m, userSettings.f20589n, null, null, false, null, null, null, false, false, null, null, null, null, null, null, false, null, false, false, false, 268434944));
                break;
            default:
                LocalDeviceSettings localDeviceSettings = (LocalDeviceSettings) obj;
                V7.n0 n0Var2 = this.f6168i.f6283c;
                n0Var2.i(null, J1.a((J1) n0Var2.getValue(), false, false, null, null, null, null, null, null, null, localDeviceSettings.f19833m, localDeviceSettings.f19834n, localDeviceSettings.f19835o, localDeviceSettings.f19836p, localDeviceSettings.f19823a, localDeviceSettings.f19824b, localDeviceSettings.f19825c, localDeviceSettings.f19826d, localDeviceSettings.f19829h, localDeviceSettings.f19830i, localDeviceSettings.j, localDeviceSettings.f19831k, localDeviceSettings.f19838r, localDeviceSettings.f19839s, localDeviceSettings.f19841u, null, false, false, false, 251658751));
                break;
        }
        return p070h6.A.f22523a;
    }
}
