package X3;

public abstract class e {

    public static final D3.d f10847a;

    public static final D3.d f10848b;

    public static final D3.d[] f10849c;

    static {
        D3.d dVar = new D3.d("auth_api_credentials_begin_sign_in", 9L);
        D3.d dVar2 = new D3.d("auth_api_credentials_sign_out", 2L);
        D3.d dVar3 = new D3.d("auth_api_credentials_authorize", 1L);
        D3.d dVar4 = new D3.d("auth_api_credentials_revoke_access", 1L);
        D3.d dVar5 = new D3.d("auth_api_credentials_save_password", 4L);
        f10847a = dVar5;
        D3.d dVar6 = new D3.d("auth_api_credentials_get_sign_in_intent", 6L);
        f10848b = dVar6;
        f10849c = new D3.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, new D3.d("auth_api_credentials_save_account_linking_token", 3L), new D3.d("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
