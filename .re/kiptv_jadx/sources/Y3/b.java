package Y3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.d f11520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D3.d f11521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3.d f11522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D3.d f11523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D3.d[] f11524e;

    static {
        D3.d dVar = new D3.d("auth_blockstore", 3L);
        D3.d dVar2 = new D3.d("blockstore_data_transfer", 1L);
        D3.d dVar3 = new D3.d("blockstore_notify_app_restore", 1L);
        D3.d dVar4 = new D3.d("blockstore_store_bytes_with_options", 2L);
        f11520a = dVar4;
        D3.d dVar5 = new D3.d("blockstore_is_end_to_end_encryption_available", 1L);
        D3.d dVar6 = new D3.d("blockstore_enable_cloud_backup", 1L);
        f11521b = dVar6;
        D3.d dVar7 = new D3.d("blockstore_delete_bytes", 2L);
        f11522c = dVar7;
        D3.d dVar8 = new D3.d("blockstore_retrieve_bytes_with_options", 3L);
        f11523d = dVar8;
        f11524e = new D3.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new D3.d("auth_clear_restore_credential", 1L), new D3.d("auth_create_restore_credential", 1L), new D3.d("auth_get_restore_credential", 1L)};
    }
}
