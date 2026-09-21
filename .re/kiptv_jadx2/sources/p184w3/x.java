package p184w3;

import D3.d;
import p079i7.f;

public abstract class x {

    public static final d f29944a;

    public static final d f29945b;

    public static final d f29946c;

    public static final d f29947d;

    public static final d[] f29948e;

    static {
        d dVar = new d("client_side_logging", 1L);
        d dVar2 = new d("cxless_client_minimal", 1L);
        f29944a = dVar2;
        d dVar3 = new d("cxless_caf_control", 1L);
        d dVar4 = new d("module_flag_control", 1L);
        f29945b = dVar4;
        d dVar5 = new d("discovery_hint_supply", 1L);
        d dVar6 = new d("relay_casting_set_active_account", 1L);
        d dVar7 = new d("analytics_proto_enum_translation", 1L);
        f29946c = dVar7;
        d dVar8 = new d("integer_to_integer_map", 1L);
        f29947d = dVar8;
        f29948e = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new d("relay_casting_set_remote_casting_mode", 1L), new d("get_relay_access_token", 1L), new d("get_cast_settings", 1L), new d("set_bundle_setting", 1L), new d("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return f.Y0(new f(str, (Object) null, 14));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
