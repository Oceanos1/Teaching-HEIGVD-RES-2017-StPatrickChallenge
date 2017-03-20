package ch.heigvd.res.stpatrick;


import java.io.Reader;
import java.io.Writer;

/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

  IStreamDecoratorController getStreamDecoratorController() {
    return new IStreamDecoratorController() {
      @Override
      public Reader decorateReader(Reader inputReader) {
        return inputReader;
      }

      @Override
      public Writer decorateWriter(Writer outputWriter) {
        return new CensorshipWriter(outputWriter);
      }
    };
  }
}
