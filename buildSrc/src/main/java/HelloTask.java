import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.*;

public class HelloTask extends DefaultTask{

  @TaskAction
  public void hello(){
    System.out.println("hello");
  }

}