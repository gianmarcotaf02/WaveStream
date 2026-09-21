package org.videolan.libvlc.stubs;

import android.os.Handler;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

public class StubMediaList extends StubVLCObject<IMediaList.Event> implements IMediaList {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public IMedia getMediaAt(int i3) {
        return null;
    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public void setEventListener(IMediaList.EventListener eventListener, Handler handler) {
    }
}
