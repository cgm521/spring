package com.shiyanlou.dome.loosely_coupled;

/**
 * Created by cgm on 2017/10/11.
 */
public class OutputHelper {
    private IOutputGenerator outputGenerator;

    public void generateOutput() {
        this.outputGenerator.generateOutput();
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
