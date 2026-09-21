package p005a5;

import V7.W;
import V7.n0;
import V7.r;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import p006a6.b;

public final class I6 {
    public static final H6 Companion = new H6();

    public final C1263e6 f13518a;

    public final b f13519b;

    public final C1291h4 f13520c;

    public final n0 f13521d;

    public final W f13522e;

    public final HashSet f13523f;

    public I6(C1263e6 account, b sync, C1291h4 settingsRepository) {
        m.e(account, "account");
        m.e(sync, "sync");
        m.e(settingsRepository, "settingsRepository");
        this.f13518a = account;
        this.f13519b = sync;
        this.f13520c = settingsRepository;
        n0 n0VarB = r.b(null);
        this.f13521d = n0VarB;
        this.f13522e = new W(n0VarB);
        this.f13523f = new HashSet();
    }
}
