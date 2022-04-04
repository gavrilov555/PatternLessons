package lesson4;

public class ProjectRunner {
    public static void main(String[] args) {

        Project project = new ProxyProject("https://github.com/gavrilov555/realProject");

        project.run();
    }
}
