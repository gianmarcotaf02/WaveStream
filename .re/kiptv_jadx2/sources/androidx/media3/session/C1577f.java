package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.MediaItem;

public final class C1577f implements p068h4.j {

    public final int f17016a;

    public final int f17017b;

    public C1577f(int i3, int i9) {
        this.f17016a = i9;
        this.f17017b = i3;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f17016a) {
            case 0:
                return ConnectionState.lambda$fromBundle$4(this.f17017b, (Bundle) obj);
            case 1:
                return ConnectionState.lambda$fromBundle$5(this.f17017b, (Bundle) obj);
            case 2:
                return ConnectionState.lambda$fromBundle$6(this.f17017b, (Bundle) obj);
            case 3:
                return ConnectionState.lambda$toBundleForRemoteProcess$0(this.f17017b, (CommandButton) obj);
            case 4:
                return ConnectionState.lambda$toBundleForRemoteProcess$1(this.f17017b, (CommandButton) obj);
            case 5:
                return ConnectionState.lambda$toBundleForRemoteProcess$2(this.f17017b, (CommandButton) obj);
            case 6:
                return ConnectionState.lambda$toBundleForRemoteProcess$3(this.f17017b, (CommandButton) obj);
            case 7:
                return LibraryResult.lambda$fromBundle$1(this.f17017b, (Bundle) obj);
            default:
                return LibraryResult.lambda$toBundle$0(this.f17017b, (MediaItem) obj);
        }
    }
}
