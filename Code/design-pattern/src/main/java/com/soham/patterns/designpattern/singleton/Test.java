package com.soham.patterns.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DateUtil dateUtil = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\Study\\Java Design Patterns\\Code\\design-pattern\\Output.ser")));
        oos.writeObject(dateUtil);
        DateUtil dateUtil2 = DateUtil.getInstance();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:\\Study\\Java Design Patterns\\Code\\design-pattern\\Output.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        ois.close();
        oos.close();

        System.out.println(dateUtil == dateUtil2);

        Logger logger = Logger.getInstance();
        logger.log("This is first Statement");
    
        Logger logger2 = Logger.getInstance();
        logger2.log("This is second Statement");

    }
}
