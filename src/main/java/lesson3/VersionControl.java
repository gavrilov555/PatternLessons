package lesson3;

import lesson3.ProjectFactory;

public class VersionControl {
    public static void main(String[] args) {

        Project master = new Project(1, "MyProject", "SourceCode sourceCode = new SourceCode()");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project cloneProject = factory.cloneProject();

        System.out.println("=========================");
        System.out.println(cloneProject);
    }
}
