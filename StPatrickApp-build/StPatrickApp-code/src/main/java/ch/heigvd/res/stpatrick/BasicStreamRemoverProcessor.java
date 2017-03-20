package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by Michael on 20.03.2017.
 */
public class BasicStreamRemoverProcessor implements IStreamProcessor{

    @Override
    public void process(Reader in, Writer out) throws IOException {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }
        bw.flush();
        br.close();
        bw.close();
    }
}


