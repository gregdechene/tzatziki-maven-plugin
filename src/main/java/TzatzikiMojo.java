package main.java;

        import org.apache.maven.plugin.AbstractMojo;
        import org.apache.maven.plugin.MojoExecutionException;
        import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal generate-documentation
 */
public class TzatzikiMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello World!");
    }
}
