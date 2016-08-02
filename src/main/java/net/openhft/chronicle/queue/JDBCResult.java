package net.openhft.chronicle.queue;

import java.util.List;

/**
 * Created by peter on 06/04/16.
 */
public interface JDBCResult {
    void queryResult(List<String> columns, List<List<Object>> rows, String query, Object... args);

    void queryThrown(Throwable t, String query, Object... args);

    void updateResult(long count, String update, Object... args);

    void updateThrown(Throwable t, String update, Object... args);
}
