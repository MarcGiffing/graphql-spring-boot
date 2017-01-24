package com.embedler.moon.graphql.boot.sample;

import java.util.List;

import com.embedler.moon.graphql.boot.sample.schema.objecttype.TodoObjectType;
import com.oembedler.moon.graphql.engine.relay.ConnectionObjectType;
import com.oembedler.moon.graphql.engine.relay.EdgeObjectType;

/**
 * @author <a href="mailto:java.lang.RuntimeException@gmail.com">oEmbedler Inc.</a>
 */
public class TodoSimpleListConnection extends SimpleListConnection {

    public TodoSimpleListConnection(List<?> data) {
        super(data);
    }

    public <T extends EdgeObjectType> T createEdgeObject() {
        return (T) new TodoObjectType.TodoEdgeObjectType();
    }

    public <T extends ConnectionObjectType> T createConnectionObject() {
        return (T) new TodoObjectType.TodoConnectionObjectType();
    }

}
