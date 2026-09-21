package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class FactoryManager {
    private static java.util.Map<java.lang.String, org.videolan.libvlc.interfaces.IComponentFactory> factories = new java.util.HashMap();

    public static org.videolan.libvlc.interfaces.IComponentFactory getFactory(java.lang.String str) {
        org.videolan.libvlc.interfaces.IComponentFactory iComponentFactory = factories.get(str);
        if (iComponentFactory != null) {
            return iComponentFactory;
        }
        android.util.Log.e("FactoryManager", "Factory doesn't exist. Falling back to hard coded one");
        java.lang.String str2 = org.videolan.libvlc.interfaces.IMediaFactory.factoryId;
        if (str.equals(str2)) {
            registerFactory(str2, new org.videolan.libvlc.MediaFactory());
        }
        java.lang.String str3 = org.videolan.libvlc.interfaces.ILibVLCFactory.factoryId;
        if (str.equals(str3)) {
            registerFactory(str3, new org.videolan.libvlc.LibVLCFactory());
        }
        return factories.get(str);
    }

    public static void registerFactory(java.lang.String str, org.videolan.libvlc.interfaces.IComponentFactory iComponentFactory) {
        factories.put(str, iComponentFactory);
    }
}
