package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public interface D extends kotlinx.serialization.KSerializer {
    kotlinx.serialization.KSerializer[] childSerializers();

    default kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
