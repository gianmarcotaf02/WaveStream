package K1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.credentials.playservices.HiddenActivity f6766i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(androidx.credentials.playservices.HiddenActivity hiddenActivity, int i3, int i9) {
        super(1);
        this.f6765h = i9;
        this.f6766i = hiddenActivity;
        this.j = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f6765h) {
            case 0:
                androidx.credentials.playservices.HiddenActivity hiddenActivity = this.f6766i;
                p148r3.f fVar = (p148r3.f) obj;
                try {
                    hiddenActivity.f16116i = true;
                    hiddenActivity.startIntentSenderForResult(fVar.f26846h.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (android.content.IntentSender.SendIntentException e6) {
                    android.os.ResultReceiver resultReceiver = hiddenActivity.f16115h;
                    kotlin.jvm.internal.m.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e6.getMessage());
                }
                break;
            case 1:
                androidx.credentials.playservices.HiddenActivity hiddenActivity2 = this.f6766i;
                p148r3.i iVar = (p148r3.i) obj;
                try {
                    hiddenActivity2.f16116i = true;
                    hiddenActivity2.startIntentSenderForResult(iVar.f26854h.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (android.content.IntentSender.SendIntentException e9) {
                    android.os.ResultReceiver resultReceiver2 = hiddenActivity2.f16115h;
                    kotlin.jvm.internal.m.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e9.getMessage());
                }
                break;
            case 2:
                androidx.credentials.playservices.HiddenActivity hiddenActivity3 = this.f6766i;
                android.app.PendingIntent result = (android.app.PendingIntent) obj;
                kotlin.jvm.internal.m.e(result, "result");
                try {
                    hiddenActivity3.f16116i = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (android.content.IntentSender.SendIntentException e10) {
                    android.os.ResultReceiver resultReceiver3 = hiddenActivity3.f16115h;
                    kotlin.jvm.internal.m.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
                }
                break;
            default:
                androidx.credentials.playservices.HiddenActivity hiddenActivity4 = this.f6766i;
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) obj;
                try {
                    hiddenActivity4.f16116i = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (android.content.IntentSender.SendIntentException e11) {
                    android.os.ResultReceiver resultReceiver4 = hiddenActivity4.f16115h;
                    kotlin.jvm.internal.m.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e11.getMessage());
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
