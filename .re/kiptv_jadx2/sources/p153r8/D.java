package p153r8;

import kotlinx.serialization.KSerializer;

public interface D extends KSerializer {
    KSerializer[] childSerializers();

    default KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
