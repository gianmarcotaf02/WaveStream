package A0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static int a(android.view.RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(android.view.RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(android.view.RenderNode renderNode, int i3) {
        renderNode.setAmbientShadowColor(i3);
    }

    public static void d(android.view.RenderNode renderNode, int i3) {
        renderNode.setSpotShadowColor(i3);
    }
}
