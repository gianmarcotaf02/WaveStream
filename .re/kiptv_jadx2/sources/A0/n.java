package A0;

import android.view.RenderNode;

public abstract class n {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i3) {
        renderNode.setAmbientShadowColor(i3);
    }

    public static void d(RenderNode renderNode, int i3) {
        renderNode.setSpotShadowColor(i3);
    }
}
