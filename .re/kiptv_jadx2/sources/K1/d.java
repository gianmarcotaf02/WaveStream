package K1;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p148r3.f;
import p148r3.i;
import p194x6.j;

public final class d extends o implements j {

    public final int f6765h;

    public final HiddenActivity f6766i;
    public final int j;

    public d(HiddenActivity hiddenActivity, int i3, int i9) {
        super(1);
        this.f6765h = i9;
        this.f6766i = hiddenActivity;
        this.j = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f6765h) {
            case 0:
                HiddenActivity hiddenActivity = this.f6766i;
                f fVar = (f) obj;
                try {
                    hiddenActivity.f16116i = true;
                    hiddenActivity.startIntentSenderForResult(fVar.f26846h.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e6) {
                    ResultReceiver resultReceiver = hiddenActivity.f16115h;
                    m.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e6.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.f6766i;
                i iVar = (i) obj;
                try {
                    hiddenActivity2.f16116i = true;
                    hiddenActivity2.startIntentSenderForResult(iVar.f26854h.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e9) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f16115h;
                    m.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e9.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.f6766i;
                PendingIntent result = (PendingIntent) obj;
                m.e(result, "result");
                try {
                    hiddenActivity3.f16116i = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f16115h;
                    m.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.f6766i;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f16116i = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f16115h;
                    m.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e11.getMessage());
                }
                break;
        }
        return A.f22523a;
    }
}
