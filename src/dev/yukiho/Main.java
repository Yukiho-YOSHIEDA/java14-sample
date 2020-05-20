package dev.yukiho;

import dev.yukiho.samples.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println("=====型推論=====");
        var typeInference = new TypeInference("Hello", "Yukiho");
        var message = typeInference.toString();
        out.println("Result: " + message);
        out.println("================");

        out.println();

        out.println("=====switch式=====");
        SwitchFormula.solve(1);
        SwitchFormula.solve(2);
        SwitchFormula.solve(3);
        out.println("================");

        out.println();

        out.println("=====テキストブロック=====");
        TextBlock.printText();
        out.println("================");

        out.println();

        out.println("=====Record型=====");
        var samplePointRecord = new SamplePointRecord(10, 10);
        var recordResult = samplePointRecord.toString();
        out.println("Result of Record: " + recordResult);
        var samplePointClass = new SamplePointClass(10, 10);
        var classResult = samplePointClass.toString();
        out.println("Result of Class: " + classResult);
        out.println("================");
    }
}
