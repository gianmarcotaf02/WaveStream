package org.videolan.libvlc;

import android.content.Context;
import java.util.List;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.ILibVLCFactory;

public class LibVLCFactory implements ILibVLCFactory {
    static {
        FactoryManager.registerFactory(ILibVLCFactory.factoryId, new LibVLCFactory());
    }

    @Override
    public ILibVLC getFromContext(Context context) {
        return new LibVLC(context, null);
    }

    @Override
    public ILibVLC getFromOptions(Context context, List<String> list) {
        return new LibVLC(context, list);
    }
}
