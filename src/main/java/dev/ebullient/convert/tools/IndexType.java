package dev.ebullient.convert.tools;

public interface IndexType {

    String name();

    String templateName();

    String defaultSourceString();

    enum IndexElement implements JsonNodeReader {
        name,
        source,
    }
}
