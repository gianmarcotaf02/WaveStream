package H2;

import M8.A;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;

public final class u implements j {

    public final p028c8.j f3913a;

    public u(p028c8.j jVar) {
        this.f3913a = jVar;
    }

    @Override
    public final k a(J2.i iVar, S2.o oVar) {
        ImageDecoder.Source sourceCreateSource;
        A aL;
        Bitmap.Config configB = S2.j.b(oVar);
        if (configB == Bitmap.Config.ARGB_8888 || configB == Bitmap.Config.HARDWARE) {
            q qVar = iVar.f6009a;
            if (qVar.K() != M8.q.f7275h || (aL = qVar.L()) == null) {
                O2.g metadata = qVar.getMetadata();
                boolean z6 = metadata instanceof a;
                Context context = oVar.f9284a;
                if (z6) {
                    sourceCreateSource = ImageDecoder.createSource(context.getAssets(), ((a) metadata).f3872l);
                } else if ((metadata instanceof g) && Build.VERSION.SDK_INT >= 29) {
                    try {
                        final AssetFileDescriptor assetFileDescriptor = ((g) metadata).f3885l;
                        Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                        sourceCreateSource = ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() {
                            @Override
                            public final Object call() {
                                return assetFileDescriptor;
                            }
                        });
                    } catch (ErrnoException unused) {
                        sourceCreateSource = null;
                    }
                } else if (metadata instanceof r) {
                    r rVar = (r) metadata;
                    if (rVar.f3907l.equals(context.getPackageName())) {
                        sourceCreateSource = ImageDecoder.createSource(context.getResources(), rVar.f3908m);
                    } else if (metadata instanceof f) {
                        sourceCreateSource = ImageDecoder.createSource(((f) metadata).f3884l);
                    } else {
                        sourceCreateSource = null;
                    }
                } else if (metadata instanceof f) {
                    sourceCreateSource = ImageDecoder.createSource(((f) metadata).f3884l);
                } else {
                    sourceCreateSource = null;
                }
            } else {
                sourceCreateSource = ImageDecoder.createSource(aL.f());
            }
            if (sourceCreateSource != null) {
                return new y(sourceCreateSource, iVar.f6009a, oVar, this.f3913a);
            }
        }
        return null;
    }
}
