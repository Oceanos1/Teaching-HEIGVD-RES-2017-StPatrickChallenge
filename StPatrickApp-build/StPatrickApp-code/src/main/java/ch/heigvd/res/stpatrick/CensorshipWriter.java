package ch.heigvd.res.stpatrick;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Michael on 20.03.2017.
 */
public class CensorshipWriter extends FilterWriter{

    protected CensorshipWriter(Writer out) {
        super(out);
    }


    @Override
    public void write(String str, int off, int len) throws IOException {
        write(str.toCharArray(), off, len);
    }

    @Override
    public void write(char cbuf[], int off, int len) throws IOException {
        for (int i = 0; i < len; ++i) {
            write((int) cbuf[off + i]);
        }
    }

    @Override
    public void write(int c) throws IOException {
        if(c != 'A' && c != 'a') {
            out.write(c);
        }
    }


}

