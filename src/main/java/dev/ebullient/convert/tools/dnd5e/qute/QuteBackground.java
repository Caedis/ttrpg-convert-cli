package dev.ebullient.convert.tools.dnd5e.qute;

import java.util.Collection;
import java.util.List;

import dev.ebullient.convert.qute.ImageRef;
import dev.ebullient.convert.tools.dnd5e.Tools5eSources;
import io.quarkus.qute.TemplateData;
import io.quarkus.runtime.annotations.RegisterForReflection;

@TemplateData
@RegisterForReflection
public class QuteBackground extends Tools5eQuteBase {

    final List<ImageRef> images;

    public QuteBackground(Tools5eSources sources,
            String name, String source, String text,
            List<ImageRef> images,
            Collection<String> tags) {
        super(sources, name, source, text, tags);
        this.images = images;
    }

    @Override
    public String targetPath() {
        return Tools5eQuteBase.BACKGROUND_PATH;
    }

    @Override
    public List<ImageRef> images() { // not usable by Qute templates
        return images;
    }

    public List<ImageRef> getFluffImages() {
        return images;
    }
}
