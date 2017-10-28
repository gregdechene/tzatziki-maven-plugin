package com.tzatziki;

import com.itextpdf.text.DocumentException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.IOException;

/**
 * @goal generate-documentation
 */
public class TzatzikiMojo extends AbstractMojo {

    @Parameter(property = "documentation.path")
    private String path;

    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            new GenerationReport().generate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}