package p184w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.d f29944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D3.d f29945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3.d f29946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D3.d f29947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D3.d[] f29948e;

    static {
        D3.d dVar = new D3.d("client_side_logging", 1L);
        D3.d dVar2 = new D3.d("cxless_client_minimal", 1L);
        f29944a = dVar2;
        D3.d dVar3 = new D3.d("cxless_caf_control", 1L);
        D3.d dVar4 = new D3.d("module_flag_control", 1L);
        f29945b = dVar4;
        D3.d dVar5 = new D3.d("discovery_hint_supply", 1L);
        D3.d dVar6 = new D3.d("relay_casting_set_active_account", 1L);
        D3.d dVar7 = new D3.d("analytics_proto_enum_translation", 1L);
        f29946c = dVar7;
        D3.d dVar8 = new D3.d("integer_to_integer_map", 1L);
        f29947d = dVar8;
        f29948e = new D3.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new D3.d("relay_casting_set_remote_casting_mode", 1L), new D3.d("get_relay_access_token", 1L), new D3.d("get_cast_settings", 1L), new D3.d("set_bundle_setting", 1L), new D3.d("get_client_updated_info", 1L)};
    }

    public static java.lang.String a(java.lang.String str) {
        if (str != null) {
            return p079i7.f.Y0(new p079i7.f(str, (java.lang.Object) null, 14));
        }
        throw new java.lang.IllegalArgumentException("applicationId cannot be null");
    }
}
