package net.media.training.live.dip;

import java.util.List;
/*
 we can decompose further by creating Reader class as Interface
 and implements different types of reader from file,database etc.
 */
public interface Reader {
    List<String> read();
}
